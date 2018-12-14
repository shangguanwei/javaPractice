package com.practice;

//Object类是所有类的父类
public class Student extends Object {
	//成员变量
	/*private关键字：
	a:是一个权限修饰符。
	b:可以修饰成员(成员变量和成员方法)
	c:被private修饰的成员只在本类中才能访问。*/
	//封装：面向对象三大特征之一
	//this关键字：代表所在类的对象引用

	private int age;
	private String name;
	static String graduateFrom;
	
	//	构造方法 格式
	//	a:方法名与类名相同
	//	b:没有返回值类型，连void都没有
	//	c:没有具体的返回值

	public Student() {
		
	}
	
	public Student(String name,int age) {
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
	
	public static void eat() {
		System.out.println("eat");
	}
	
	//重写Object toString方法
	@Override
	public String toString() {
		return "Student name:"+name+" Student age"+age;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		//向下转型
//		Student s = (Student)obj;
//		if(!this.name.equals(s.name)) {
//			System.out.println("姓名不等");
//			return false;
//		}
//		
//		if(this.age != s.age) {
//			System.out.println("年龄不等");
//			return false;
//		}
//		
//		System.out.println("相等");
//		return true;
//	}
//	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}

}
