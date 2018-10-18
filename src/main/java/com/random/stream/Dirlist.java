package com.random.stream;

import java.io.File;

/**
 * @description 添加类的描述.
 * @author random
 * @version 1.0
 * @date 2018年9月26日
 * 
 */
public class Dirlist {
	public static void main(String args[]) {
		String dirname = "/tmp";
		File f1 = new File(dirname);
		if (f1.isDirectory()) {
			System.out.println("Directory of " + dirname);
			String s[] = f1.list();
			for (int i = 0; i < s.length; i++) {
				File f = new File(dirname + "/" + s[i]);
				if (f.isDirectory()) {
					System.out.println(s[i] + " is a directory");
				} else {
					System.out.println(s[i] + " is a file");
				}
			}
		} else {
			System.out.println(dirname + " is not a directory");
		}
	}
}