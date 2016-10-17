package com.baiguomin.algo.sort;

/**
 * 快速排序
 * ClassName: FastSort <br/>
 * date: 2016年10月17日 下午9:36:11 <br/>
 * @author baiguomin1991@163.com
 * 原理：对于一个有序数列来说，除了开头和结尾这两个元素之外，其他元素均具备特性，左边的数字比他小，右边的数字比他大
 * @since JDK 1.7
 */
public class FastSort {
	static double[]  arr =  new double[10000000];
	
	public static void main(String[] args) {
		for(int index =0;index<10000000;index++){
			arr[index] = Math.random();
		}
		Long startTime = System.currentTimeMillis();
//		printArr(arr);
		fastSort(arr,0,arr.length-1);
//		printArr(arr);
		System.out.println("cost time is"+(System.currentTimeMillis()-startTime));
	}
	
	static void printArr(double[] arr){
		for(int index=0;index<arr.length;index++){
			System.out.println(arr[index]);
		}
		System.out.println("---------");
	}
	private static void fastSort(double[] arr, int start, int end) {
		if(start >= end){
			return ;
		}
		int i = start;
		int j = end;
		double key = arr[start];
		while(i<j){
			while(i<j && arr[j]>key){
				j --;
			}
			while(i<j && arr[i]<=key){
				i ++;
			}
			if(i<j){
				double tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		arr[start] = arr[i];
		arr[i] = key;
		fastSort(arr, start, i-1);
		fastSort(arr, i+1, end);
	}
}
