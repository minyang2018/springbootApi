package com.yunzhiqu.api.controller;

import com.yunzhiqu.api.base.ResponseDefine;
import com.yunzhiqu.api.base.ServiceResponse;
import com.yunzhiqu.api.service.VersionService;
import com.yunzhiqu.api.utils.ParamUtil;
import com.yunzhiqu.api.utils.ResUtil;
import com.yunzhiqu.api.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(value ="version_info")
public class VersionController {
    @Autowired
    VersionService versionService;


    /**
     * 新增版本信息
     * @param os_type
     * @param edition_no
     * @param version_no
     * @param req
     * @return
     */
    @RequestMapping(value = "/add")
    public String addVersionInfo(@RequestParam("os_type") int os_type,@RequestParam("edition_no") int edition_no,@RequestParam("version_no") String version_no,HttpServletRequest req) {
        try {
            String official_site = ParamUtil.getString(req, "official_site", "");
            String login_addr = ParamUtil.getString(req, "login_addr", "");
            int version_enable = ParamUtil.getInt(req, "version_enable", 1);
            int need_update = ParamUtil.getInt(req, "need_update", 0);
            int deviationtime = ParamUtil.getInt(req, "deviationtime", 0);
            String b_time = ParamUtil.getString(req, "b_time", "");
            String e_time = ParamUtil.getString(req, "e_time", "");
            String version_key = ParamUtil.getString(req, "version_key", "");
            String control_addr = ParamUtil.getString(req, "control_addr", "");
            Date b_date = null;
            Date e_date = null;
            if(os_type !=1 &&  os_type !=2 &&  os_type !=3 &&  os_type !=4 &&  os_type !=5)
            {
                return ResUtil.convert(ResponseDefine.Novalidate, "false", "os_type类型不正确");
            }
            if(edition_no !=1 &&  edition_no !=2 &&  edition_no !=3)
            {
                return ResUtil.convert(ResponseDefine.Novalidate, "false", "edition_no类型不正确");
            }
            if(!StringUtil.isBlank(b_time))
            {
                DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
                try {
                    b_date = format.parse(b_time);
                } catch (Exception e) {
                    return ResUtil.convert(ResponseDefine.Novalidate, "false", "b_time格式不正确");
                }
            }
            if(!StringUtil.isBlank(e_time))
            {
                DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
                try {
                    e_date = format.parse(e_time);
                } catch (Exception e) {
                    return ResUtil.convert(ResponseDefine.Novalidate, "false", "e_time格式不正确");
                }
            }

            versionService.addVersionInfo(os_type,edition_no,version_no,
                    official_site,login_addr,version_enable,need_update,b_date,e_date,version_key,deviationtime,control_addr);
            return ResUtil.convert(ResponseDefine.Success, "success", 0);
        }catch (Exception e){
            e.printStackTrace();
            return ResUtil.convert(ResponseDefine.Exception, "false","系統正在休息，请稍后再试");
        }
    }

    @RequestMapping(value = "/update")
    public String updateVersionInfo(@RequestParam("os_type") int os_type,@RequestParam("edition_no") int edition_no,@RequestParam("version_no") String version_no,HttpServletRequest req) {
        try {

            String official_site = ParamUtil.getString(req, "official_site", "");
            String login_addr = ParamUtil.getString(req, "login_addr", "");
            int version_enable = ParamUtil.getInt(req, "version_enable", 1);
            int need_update = ParamUtil.getInt(req, "need_update", 0);
            String b_time = ParamUtil.getString(req, "b_time", "");
            String e_time = ParamUtil.getString(req, "e_time", "");
            String version_key = ParamUtil.getString(req, "version_key", "");
            int deviationtime = ParamUtil.getInt(req, "deviationtime", 0);
            String control_addr = ParamUtil.getString(req, "control_addr", "");
            Date b_date = null;
            Date e_date = null;
            if(os_type !=1 &&  os_type !=2 &&  os_type !=3 &&  os_type !=4 &&  os_type !=5)
            {
                return ResUtil.convert(ResponseDefine.Novalidate, "false", "os_type类型不正确");
            }
            if(edition_no !=1 &&  edition_no !=2 &&  edition_no !=3)
            {
                return ResUtil.convert(ResponseDefine.Novalidate, "false", "edition_no类型不正确");
            }
            if(!StringUtil.isBlank(b_time))
            {
                DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
                try {
                    b_date = format.parse(b_time);
                } catch (Exception e) {
                    return ResUtil.convert(ResponseDefine.Novalidate, "false", "b_time格式不正确");
                }
            }
            if(!StringUtil.isBlank(e_time))
            {
                DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
                try {
                    e_date = format.parse(e_time);
                } catch (Exception e) {
                    return ResUtil.convert(ResponseDefine.Novalidate, "false", "e_time格式不正确");
                }
            }

            int result= versionService.updateVersionInfo(os_type,edition_no,version_no,
                    official_site,login_addr,version_enable,need_update,b_date,e_date,version_key,deviationtime,control_addr);
            if(result==0)
            {
                return ResUtil.convert(ResponseDefine.Nodate, "false", "版本信息不存在");
            }
            return ResUtil.convert(ResponseDefine.Success, "success", 0);
        }catch (Exception e){
            e.printStackTrace();
            return ResUtil.convert(ResponseDefine.Exception, "false","系統正在休息，请稍后再试");
        }
    }

    /**
     * 测试用 删掉
     * @param os_type
     * @param edition_no
     * @param version_no
     * @param req
     * @return
     */
    @RequestMapping(value = "/get2")
    public String getVersionInfo2(@RequestParam("os_type") int os_type,@RequestParam("edition_no") int edition_no,@RequestParam("version_no") String version_no,HttpServletRequest req) {
        try {

            String cur_time = ParamUtil.getString(req, "cur_time", "");
            String version_key = ParamUtil.getString(req, "version_key", "");
            Date time = null;

            if(os_type !=1 &&  os_type !=2 &&  os_type !=3 &&  os_type !=4 &&  os_type !=5)
            {
                return ResUtil.convert(ResponseDefine.Novalidate, "false", "os_type类型不正确");
            }
            if(edition_no !=1 &&  edition_no !=2 &&  edition_no !=3)
            {
                return ResUtil.convert(ResponseDefine.Novalidate, "false", "edition_no类型不正确");
            }
            if(!StringUtil.isBlank(cur_time))
            {
                DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
                try {
                    time = format.parse(cur_time);
                } catch (Exception e) {
                    return ResUtil.convert(ResponseDefine.Novalidate, "false", "cur_time格式不正确");
                }
            }

            ServiceResponse response= versionService.getVersionDetail(os_type,edition_no,version_no,time,version_key,cur_time);
            if(!response.code.equals(ResponseDefine.Success))
            {
                return ResUtil.convert(response.code, "false", response.info);
            }
            return ResUtil.convert(ResponseDefine.Success, "success", response.info);

        }catch (Exception e){
            e.printStackTrace();
            return ResUtil.convert(ResponseDefine.Exception, "false","系統正在休息，请稍后再试");
        }
    }

    @RequestMapping(value = "/get")
    public String getVersionInfo(@RequestParam("os_type") int os_type,@RequestParam("edition_no") int edition_no,@RequestParam("version_no") String version_no,HttpServletRequest req) {
        try {

            String cur_time = ParamUtil.getString(req, "cur_time", "");
            String version_key = ParamUtil.getString(req, "version_key", "");
            Date time = null;

            if(os_type !=1 &&  os_type !=2 &&  os_type !=3 &&  os_type !=4 &&  os_type !=5)
            {
                return ResUtil.convert(ResponseDefine.Novalidate, "false", "os_type类型不正确");
            }
            if(edition_no !=1 &&  edition_no !=2 &&  edition_no !=3)
            {
                return ResUtil.convert(ResponseDefine.Novalidate, "false", "edition_no类型不正确");
            }
            if(!StringUtil.isBlank(cur_time))
            {
                DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
                try {
                    time = format.parse(cur_time);
                } catch (Exception e) {
                    return ResUtil.convert(ResponseDefine.Novalidate, "false", "cur_time格式不正确");
                }
            }

            ServiceResponse response= versionService.getVersionDetail(os_type,edition_no,version_no,time,version_key,cur_time);
            if(!response.code.equals(ResponseDefine.Success))
            {
                return ResUtil.convert(response.code, "false", response.info);
            }
            return ResUtil.convert(ResponseDefine.Success, "success", response.info);

        }catch (Exception e){
            e.printStackTrace();
            return ResUtil.convert(ResponseDefine.Exception, "false","系統正在休息，请稍后再试");
        }
    }




}