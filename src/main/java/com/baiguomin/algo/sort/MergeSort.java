package com.baiguomin.algo.sort;

public class MergeSort {
	static double[] arr  = new double[10000000];
	/**
	 * 归并排序
	 * 归并排序思路大致是，举例有两个arr1和arr2.如果这两个序列是序列相同的顺序
	 * 可以设置arr3数据，将arr1数组合arr2比较之后合并到arr3中
	 *  
	 */
	public static void main(String[] args) {
		for(int index=0;index<10000000;index++){
			arr[index] = Math.random();
		}
		double[] tmp = new double[arr.length];
		Long startTime = System.currentTimeMillis();
		mergeSort(arr,tmp,0,arr.length-1);
		System.out.println("cost time is"+(System.currentTimeMillis()-startTime));
//		for(int index=0;index<arr.length;index++){
//			System.out.println(arr[index]);
//		}
	}
	
	private static void mergeSort(double[] arr, double[] tmp,int left, int right) {
		if(left<right){
			int mid = (left+right)/2;
			mergeSort(arr, tmp, left, mid);
			mergeSort(arr, tmp, mid+1, right);
			merge(arr,tmp,left,mid+1,right);
		}
	}

	private static void merge(double[] arr, double[] tmp, int leftStart, int rightStart,
			int rightEnd) {
		  int leftEnd = rightStart -1 ;
		  int totalElements = rightEnd - leftStart + 1;
		  int index = leftStart;
		  while(leftStart<=leftEnd && rightStart <= rightEnd){
			  if(arr[leftStart]< arr[rightStart]){
				  tmp[index++] = arr[leftStart++];
			  }else{
				  tmp[index++] = arr[rightStart++];
			  }
		  }
		  
		  while(leftStart<=leftEnd){
			  tmp[index++] = arr[leftStart++];
		  }
		  while(rightStart<=rightEnd){
			  tmp[index++] = arr[rightStart++];
		  }
		  //copy tmp back to arr
		  for(int i = 0;i<totalElements;i++,rightEnd--){
			  arr[rightEnd] = tmp[rightEnd];
		  }
	}
}
