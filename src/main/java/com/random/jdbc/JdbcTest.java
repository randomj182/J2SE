package com.random.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.junit.Test;

/**
 * 测试java中Jdbc的使用
 * @author random
 * 功能:实现向本地MySQL mybatis_data 数据库  的student(int,varchar)表插入一条记录
 */
public class JdbcTest{
	private Connection connection;
	private static final String driver = "com.mysql.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost:3306/mybatis_data";
	private final String username = "root";
	private final String password ="root";
	@Test
	public void insertStudent() throws Exception{
		// 注册驱动
		Class.forName(driver);
		// 获取连接
		connection = DriverManager.getConnection(url, username, password);
		// 获取预编译语句
		String sql = "INSERT INTO student(name) VALUES(?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		// 填写占位符
		ps.setString(1, "ji");
		// 提交处理
		ps.executeUpdate();
		// 关闭资源
		ps.close();
	}
}
