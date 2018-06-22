package com.random.standard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.Test;
/**
 * 测试IO流操作类
 * @author random
 *
 */
public class SystemIO {
	@Test
	/**
	 * 标准输入流
	 */
	public void testIO(){
		Scanner in = new Scanner(System.in);
		while(true){
			String name = in.nextLine();
			if ("qwe".equals(name)) {
				break;
			}
			System.out.println(name);
		}
	}
	
	@Test
	/**
	 * 逐行读取文件内容
	 */
	public void testFileIS() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("C:\\Users\\Radish\\Desktop\\1.txt"), "utf-8"));
		String line = null;
		while((line =br.readLine())!= null){
			System.out.println(line);
		}
	}
	
	@Test
	/**
	 * 逐行读取文件内容并写入
	 */
	public void testFileOS() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(new File("C:\\Users\\Radish\\Desktop\\1.txt")), "utf-8"));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(
				new FileOutputStream(new File("C:\\Users\\Radish\\Desktop\\2.txt")),"utf-8"));
		String line = null;
		while((line = br.readLine())!= null){
			pw.write(line);
		}
		pw.flush();
		pw.close();
		br.close();
	}
}
