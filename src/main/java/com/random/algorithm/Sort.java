package com.random.algorithm;

import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

public class Sort {
	// 序列
	private int[] nums;
	{
		// 生成10个随机数  10-100
		nums=new int[10];
		
		for(int i =0;i<nums.length;i++){
			nums[i]=(int)(Math.random()*90+10);
		}
	}
	@Test
	/**
	 * 冒泡排序:从小到大
	 * @param nums
	 */
	public void Bubblesort(){
		// 先输出原始序列
		System.out.println("原始序列:");
		for (int num : nums) {
			System.out.print(num+" ");
		}
		System.out.println(nums.length);
		// 对序列进行冒泡排序 从小到大
		for(int i =0;i < nums.length-1;i++){
			// 1.把第一个元素取出来
			// 2.对后面的元素进行遍历,如果比这个元素小,就交换位置
			for(int j = i+1;j<nums.length;j++){
				if(nums[j]<nums[i]){
					int temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		// 一次循环将最大的放置到最后
		/*for(int i = 0;i<nums.length;i++){
			for(int j = 0;j<nums.length-i-1;j++){
				if(nums[j]>nums[j+1]){
					int temp = nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}
		}*/
		// 输出排序后的序列
		for (int num : nums) {
			System.out.print(num+" ");
		}
	}
	@Test
	/**
	 * 快速排序
	 */
	public void quickSort(){
		System.out.println("原始序列:");
		
	}
	@Test
	/**
	 * TreeMap内部是使用红黑树的数据结构来实现的，红黑树是一棵平衡二叉树
	 * treemap实现排序
	 * 	根据key值从小到大排序
	 */
	public void treemapTest(){
		// string :姓名  integer 账户余额
		TreeMap<Integer, Integer> accountMap =new TreeMap<>();
		accountMap.put(300, 0);
		accountMap.put(200, 0);
		accountMap.put(500, 0);
		// 取出第一个key值
		System.out.println(accountMap.firstKey());
	}
	@Test
	/**
	 * 同时，TreeSet的内部各方法的原理都是通过TreeMap来操作的
	 * treeset实现排序
	 */
	public void treesetTest(){
		System.out.println(new Integer(111) instanceof Comparable);
		/*Comparator<Integer> comparator = new Comparator<Integer>() {
			// 如果返回0,则说明相等;返回o1-o2为正数,则表示
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		};
		TreeSet<Integer> treeSet = new TreeSet<>(comparator);*/
		// 默认情况下从小到大排序
		TreeSet<Integer> treeSet = new TreeSet<>();
		for (Integer num : nums) {
			treeSet.add(num);
		}
		System.out.println();
		for (Integer integer : treeSet) {
			System.out.print(integer+"  ");
		}
	}
}
