package com.practice;

public class Student {
	//成员变量
	/*private关键字：
	a:是一个权限修饰符。
	b:可以修饰成员(成员变量和成员方法)
	c:被private修饰的成员只在本类中才能访问。*/
	//封装：面向对象三大特征之一
	//this关键字：代表所在类的对象引用

	private int age;
	private String name;
	
	//	构造方法 格式
	//	a:方法名与类名相同
	//	b:没有返回值类型，连void都没有
	//	c:没有具体的返回值

	public Student() {
		
	}
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//成员方法
	public void setAge(int age) {
		this.age = age;
	}
	
	public int age() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}

}
