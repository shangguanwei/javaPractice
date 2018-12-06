package com.practice;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("zhangsan");
		array.add(1, "wangwu");
		array.add("wangwu");
		array.add("abc");
		
		//以索引方式删改，返回被修改、被删除的值
		System.out.println(array.set(1, "lisi"));
		System.out.println(array.remove(3));
		System.out.println(array);
		
		//数组遍历
		for(int i=0;i<array.size();i++) {
			String str = array.get(i);
			System.out.println(str);
		}
	}

}
