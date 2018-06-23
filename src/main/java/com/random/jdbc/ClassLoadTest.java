package com.random.jdbc;

import org.junit.Test;

/**
 * 模拟Class.forName(String className)的执行
 * @author random
 *
 */
public class ClassLoadTest {
	@Test
	public void classLoadTest() throws Exception{
		// 加载这个类 Class.forName()的加载方式会加载这个类的所以静态块
		// 然后Driver的static{}静态块会向DriverManager注册自己
		Class.forName("com.random.jdbc.driver.MyDriver");
		
		//ClassLoader.getSystemClassLoader().loadClass("com.random.jdbc.driver.MyDriver");
		
	}
	
}
