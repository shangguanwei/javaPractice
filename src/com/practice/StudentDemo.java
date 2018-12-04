package com.practice;

public class StudentDemo {
	public static void main(String[] args) {
		Student stu1 = new Student();
		System.out.println("stu1-name:"+stu1.name()+" stu1-age:"+stu1.age());
		stu1.setAge(26);
		stu1.setName("sgw");
		System.out.println("stu1-name:"+stu1.name()+" stu1-age:"+stu1.age());
		
		Student stu2 = new Student(30,"Tom");
		System.out.println("stu2-name:"+stu2.name()+" stu2-age:"+stu2.age());
		
		
	}

}
