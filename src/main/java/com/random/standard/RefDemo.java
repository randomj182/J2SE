package com.random.standard;

import java.lang.ref.WeakReference;

/**
 * @description java四种引用 强软弱虚.
 * @author random
 * @version 1.0
 * @date 2018年9月29日
 * 
 */
public class RefDemo {
	public static void main(String[] args) {
		System.out.println("弱引用 管理:");
		weak();
		System.out.println("强引用 管理:");
		strong();
	}
	
	public static void strong(){
		//字符串常量池 共享(不可回收)
		String str = "hello reference";
		//弱引用 管理对象
		WeakReference<String> weakR = new WeakReference<String>(str);
		System.out.println("gc回收前:"+weakR.get());
		//断开引用
		str = null;
		//通知回收
		System.gc();
		System.runFinalization();
		//对象被回收
		System.out.println("gc回收后:"+weakR.get());
	}
	public static void weak(){
		//字符串常量池
		String str = new String("hello reference");
		//弱引用 管理对象
		WeakReference<String> weakR = new WeakReference<String>(str);
		System.out.println("gc回收前:"+weakR.get());
		//断开引用
		str = null;
		//通知回收
		System.gc();
		System.runFinalization();
		//对象被回收
		System.out.println("gc回收后:"+weakR.get());
	}
	
}
