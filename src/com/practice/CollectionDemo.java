package com.practice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionDemo {
	public static void main(String[] args) {
		String[] arr = new String[5];
		arr[0] = "aaa";
		arr[1] = "bbb";
		arr[2] = "ccc";
		arr[3] = "ddd";
		arr[4] = "eee";
		//增强for,遍历数组和集合
		for(String s : arr) {
			System.out.println(s);
		}
		
		Collection<String> c = new ArrayList<String>();
		c.add("abc");
		c.add("def");
		c.add("hij");
		for(String s : c) {
			System.out.println(s);
			//增强for循环中不允许修改集合，否则会出现并发异常
			//c.add("klm");
		}
		
		List list = new ArrayList();
		list.add(0, "qqqqq");
		list.add(1, "wwwww");
		list.add(2, "eeeee");
		
		ListIterator it = list.listIterator();
		while(it.hasNext()) {
			//报错
			//list.add("qwer");
			System.out.println(it.next());
		}
	}

}
