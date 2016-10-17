package com.baiguomin.algo.sort;

import java.util.Arrays;

/**
 * ClassName: HeapSort <br/>
 * date: 2016年9月23日 上午9:36:33 <br/>
 * @author baiguomin1991@163.com
 * @since JDK 1.7
 */
public class HeapSort {
	static double[]  arr =  new double[10000000];
	/**
	 * 堆排序借鉴了完全二叉树的特点，即除了最后一层不是满的，其余的均已经填满
	 * 堆排序 zero-based  对于一个节点i>=0来说
	 * 左子节点 2*i+1
	 * 右子节点 2*i+2
	 */
	static int total;
	//交换方法
	public static void swap(double[] arr,int x,int y){
		double tmp = arr[x];
		arr[x] = arr[y];
		arr[y] =  tmp;
	}
	
	//堆化方法，对于某一个节点i来说
	
	public static void heapify(double[] arr,int index){
		int left = 2*index+1;
		int right = left+1;
		int slf = index;
		if(left<=total && arr[left] > arr[slf])  slf = left;//如果左节点比根节点大，那么就调整位置	
		if(right <= total && arr[right] > arr[slf]) slf = right;//如果右节点比根节点大，那么就调整位置
		if(slf!=index){
			swap(arr, index, slf);
			heapify(arr,slf);
		}
	}
	
	public static void sort(double[] arr){
		total = arr.length -1;
		for(int index=total/2;index>=0;index--){
			heapify(arr, index);
		}
		for(int index=total;index>0;index--){
			swap(arr, 0, index);
			total --;
			heapify(arr, 0);
//			System.out.println("第"+(arr.length-1-total)+"遍堆化后数组:"+Arrays.toString(arr));
		}
	}
	
	public static void main(String[] args) {
		for(int index =0;index<10000000;index++){
			arr[index] = Math.random();
		}
		Long startTime = System.currentTimeMillis();
		System.out.println("初始数组:"+Arrays.toString(arr));
		sort(arr);
		System.out.println("cost time is"+(System.currentTimeMillis()-startTime));
	}
}
