package com.practice;

public class StringDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("          world");
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
