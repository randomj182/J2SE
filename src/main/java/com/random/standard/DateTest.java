package com.random.standard;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description 添加类的描述.
 * @author random
 * @version 1.0
 * @date 2018年9月7日
 * 
 */
public class DateTest {
	
	public static void main(String[] args) {
		Date first,next;
		System.out.println(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			first = df.parse("2015-01-01 00:00:00");
			next = df.parse("2015-12-31 23:59:59");
			System.out.println(first);
			System.out.println(next);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
