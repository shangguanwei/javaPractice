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
		
		while(true) {
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
				removeStudent(stuArr);
				break;
			case "4":
				changeStudent(stuArr);
				break;
			case "5":
				System.exit(0);
				break;
			default:
				System.out.println("输入有误，系统已退出");
				System.exit(0);
				break;
			}
		}
				
	}
	
	public static void findAllStudent(ArrayList<Student> stuArr) {
		if(stuArr.size() == 0) {
			System.out.println("当前系统没有学生");
			//没有学生的话直接退出
			return;
		}
		
		for(int i=0;i<stuArr.size();i++) {
			Student s = stuArr.get(i);
			System.out.println(s.name()+" "+s.age());
		}
		
	}
	
	public static void addStudent(ArrayList<Student> stuArr) {
		Scanner sc;
		String nameStr = "";
		System.out.println("请输入姓名：");
		//循环输入
		while(true) {
			sc = new Scanner(System.in);
			try {
				nameStr = sc.nextLine();
				if(nameStr.length()>10) throw new Exception();
			} catch (Exception e){
				System.out.println("姓名长度在10字符以内，请重输：");
				continue;
			}
			break;
		}
		
		int age;
		System.out.println("请输入年龄：");
		while(true) {
			sc = new Scanner(System.in);
			try {
				age = sc.nextInt();
				if(age<0 || age>200) throw new Exception();
			} catch (Exception e){
				System.out.println("年龄在0-200之间，请重输：");
				continue;
			}
			break;
		}
		
		Student newStu = new Student(nameStr,age);
		stuArr.add(newStu);
	}
	
	public static void removeStudent(ArrayList<Student> stuArr) {
		System.out.println("请输入要删除第几个学生");
		Scanner sc;
		int x;
		//循环输入
		while(true) {
			sc = new Scanner(System.in);
			try {
				x = sc.nextInt();
				if(x>stuArr.size()) throw new Exception();
			} catch (Exception e){
				System.out.println("请输入"+stuArr.size()+"以内的正整数：");
				continue;
			}
			break;
		}
		stuArr.remove(--x);
		
	}
	
	public static void changeStudent(ArrayList<Student> stuArr) {
		
		Scanner sc;
		int num;
		System.out.println("请输入要修改学生所在序列");
		while(true) {
			sc = new Scanner(System.in);
			try {
				num = sc.nextInt();
				if(num>stuArr.size()) throw new Exception();
			} catch (Exception e){
				System.out.println("请输入"+stuArr.size()+"以内的正整数：");
				continue;
			}
			break;
		}
		
		System.out.println("请输入姓名：");
		String nameStr;
		while(true) {
			sc = new Scanner(System.in);
			try {
				nameStr = sc.nextLine();
				if(nameStr.length()>10) throw new Exception();
			} catch (Exception e){
				System.out.println("长度限制10字符以内：");
				continue;
			}
			break;
		}
		
		int age;
		System.out.println("请输入年龄：");
		while(true) {
			sc = new Scanner(System.in);
			try {
				age = sc.nextInt();
				if(age<0 || age>200) throw new Exception();
			} catch (Exception e){
				System.out.println("请输入200以内的正整数：");
				continue;
			}
			break;
		}
		
		Student newStu = new Student(nameStr,age);
		stuArr.set(num--, newStu);
		
	}

}
