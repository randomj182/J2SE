package com.random.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @description InetAddress提供了IP地址.
 * 				无构造方法,所以无法new对象;通过静态方法获得实例
 * @author random
 * @version 1.0
 * @date 2018年9月12日
 * 
 */
public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		// 获取本机的InetAddress实例   抛异常
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("计算机名: "+address.getHostName());
		System.out.println("IP地址: "+address.getHostAddress());
		System.out.println(address);	// 直接获取InetAddress对象
		
		// 根据计算机名获取InetAddress对象
		// InetAddress address2 = InetAddress.getByName("DESKTOP-1");
		InetAddress address2 = InetAddress.getByName("10.10.3.195");	// ?
		System.out.println("计算机名: "+address2.getHostName());
		System.out.println("IP地址: "+address2.getHostAddress());
		
	}
}
