package com.random.concurrent;
/**
 * @description 分析一下这个程序的输出.
 * @author random
 * @version 1.0
 * @date 2018年9月21日
 * 
 */
public class T implements Runnable {

	private int count = 10;
	/**
	 * https://www.bilibili.com/video/av11076511/?p=1  16:00
	 * 有synchronized的时候,多个线程间run方法都不会重入,不会线程重入 原子操作 不可分
	 */
	public /*synchronized*/ void run() { 
		count--;
		System.out.println(Thread.currentThread().getName() + " count = " + count);
	}
	/*
	 * 此处只new了一个对象,好多线程共用这个对象
	 * 
	 * 5个线程访问的都是同一个count
	 */
	public static void main(String[] args) {
		T t = new T();
		for(int i=0; i<5; i++) {
			new Thread(t, "THREAD" + i).start();
		}
	}
	
}