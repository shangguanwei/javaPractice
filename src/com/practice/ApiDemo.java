package com.practice;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ApiDemo {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(date.getDate());
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		//格式化
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String s = sdf.format(date);
		System.out.println("格式化现在时间"+s);
		//解析
		Date d = sdf.parse(s);
		System.out.println("解析当前时间字符串"+d.toLocaleString());
		
		Date date2 = new Date(1000*60*60*24);
		//有时差 Fri Jan 02 08:00:00 CST 1970
		System.out.println(date2);
		date2.setTime(3600000);
		System.out.println(date2);
		
		//格式化
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		String s1 = sdf1.format(date);
		System.out.println("格式化时间d1： "+s);
		//解析
		Date d1 = sdf1.parse(s1);
		System.out.println("解析d1时间字符串： "+d.toLocaleString());
	}

}
