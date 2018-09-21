package com.random.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 测试java中Jdbc的使用
 * @author random
 * 功能:实现  本地MySQL mybatis_data 数据库  的student(int,varchar)表 的CRUD操作
 */
public class JdbcTest{
	private Connection connection;
	private static final String driver = "com.mysql.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost:3306/mybatis_data";
	private final String username = "root";
	private final String password ="root";
	@Test
	// 向表中插入一条数据
	public void insertStudent() throws Exception{
		// 注册驱动
		Class.forName(driver);
		// 获取连接
		connection = DriverManager.getConnection(url, username, password);
		// 获取预编译语句
		String sql = "INSERT INTO student(id,tagno,name) VALUES(?,?,?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		// 填写占位符
		ps.setInt(1, 7);
		ps.setString(2, "ji");
		ps.setString(3, "jihongli");
		// 提交处理
		ps.executeUpdate();
		// 关闭资源
		ps.close();
	}
	@Test
	// 根据id修改表中相应的数据
	public void updateStudentById() throws Exception{
		// 注册驱动
		Class.forName(driver);
		// 获取连接
		connection = DriverManager.getConnection(url, username, password);
		// 获取预编译语句
		String sql = "UPDATE student SET name = ? WHERE id = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		// 填写占位符
		ps.setString(1, "hong");
		ps.setInt(2, 5);
		// 提交处理
		ps.executeUpdate();
		// 关闭资源
		ps.close();
	}
	@Test
	// 根据id查询一条数据
	public void selectStudentById() throws Exception{
		// 注册驱动
		Class.forName(driver);
		// 获取连接
		connection = DriverManager.getConnection(url, username, password);
		// 获取预编译语句
		String sql = "SELECT tagno,name from student WHERE id = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		// 填写占位符
		ps.setInt(1, 3);
		// 获取查询结果
		ResultSet rs = ps.executeQuery();
		// 提交处理
		while(rs.next()){
			String tagno = rs.getString(1);
			String name = rs.getString(2);
			System.out.println("tagno:"+tagno + "  name:"+name);
		}
		// 关闭资源
		ps.close();
	}
	@Test
	// 根据id查询所有数据
	public void selectStudent() throws Exception{
		// 注册驱动
		Class.forName(driver);
		// 获取连接
		connection = DriverManager.getConnection(url, username, password);
		// 获取预编译语句
		String sql = "SELECT tagno,name from student";
		PreparedStatement ps = connection.prepareStatement(sql);
		// 获取查询结果
		ResultSet rs = ps.executeQuery();
		List<String> rsList = new ArrayList<String>();
		// 提交处理
		while(rs.next()){
			String tagno = rs.getString(1);
			String name = rs.getString(2);
			rsList.add("tagno:"+tagno + "  name:"+name);
		}
		for (String list : rsList) {
			System.out.println(list);
		}
		// 关闭资源
		ps.close();
	}
	@Test
	// 根据id删除一条数据
	public void deleteStudentById() throws Exception{
		// 注册驱动
		Class.forName(driver);
		// 获取连接
		connection = DriverManager.getConnection(url, username, password);
		// 获取预编译语句
		String sql = "DELETE from student WHERE id = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		// 填写占位符
		ps.setInt(1, 6);
		// 提交处理
		ps.executeUpdate();
		// 关闭资源
		ps.close();
	}
}
