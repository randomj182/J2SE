package com.random.standard;

import java.util.Date;

/**
 * String 字符串各种操作
 * @author admin
 *
 */
public class StringOperations {

	public static void main(String[] args) {
		// 用分界符分隔字符串
		String all = String.join("/", "S","M","L");
		// S/M/L
		System.out.println(all);
		
		// 检测两个字符串是否相等,而不区分大小写,使用equalsIgnoreCase 方法
		System.out.println("Hello".equalsIgnoreCase("hello"));
		
		int index = all.codePointCount(0, all.length());
		// int cp = all.codePointAt(0);
		System.out.println(index);
		/*
		 * StringBuilder
		 * 单线程 线程安全 可追加
		 * Stringbuffer 多线程安全		线程安全		线程不安全
		 * 	A线程:append("ab")		(ab cd)或者			acbd
		 * 	B线程:append("cd")		(cd ab)
		 * 						不破坏原子性、具体哪种看线程调度
		 */
		StringBuilder builder = new StringBuilder();
		String str = builder.append("sss").append("aaa").toString();
		System.out.println(str);
		//类似于C的格式化输出
		System.out.printf("%,.3f￥\n",100000000.0/3.0);
		
		System.out.println(new Date());
		
	}

}
