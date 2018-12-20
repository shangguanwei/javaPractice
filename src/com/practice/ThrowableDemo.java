package com.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThrowableDemo {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			System.out.println(2/0);
			fw = new FileWriter("a.txt");
			
		} catch (ArithmeticException e){
			e.getMessage();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (IOException ioe){
				ioe.printStackTrace();
			}
		}
		
		//递归：求5！
		int i = method(5);
		System.out.println("5的阶乘："+i);
		//不死神兔 斐波那契数列
		String month;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入正整数：");
		while(true) {
			try {
				month = sc.nextLine();
				boolean bool = month.matches("[0-9]*");
				if(!bool) throw new Exception();
			}catch(Exception e) {
				System.out.println("请输入正整数");
				continue;
			}
			break;
		}
		int mon = Integer.valueOf(month);
		System.out.println("第"+month+"个月的兔子对数为："+method1(mon));
		
	}
	
	public static int method(int i) {
		if(i == 1) {
			return 1;
		} else {
			return i * method(i-1);
		}
	}
	
	public static int method1(int i) {
		if(i == 1 || i == 2) {
			return 1;
		} else {
			return method1(i-1)+method1(i-2);
		}
	}

	

}
