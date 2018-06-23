package com.random.algorithm;

public class Sort {
	
	public static void main(String[] args) {
		int[] nums = {8,3,5,6,7,1};
		Bubblesort(nums);
	}
	/**
	 * 冒泡排序:从大到小
	 * 	判断前一个数是否小于后一个数,是:交换;
	 * @param nums
	 */
	public static void Bubblesort(int[] nums){
		for (int num : nums) {
			System.out.print(num+" ");
		}
		System.out.println();
		for(int i = 0; i<nums.length-i;i++){
			for(int j =0; j<nums.length-1-i;j++){
				if (nums[j] < nums[j+1]) {
					int temp=0;
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		for (int num : nums) {
			System.out.print(num+" ");
		}
	}
	/**
	 * 快速排序
	 */
	public static void quickSort(){
		
	} 
}
