package com.practice;

public class practice1 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println("A:a=" + a + " b=" + b);
		change(a,b);
		System.out.println("C:a=" + a + " b=" + b);
		
		int[] arr = new int[] {5,10,15,20};
		System.out.println("调用change(int[] arr)方法前");
		printArray(arr);
		change(arr);
		System.out.println("调用change(int[] arr)方法后");
		printArray(arr);
		int max = getMax(arr);
		System.out.println("数组arr的最大值为："+max);
	}
	
	//基本数据类型 形参改变不会影响实参
	public static void change(int a,int b) {
		a = a+10;
		b = b+10;
		System.out.println("B:a=" + a + " b=" + b);
	}
	
	//引用数据类型 形参改变会影响实参
	public static void change(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				arr[i] *= 2;
			}
		}
	}
	
	//遍历数组元素
	public static void printArray(int[] arr) {
		System.out.print("数组包含元素：[");
		for(int i=0;i<arr.length;i++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i]+"]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
	
	//获取数组最大值
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
