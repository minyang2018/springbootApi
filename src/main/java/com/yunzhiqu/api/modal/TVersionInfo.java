package com.yunzhiqu.api.modal;

import java.util.Date;

public class TVersionInfo {
    private Integer id;

    private Integer osType;

    private Integer editionNo;

    private String versionNo;

    private String versionKey;

    private String officialSite;

    private String loginAddr;

    private Integer versionEnable;

    private Integer needUpdate;

    private Date bTime;

    private Date eTime;

    private Integer deviationtime;

    private String versionlock;

    private String controlAddr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOsType() {
        return osType;
    }

    public void setOsType(Integer osType) {
        this.osType = osType;
    }

    public Integer getEditionNo() {
        return editionNo;
    }

    public void setEditionNo(Integer editionNo) {
        this.editionNo = editionNo;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo == null ? null : versionNo.trim();
    }

    public String getVersionKey() {
        return versionKey;
    }

    public void setVersionKey(String versionKey) {
        this.versionKey = versionKey == null ? null : versionKey.trim();
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite == null ? null : officialSite.trim();
    }

    public String getLoginAddr() {
        return loginAddr;
    }

    public void setLoginAddr(String loginAddr) {
        this.loginAddr = loginAddr == null ? null : loginAddr.trim();
    }

    public Integer getVersionEnable() {
        return versionEnable;
    }

    public void setVersionEnable(Integer versionEnable) {
        this.versionEnable = versionEnable;
    }

    public Integer getNeedUpdate() {
        return needUpdate;
    }

    public void setNeedUpdate(Integer needUpdate) {
        this.needUpdate = needUpdate;
    }

    public Date getbTime() {
        return bTime;
    }

    public void setbTime(Date bTime) {
        this.bTime = bTime;
    }

    public Date geteTime() {
        return eTime;
    }

    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    public Integer getDeviationtime() {
        return deviationtime;
    }

    public void setDeviationtime(Integer deviationtime) {
        this.deviationtime = deviationtime;
    }

    public String getVersionlock() {
        return versionlock;
    }

    public void setVersionlock(String versionlock) {
        this.versionlock = versionlock == null ? null : versionlock.trim();
    }

    public String getControlAddr() {
        return controlAddr;
    }

    public void setControlAddr(String controlAddr) {
        this.controlAddr = controlAddr == null ? null : controlAddr.trim();
    }
}