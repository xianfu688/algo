package com.baiguomin.algo.sort;

/**
 * ClassName: InsertSort <br/>
 * 插入排序算法
 * date: 2016年9月21日 上午9:16:48 <br/>
 * @author baiguomin
 * @since JDK 1.7
 */
public class InsertSort {
	//对于arr数组中逆序数对的数量的不同，那么数字移动的速度就不同
	//也就是插入排序算法的速度取决于 数组总逆序数量的多少
//	static double[]  arr =  new double[]{64,1.0,21,5,27.4,98.6};
	/*move Num */
	/**
	 * round one : 1.0,64,21,5,27.4,98.6  1
	 * round two : 1.0,21,64,5,27.4,98.6  1
	 * round three : 1.0,5,21,64,27.4,98.6  2
	 * round four : 1.0,5,21,27.4,61,98.6  1 
	 * total moveNum is  5
	 */
	
	static double[]  arr =  new double[100000];
	
	
	/**
	 * 从小到大排序
	 * 外围    1<=index<len
	 * 内层  当前为curr = arr[index]  从后往前  0=<p<index-1循环，比较curr与arr[p]的大小
	 */
	
	public static void main(String[] args) {
		for(int index=0;index<100000;index++){
			arr[index] = Math.random();
		}//moveNum is24953597
		Long startTime = System.currentTimeMillis();
		
		Integer moveNum = 0;
		int p;
		for(int index=1;index<arr.length;index++){
			double tmp = arr[index];//将index处的数据拿出来，形成一个空箱子
			for(p = index;p > 0 && arr[p-1]>tmp;p--){//通过比较将合适的箱子不断的往后推，直到推不动
				moveNum ++;
				arr[p] = arr[p-1];
			}
			arr[p] = tmp;//将tmp的数组放到空处，完成一个数字的摆放
		}
		
		System.out.println("cost time is"+(System.currentTimeMillis()-startTime));
	}
	
}
