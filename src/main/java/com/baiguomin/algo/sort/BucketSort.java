package com.baiguomin.algo.sort;

/**
 * ClassName: BucketSort <br/>
 * date: 2016年10月17日 下午10:24:49 <br/>
 * @author baiguomin1991@163.com
 * 桶排序是我学算法的时候最喜欢的一种排序方法了，因为他最简单
 * 当然它有它的使用范围：
 * 当你知道一组正整数确定在某一范围内，并且最好他们之间互相不重复
 * 那么你就可以试着把他们作为数组的下标，利用下标的有序来确定它们之间的顺序
 * @since JDK 1.7
 */
public class BucketSort {
	static int[] arr = new int[]{2,1,3,5,7,8,0,45,43,56,100};
	static int[] result = new int[101];
	public static void main(String[] args) {
		for(int index=0;index<arr.length;index++){
			result[arr[index]] = 1;
		}
		for(int index=0;index<100;index++){
			if(result[index]==1){
				System.out.println(index);
			}
		}
		
	}
	
	
}
