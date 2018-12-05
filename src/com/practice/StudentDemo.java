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
		
		Student[] stuArr = new Student[3];
		Student stu3 = new Student(35,"join");
		stuArr[0] = stu1;
		stuArr[1] = stu2;
		stuArr[2] = stu3;
		
		for (int i=0;i<stuArr.length;i++) {
			Student s = stuArr[i];
			System.out.println("第"+i+"个学生的姓名及年龄："+s.name()+" "+s.age());
		}
	}

}
