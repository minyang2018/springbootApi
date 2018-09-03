package com.yunzhiqu.api.modal;

import java.util.Date;

/**
 * 本地错误日志
 */
public class ErrorLog {
    private long id;
    private long mid;
    private String ErrorLog;
    private String analyse;
    private Date createtime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    public String getErrorLog() {
        return ErrorLog;
    }

    public void setErrorLog(String errorLog) {
        ErrorLog = errorLog;
    }

    public String getAnalyse() {
        return analyse;
    }

    public void setAnalyse(String analyse) {
        this.analyse = analyse;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
