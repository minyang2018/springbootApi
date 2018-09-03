package com.yunzhiqu.api.utils;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParamUtil {
    public static double getDouble(HttpServletRequest req, String param, double defaultvalue) {
        double ret = defaultvalue;
        try {
            ret = Double.parseDouble(req.getParameter(param));
        } catch (Exception e) {
            ret = defaultvalue;
        }
        return ret;
    }

    public static int getInt(HttpServletRequest req, String param, int defaultvalue) {
        int ret = defaultvalue;
        try {
            ret = Integer.parseInt(req.getParameter(param));
        } catch (Exception e) {
            ret = defaultvalue;
        }
        return ret;
    }
    public static short getShort(HttpServletRequest req, String param, short defaultvalue) {
        short ret = defaultvalue;
        try {
            ret = Short.parseShort(req.getParameter(param));
        } catch (Exception e) {
            ret = defaultvalue;
        }
        return ret;
    }

    public static long getLong(HttpServletRequest req, String param, long defaultvalue) {
        long ret = defaultvalue;
        try {
            ret = Long.parseLong(req.getParameter(param));
        } catch (Exception e) {
            ret = defaultvalue;
        }
        return ret;
    }

    public static Date getDate(HttpServletRequest req, String param, String fmt) {
        try {
            SimpleDateFormat df = new SimpleDateFormat(fmt);
            return df.parse(req.getParameter(param));
        } catch (Exception e) {
            return null;
        }
    }

    public static String getString(HttpServletRequest req, String param, String def) {
        String ret = req.getParameter(param);
        if (ret == null || ret.trim().length() == 0)
            return def;
        return ret.trim();
    }

    public static boolean isWeixinRequest(HttpServletRequest req){
        if(req != null && req.getHeader("User-Agent") != null){
            return req.getHeader("User-Agent").toLowerCase().contains("micromessenger");
        }else{
            return false;
        }
    }

    public static boolean isAlipayRequest(HttpServletRequest req){
        if(req != null && req.getHeader("User-Agent") != null){
            return req.getHeader("User-Agent").toLowerCase().contains("alipay");
        }else{
            return false;
        }
    }
}