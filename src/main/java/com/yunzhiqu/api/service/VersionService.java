package com.yunzhiqu.api.service;

import com.yunzhiqu.api.base.ResponseDefine;
import com.yunzhiqu.api.base.ServiceResponse;
import com.yunzhiqu.api.dao.mapper.TVersionInfoMapper;
import com.yunzhiqu.api.datasource.utils.ServiceException;
import com.yunzhiqu.api.modal.TVersionInfo;
import com.yunzhiqu.api.modal.TVersionInfoExample;
import com.yunzhiqu.api.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class VersionService {

    @Autowired
    TVersionInfoMapper versionInfoMapper;

    public int addVersionInfo(int os_type, int edition_no,String version_no, String official_site, String login_addr, int version_enable, int need_update, Date b_time,Date e_time,String version_key,int deviationtime,String control_addr)throws ServiceException {
        TVersionInfo versionInfo = new TVersionInfo();
        versionInfo.setOsType(os_type);
        versionInfo.setEditionNo(edition_no);
        versionInfo.setVersionNo(version_no);
        versionInfo.setOfficialSite(official_site);
        versionInfo.setLoginAddr(login_addr);
        versionInfo.setVersionEnable(version_enable);
        versionInfo.setNeedUpdate(need_update);
        versionInfo.setbTime(b_time);
        versionInfo.seteTime(e_time);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        //versionInfo.setVersionKey(MD5.md5(version_no+df.format(new Date())));
        versionInfo.setVersionKey(version_key);
        versionInfo.setVersionlock(java.util.UUID.randomUUID().toString());
        versionInfo.setDeviationtime(deviationtime);
        versionInfo.setControlAddr(control_addr);
        return versionInfoMapper.insert(versionInfo);
    }

    @Transactional(rollbackFor = Exception.class)
    public int updateVersionInfo(int os_type, int edition_no,String version_no, String official_site, String login_addr, int version_enable, int need_update, Date b_time,Date e_time,String version_key,int deviationtime,String control_addr)throws ServiceException {
        TVersionInfo versionInfo = getVersionInfo(os_type,edition_no,version_no);

        TVersionInfoExample ex= new TVersionInfoExample();
        TVersionInfoExample.Criteria ec = ex.createCriteria();
        ec.andIdEqualTo(versionInfo.getId());
        ec.andVersionlockEqualTo(versionInfo.getVersionlock());


        String lock = versionInfo.getVersionlock();
        String newlock = java.util.UUID.randomUUID().toString();
        if(versionInfo ==null)
        {
            return 0;
        }
        versionInfo.setOsType(os_type);
        versionInfo.setEditionNo(edition_no);
        versionInfo.setVersionNo(version_no);
        versionInfo.setOfficialSite(official_site);
        versionInfo.setLoginAddr(login_addr);
        versionInfo.setVersionEnable(version_enable);
        versionInfo.setNeedUpdate(need_update);
        versionInfo.setbTime(b_time);
        versionInfo.seteTime(e_time);
        versionInfo.setControlAddr(control_addr);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
//        versionInfo.setVersionKey(MD5.md5(version_no+df.format(new Date())));
        versionInfo.setVersionKey(version_key);
        versionInfo.setVersionlock(newlock);
        versionInfo.setDeviationtime(deviationtime);
        return versionInfoMapper.updateByExampleSelective(versionInfo,ex);
    }

    public TVersionInfo getVersionInfo(int os_type, int edition_no,String version_no){
        TVersionInfoExample ex= new TVersionInfoExample();
        TVersionInfoExample.Criteria ec = ex.createCriteria();
        ec.andOsTypeEqualTo(os_type);
        ec.andVersionNoEqualTo(version_no);
        ec.andEditionNoEqualTo(edition_no);

        List<TVersionInfo> versionInfos= versionInfoMapper.selectByExample(ex);
        if(versionInfos !=null && versionInfos.size()>0)
        {
            return versionInfos.get(0);
        }
        return null;
    }

    public ServiceResponse getVersionDetail(int os_type, int edition_no, String version_no,Date curtime,String version_key,String cur_time_str){
        ServiceResponse response = new ServiceResponse();
        Map map = new HashMap();
        TVersionInfo versionInfo = getVersionInfo(os_type,edition_no,version_no);
        if(versionInfo ==null)
        {
            response.code= ResponseDefine.Nodate;
            response.msg="无效版本号";
            map.put("msg","无效版本号");
            map.put("official_site","http://www.yunzhiqu.com");
            response.info=map;
            return response;
        }
        String key= MD5.md5(versionInfo.getVersionKey()+cur_time_str);
        Date now = new Date();
        long interval = (now.getTime() - curtime.getTime())/1000;


        if(!(version_key.equals(key) && Math.abs(interval)<=versionInfo.getDeviationtime()))
        {

            response.code= ResponseDefine.Novalidate;
            response.msg="token验证失败，错误版本或盗版";
            map.put("msg","token验证失败，错误版本或盗版");
            map.put("official_site","http://www.yunzhiqu.com");
            response.info=map;
            return response;
        }

        response.code= ResponseDefine.Success;
        int enable = versionInfo.getVersionEnable();
        int needupdate = versionInfo.getNeedUpdate();
        if(enable ==1 )
        {

            if(needupdate ==0)
            {
                map.put("msg","当前版本为最高版本");
            }else {
                map.put("msg","当前版本有可更新版本");
            }
            map.put("official_site",versionInfo.getOfficialSite());
            Map map2 = new HashMap();
            map2.put("login_addr",versionInfo.getLoginAddr());
            Map map3 = new HashMap();
            map3.put("version_enable",true);
            map3.put("login_info",map2);
            map3.put("need_update",needupdate==0?false:true);
            map.put("version_info",map3);
            response.info=map;
        }else {
            map.put("msg","当前版本不支持");
            map.put("official_site",versionInfo.getOfficialSite());
            Map map3 = new HashMap();
            map3.put("version_enable",false);
            map3.put("need_update",false);
            map.put("version_info",map3);
            response.info=map;
        }

        return response;
    }

    public ServiceResponse checkVersionDetail(int os_type, int edition_no, String version_no,Date curtime,String version_key,String cur_time_str){
        ServiceResponse response = new ServiceResponse();
        Map map = new HashMap();
        TVersionInfo versionInfo = getVersionInfo(os_type,edition_no,version_no);
        if(versionInfo ==null)
        {
            response.code= ResponseDefine.Nodate;
            response.msg="无效版本号";
            map.put("msg","无效版本号");
            map.put("failed_hint","版本无效，谨防盗版!");
            response.info=map;
            return response;
        }
        String key= MD5.md5(versionInfo.getVersionKey()+cur_time_str);
        Date now = new Date();
        long interval = (now.getTime() - curtime.getTime())/1000;


        if(!(version_key.equals(key) && Math.abs(interval)<=versionInfo.getDeviationtime()))
        {

            response.code= ResponseDefine.Novalidate;
            response.msg="签名认证失败";
            map.put("msg","签名认证失败");
            map.put("failed_hint","版本无效，谨防盗版!");
            response.info=map;
            return response;
        }

        response.code= ResponseDefine.Success;
        response.msg="查询成功";
        map.put("msg","查询成功");
        map.put("control_addr",versionInfo.getControlAddr());
        response.info=map;

        return response;
    }

}