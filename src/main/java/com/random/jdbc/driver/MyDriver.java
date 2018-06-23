package com.random.jdbc.driver;

public class MyDriver {

	static{
		// 模拟向DriverManager 注册自己
		// 比如DriverManeger.regist("com.random.jdbc.driver.MyDriver");
		System.out.println("MyDriver向DriverManager注册自己");
	}
}
