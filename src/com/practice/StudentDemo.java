package com.practice;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Student stu1 = new Student();
//		System.out.println("stu1-name:"+stu1.name()+" stu1-age:"+stu1.age());
		stu1.setAge(26);
		stu1.setName("sgw");
		Student stu2 = new Student("Tom",30);
//		System.out.println("stu1-name:"+stu1.name()+" stu1-age:"+stu1.age());
//		System.out.println("stu2-name:"+stu2.name()+" stu2-age:"+stu2.age());
		
		Student stu3 = new Student("join",30);
		
		//数组
		/*Student[] stuArr = new Student[3];
		stuArr[0] = stu1;
		stuArr[1] = stu2;
		stuArr[2] = stu3;
		
		for (int i=0;i<stuArr.length;i++) {
			Student s = stuArr[i];
			System.out.println("第"+i+"个学生的姓名及年龄："+s.name()+" "+s.age());
		}*/
		
		//集合ArrayList
		ArrayList<Student> stuArr = new ArrayList<Student>();
		stuArr.add(stu1);
		stuArr.add(stu2);
		stuArr.add(stu3);
		
		System.out.println("---学生管理系统---");
		System.out.println("1.查看所有学生");
		System.out.println("2.增加学生");
		System.out.println("3.删除学生");
		System.out.println("4.修改学生");
		System.out.println("5.退出");
		System.out.println("请输入：");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		switch (choice) {
		case "1":
			findAllStudent(stuArr);
			break;
		case "2":
			addStudent(stuArr);
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		default:
			System.out.println("输入有误，系统已退出");
			System.exit(0);
			break;
		}
				
	}
	
	public static void findAllStudent(ArrayList<Student> stuArr) {
		for(int i=0;i<stuArr.size();i++) {
			Student s = stuArr.get(i);
			System.out.println(s.name()+" "+s.age());
		}
		
	}
	
	public static void addStudent(ArrayList<Student> stuArr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String nameStr = sc.nextLine();
		if(nameStr.length()<10) {
			System.out.println("已录入");
		} else {
			System.out.println("长度限制，请重输");
			nameStr = sc.nextLine();
		}
		
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		if(age>0 && age<200) {
			System.out.println("已录入");
		} else {
			System.out.println("长度限制，请重输");
			age = sc.nextInt();
		}
		
		Student newStu = new Student(nameStr,age);
		stuArr.add(newStu);
	}
	
	public static void moveStudent(ArrayList<Student> stuArr) {
		System.out.println("请输入要删除第几个学生");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x<stuArr.size()) {
			stuArr.remove(x--);
		} else {
			System.out.println("输入列数有误！请重输");
			x = sc.nextInt();
		}
	}

}
