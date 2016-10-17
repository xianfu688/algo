package com.baiguomin.algo.sort;

import java.util.Arrays;

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
