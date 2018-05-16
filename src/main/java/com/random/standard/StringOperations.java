package com.random.standard;

import java.util.Date;

/**
 * String 字符串各种操作
 * @author admin
 *
 */
public class StringOperations {

	public static void main(String[] args) {
		String all = String.join("/", "A","M","L");
		System.out.println(all);
		 
		int index = all.codePointCount(0, all.length());
		int cp = all.codePointAt(0);
		System.out.println(index);
		/*
		 * StringBuilder
		 * 单线程 线程安全 可追加
		 */
		StringBuilder builder = new StringBuilder();
		String str = builder.append("sss").append("aaa").toString();
		System.out.println(str);
		//类似于C的格式化输出
		System.out.printf("%,.3f￥\n",100000000.0/3.0);
		
		System.out.println(new Date());
		
	}

}
