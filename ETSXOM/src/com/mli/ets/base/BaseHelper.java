package com.mli.ets.base;

import java.math.BigDecimal;
import java.text.DecimalFormat;
//import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BaseHelper {

	// 取得當下日期
	public static Date getToday() {
		return new Date();
	}

	// 設立日期預設值
	public static Date getDefaultDate() throws ParseException {

		SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd"); // 設定日期格式
		Date defaultDate = ft.parse("1900-01-01"); // 進行轉換

		return defaultDate;
	}

	// 日期格式化
	public static Date getFormatDate(Date date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(sdf.format(date));
	}

	// 日期的前n天的日期
	public static Date getBeforeDay(Date beginDate, int beforeDay) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(beginDate);
		cal.add(Calendar.DAY_OF_MONTH, -beforeDay);
		return cal.getTime();
	}

	// 日期的後n天的日期
	public static Date getAfterDay(Date beginDate, int afterDay) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(beginDate);
		cal.add(Calendar.DAY_OF_MONTH, +afterDay);
		return cal.getTime();
	}

	// (相對)精確的除法運算，當發生除不盡的情況，四捨五入精確到小數點以後8位， 被除數：v1，除數：v2， 兩個參數的商
	public static double div(double v1, double v2) {
		double result = 0;
		if (v2 != 0) {
			BigDecimal b1 = new BigDecimal(Double.toString(v1));
			BigDecimal b2 = new BigDecimal(Double.toString(v2));
			result = b1.divide(b2, 20, BigDecimal.ROUND_HALF_UP).doubleValue();
		}
		return result;
	}

	// 判斷物件是否為空
	public static boolean isNullOrEmpty(Object arg) throws ParseException {
		if (arg instanceof Double) {
			if ((double) arg == -999999) {
				return true;
			} else {
				return false;
			}
		} else if (arg instanceof Integer) {
			if ((int) arg == -999999) {
				return true;
			} else {
				return false;
			}
		} else if (arg instanceof String) {
			String temp = (String) arg;
			if (temp.trim().equals("null")) {
				return true;
			} else if (temp.trim().equals("")) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

	// 通用判斷true不為空
	public static boolean isNotNullOrEmpty(Object obj) throws ParseException {

		if (obj instanceof Double)
			return (Double) obj != -999999;

		if (obj instanceof Integer)
			return (Integer) obj != -999999;

		if (obj instanceof String) {
			String line = (String) obj;
			return !(line.trim().equals("") || line.trim().equals("null") || line
					.trim().isEmpty());
		}

		if (obj instanceof Date) {
			Date nullDate = (Date) obj;
			if (!(getFormatDate(nullDate).equals(getDefaultDate())))
				return true;
			if (getFormatDate(nullDate).after(getDefaultDate()))
				return true;
		}

		return false;
	}

	// 日期轉字串
	public static String DateToString(Date d) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			String date = format.format(d);
			return date;
		} catch (Exception e) {
			System.out.println(" [String is not Double error] ");
			e.printStackTrace();
			return "date to string error";
		}

	}

	// Double轉String
	public static String doubleToString(double arg1) {
		BigDecimal decimalc= new BigDecimal(Double.toString(arg1));
		//BigDecimal bd = new BigDecimal(arg1);
		DecimalFormat df = new DecimalFormat("#,###.00");
		//NumberFormat nf = NumberFormat.getInstance();
		//nf.setMaximumFractionDigits(Integer.MAX_VALUE);
		try {
			if(arg1 >= 1){
				return df.format(arg1);
			}
			else{
				if (arg1 == 0){
					return "0.000";
				}
				else{
					
					 
					// return decimalc.toString();
					 return decimalc.toPlainString();//0410_Jessie:因為小數顯示有科學記號.toString()改.toPlainString()
							//return nf.format(bondDecAmt);
							//bd.setScale(5 , BigDecimal.ROUND_HALF_UP).toPlainString();
				}
			}
			
		} catch (Exception e) {
			System.out.println(" [String is not Double error] " + e.getMessage());
			e.printStackTrace();
			return "double to string error "+String.valueOf(arg1)+" "+ e.getMessage();
		}
	}
	//boolean 轉 String
	public static String booleanToString(boolean arg1) {
		try {
			if(arg1){
				return "TRUE";
			}
			else{
				return "FALSE";
			}
			
		} catch (Exception e) {
			System.out.println(" [String is not Boolean error] " + e.getMessage());
			e.printStackTrace();
			return "boolean to string error "+String.valueOf(arg1)+" "+ e.getMessage();
		}
	}
	
	public static boolean checkEndString(String first,String second){
		if(second.length()<= first.length()){
			if(first.endsWith(second)){
				return true;
				}
			else{
				return false;
				}
		}
		else{
			return false;
			}
	
	}
	//取第一碼
	public static String getfirstString(String arg1) {
		try {
			if (!arg1.isEmpty()) {
				return arg1.substring(0, 1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		}
	
}
