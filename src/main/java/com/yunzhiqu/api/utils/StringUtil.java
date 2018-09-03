package com.yunzhiqu.api.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class StringUtil {
	public static boolean isEmpty(String str)
	{
		return str == null || str.length() == 0;
	}
	public static boolean isNotEmpty(String str)
	{
		return str != null && str.length() > 0;
	}
	public static boolean isBlank(String str)
	{
		int length;
		if (str == null || (length = str.length()) == 0)
			return true;
		for (int i = 0; i < length; i++)
			if (!Character.isWhitespace(str.charAt(i)))
				return false;

		return true;
	}

	public static boolean isNotBlank(String str)
	{
		int length;
		if (str == null || (length = str.length()) == 0)
			return false;
		for (int i = 0; i < length; i++)
			if (!Character.isWhitespace(str.charAt(i)))
				return true;

		return false;
	}
	/**
	 * 组装json
	 * 
	 * @param result
	 *            状态标志
	 * @param msg
	 *            异常时的文字提示
	 * @param data
	 *            正常时返回的数据
	 * @param response
	 */
	public static void webJson(String result, String msg, Map data,
			HttpServletResponse response) {
		try {
			JSONObject json = new JSONObject();
			json.put("result", result);
			json.put("msg", msg);
			if(data!=null)
				json.put("info", data);
			response.setCharacterEncoding("utf-8");
			JSONObject.writeJSONString(response.getWriter(),json);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

	/**
	 * 组装json
	 * 
	 * @param result
	 *            状态标志
	 * @param msg
	 *            异常时的文字提示
	 * @param listData
	 *            正常时返回的数据
	 * @param response
	 */
	public static void webJsonList(String result, String msg, List<Map> listData,HttpServletResponse response) {
		try {
			JSONObject json = new JSONObject();
			json.put("result", result);
			json.put("msg", msg);
			if(listData!=null)json.put("info", listData);
			response.setCharacterEncoding("utf-8");
			JSONObject.writeJSONString(response.getWriter(),json);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}
	/**
	 * 根据图片名字获取图片类型
	 * @param imgname
	 * @return
	 */
	public static String getImgType(String imgname){
		String type = null;
		int idx = imgname.lastIndexOf(".");
		if(idx > 0) type = imgname.substring(idx + 1).toLowerCase();
		String file_suffix_inlcude = "jpg,jpeg,bmp,gif,png";
		if (file_suffix_inlcude.indexOf(type)<0) {
			type = "jpg";
		}
		return type;
	}
	
	public static String barTime(Date create_time){
		if(create_time == null)return null;
		String rtime = null;
		long endT = create_time.getTime();
		long startT = new Date().getTime();
		long ss = (startT-endT)/(1000); //共计秒数
	    int mm = (int)ss/60;   //共计分钟数
	    if(mm >= 60){
	    	int hh=(int)ss/3600; 
	    	if(hh >= 24){
	    		Calendar stime = Calendar.getInstance();
	    		stime.setTime(create_time);
	    		int month = stime.get(Calendar.MONTH)+1;
	    		int day = stime.get(Calendar.DAY_OF_MONTH);
	    		
	    		rtime = (month>9?(month+""):("0"+month))+ "-";
	    		rtime += day>9?(day+""):("0"+day);
	    		Calendar ntime = Calendar.getInstance();
	    		ntime.setTime(new Date());
	    		if(stime.get(Calendar.YEAR)!=ntime.get(Calendar.YEAR)){
	    			rtime = (stime.get(Calendar.YEAR)%100)+"-" + rtime;
	    		}
	    	}else{
	    		rtime = hh+"小时前";
	    	}
	    }else if(mm == 0){
	    	rtime = "刚刚";
	    }else{
	    	rtime = mm+"分钟前";
	    }
		return rtime;
	}
	
	public static String toTime(Date create_time){
		if(create_time == null) return null;
		String rtime = null;
		long endT = create_time.getTime();
		long startT = new Date().getTime();
		long secs = (startT-endT)/(1000); //共计秒数
	    if(secs <= 3600){
	    	rtime = "刚刚";
	    }else if(secs > 3600 && secs <= 86400){
	    	rtime = ((int)secs/60/60) + "小时前";
	    }else if(secs > 86400 && secs <= 172800){
	    	rtime = "昨天";
	    }else if(secs > 172800 && secs <= 259200){
	    	rtime = "前天";
	    }else if(secs > 259200 && secs<2592000){
	    	rtime = ((int)secs/60/60/24) + "天前";
	    }else{
	    	rtime = "一个月前";
	    }
		return rtime;
	}
	
	/**
	 * @Title: strConvertList 
	 * @Description: 将String根据逗号分隔，返回List集合
	 * @param 
	 * @return List<String> 参数str为null,则返回的集合list大小为0
	 * @throws 
	 * @author : hj
	 * @date : 2015-11-9 下午12:35:44
	 */
	public static List<String> strConvertList(String str){
		List<String> list = null;		
		if(null != str){
			list = Arrays.asList(str.split(",")) ;
		}else{
			list = new ArrayList<String>(0);
		}
		return list;
	}
	
	/**
	 * @Description: 将时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
	 * @param strDate
	 * @return Date
	 * @author hj
	 * @date: 2015-12-30 下午4:14:11
	 */
	public static Date strToDate(String strDate) {
		if(isEmpty(strDate)) return null;
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 ParsePosition pos = new ParsePosition(0);//从第一位开始解析
		 Date result = formatter.parse(strDate, pos);
		 return result;
	}
	
	/**
	 * @Description: 将时间转换成string格式yyyy-MM-dd HH:mm:ss
	 * @param date
	 * @return String
	 * @author hj
	 * @date: 2015-12-30 下午4:11:30
	 */
	public static String dateToString(Date date){
		return dateToString(date,"yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * @Description: 将时间按规定格式，转换成string  格式 例如//yyyy-MM-dd HH:mm:ss
	 * @param date
	 * @return String
	 * @author hj
	 * @date: 2016-10-14 下午4:11:30
	 */
	public static String dateToString(Date date,String format){
		return (date == null) ? null : (new SimpleDateFormat(format)).format(date);
	}
	
	public static void main(String[] args) {
		System.out.println(dateToString(new Date(),"yyyy-MM-dd HH:mm"));
	}
	
	/**
	 * @Title: breakLineHtml 将对象转换成String，并将/r和 /rm 换成<BR>
	 * @param obj
	 * @return String
	 * @author hj
	 * @date: 2016-5-9 下午7:33:46
	 */
	public static String breakLineHtml(Object obj){
		return (obj == null) ? "" : obj.toString().replaceAll("\r\n", "<BR>");
	}
	
	/**
	 * @Title: jsonString  将英文的单,双引号转成中文的单双引号
	 * @param s
	 * @return String
	 * @author hj
	 * @date: 2016-9-23 下午4:50:46
	 */
	public static String jsonString(String s) {
		if(isEmpty(s)){ return s; }
		char[] temp = s.toCharArray();
		int n = temp.length;
		for (int i = 0; i < n; i++) {
			if (temp[i] == ':' && temp[i + 1] == '"') {
				for (int j = i + 2; j < n; j++) {
					if (temp[j] == '"') {
						if (temp[j + 1] != ',' && temp[j + 1] != '}') {
							temp[j] = '”';
						} else if (temp[j + 1] == ',' || temp[j + 1] == '}') {
							break;
						}
					} else if (temp[j] == '\'') {
						if (temp[j + 1] != ',' && temp[j + 1] != '}') {
							temp[j] = '’';
						} else if (temp[j + 1] == ',' || temp[j + 1] == '}') {
							break;
						}
					}
				}
			}
		}
		return new String(temp);
	}
	
	/**
	 * @Title: getLength  根据字符集编码返回字符串长度
	 * @param str
	 * @param encoding
	 * @return int
	 * @author hj 2016-10-13 上午11:40:07
	 */
	public static int getLength(String str,String encoding){
		try {
			return (isEmpty(str) || isEmpty(encoding)) ? 0 : str.getBytes(encoding).length;
		} catch (UnsupportedEncodingException e) {
			return 0;
		}
	}
	
	/**
	 * @Title: getLength  返回字符串，UTF-8字符集的长度
	 * @param str
	 * @return int
	 * @author hj 2016-10-13 上午11:40:07
	 */
	public static int getLength(String str){
		return getLength(str,"utf-8");
	}
	
	/**
	 * 判断一个字符串是否为数字
	* @Title: isNumeric
	* @Description: 
	* @param 
	* @return boolean    返回类型
	* @author xzl
	* @date 2017-2-7 下午6:03:20
	* @throws
	 */
	public static boolean isNumeric(String str){ 
	  for (int i = str.length();--i>=0;){   
	   if (!Character.isDigit(str.charAt(i))){ 
	    return false; 
	   } 
	  } 
	  return true; 
	} 
	
	/**
	 * @Title: getContentByDyntype 根据动态类型获取随机动态类型
	 * @param dyntype 0：默认动态 ，1：发布夜玩，2：报名夜玩，3：加入圈子，4：发布圈子照片,5：创建圈子
	 * @return String
	 * @author hj
	 * @date: 2017-2-10 下午4:15:12
	 */
	public static String getContentByDyntype(int dyntype,Object cotitle){
		String res = "";
		if(dyntype == 1){
			res = "嘘，偷偷告诉你，我刚刚发布了一个超好玩的夜玩，快来找我一起玩！";
		}else if(dyntype == 2){
			res = "我刚刚报名了夜玩，邀你和我一起玩！";
		}else if(dyntype == 3){
			String content [] = new String[8];
			content[0] = "大家好，我刚加入圈子，以后多多交流~";
			content[1] = "Hi~今天刚入坑，以后有活动可以找我一起玩~";
			content[2] = "大家好，刚入圈的新人一枚，还望老司机带带我！";
			content[3] = "同志们，今天终于加入大部队了，今后带我一起玩啊~";
			content[4] = "Hello，刚入圈的新人一枚，今后有什么活动带上我，绝对如期而至！";
			content[5] = "大家好，今天刚入坑，还希望各位老司机能带我一起浪！";
			content[6] = "Hi，我刚加入圈子，有大神能带我一起玩吗？";
			content[7] = "Hello，刚入圈，求约玩！";
			res = content[(int)(Math.random() * 7)];
		}else if(dyntype == 4){
			res = "我刚刚更新了新的照片，快来为我点赞吧！";
		}else if(dyntype == 5){
			res = "刚刚创建了"+ (cotitle == null ? "晚晚" : cotitle.toString()) + "的圈子，我在这里等你来哦。";
		}
		return res;
	}
}
