package com.practice;

public class ExtendsDemo {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.function();
		
		//多态
		//向上转型
		Animal an = new Cat();
		System.out.println(an.num);
		an.method();
		an.func();
		
		//向下转型
		Cat ca = (Cat)an;
		ca.method();
		ca.func();
		
		
	}
}
class Animal {
	int num = 10;
	
	public Animal() {
		System.out.println("父类无参构造");
	}
	
	public Animal(int num) {
		System.out.println("父类有参构造");
	}
	
	public void method() {
		System.out.println("父类method方法");
	}
	
	public static void func() {
		System.out.println("父类静态方法");
	}
}

class Cat extends Animal{
	int num = 20;
	
	public Cat() {
//		super();
//		super(1);
		this(1);
		System.out.println("子类无参构造");
	}
	
	public Cat(int num) {
		System.out.println("子类有参构造");
	}
	
	public void method() {
		System.out.println("子类method方法");
	}
	
	public static void func() {
		System.out.println("子类静态方法");
	}
	
	public void function() {
		System.out.println("子类方法");
//		this.num = 30;
//		num = 40;
//		System.out.println(num);
//		System.out.println(this.num);
//		System.out.println(super.num);
	}
	
}
