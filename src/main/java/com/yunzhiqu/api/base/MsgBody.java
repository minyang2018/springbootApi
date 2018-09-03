package com.yunzhiqu.api.base;


import java.io.Serializable;
import java.util.Map;

public class MsgBody implements Serializable {

    private static final long serialVersionUID = -4225953805215948548L;

    public Map param;

    public String className;

    public Map getParam() {
        return param;
    }

    public void setParam(Map param) {
        this.param = param;
    }
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}