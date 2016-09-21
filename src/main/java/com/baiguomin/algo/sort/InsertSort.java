package com.baiguomin.algo.sort;

/**
 * ClassName: InsertSort <br/>
 * 插入排序算法
 * date: 2016年9月21日 上午9:16:48 <br/>
 * @author baiguomin
 * @since JDK 1.7
 */
public class InsertSort {
	static double[]  arr =  new double[]{64,1.0,21,5,27.4,98.6};
	
	/**
	 * round one : 1.0,64,21,5,27.4,98.6
	 * round two : 1.0,21,64,5,27.4,98.6
	 * ......
	 */
	
	/**
	 * 从小到大排序
	 * 外围    0<index<len
	 * 内层  当前为curr = arr[index]  从后往前  0=<p<index-1循环，比较curr与arr[p]的大小
	 */
	
	public static void main(String[] args) {
		for(int index=1;index<arr.length;index++){
			double tmp = arr[index];
			for(int p = index-1;p >=0 && arr[p]>tmp;p--){
				arr[p+1] = arr[p];
				arr[p] = tmp;
			}
		}
		for(int index=0;index<=arr.length-1;index++){
			System.out.println(arr[index]);
		}
	}
	
}
