package com.practice;

public class PlayerCoachDemo {
	public static void main(String[] args) {
		
		func1();
		func2();
	}
	
	//练习继承
	public static void func1() {
		BasketBallPlayer bbp = new BasketBallPlayer();
		bbp.name = "Tom";
		bbp.age = 18;
		bbp.gender = "男";
		bbp.eat();
		bbp.study();
		bbp.speakEnglish();
//		new BasketBallPlayer().gender = "男";
//		new BasketBallPlayer().eat();
	}
	
	//练习多态
	public static void func2() {
		Person per1 = new Person("Marry",20,"女");
		//抽象类不能实例化，下行报错
		//Person per2 = new Player();
		Person per2 = new BasketBallPlayer();
		per2.eat();
		//study()方法无法调用
		//per1.study();
		//多态无法直接访问子类成员，通过接口调用实现间接访问
		per2.speak(new BasketBallPlayer());
		Player per3 = new BasketBallPlayer();
		per3.study();
		per3.eat();
		
	}

}

class Person {
	String name;
	int age;
	static String gender;
	
	Person() {
		
	}
	
	Person(String name,int age,String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public static void sleep() {
		System.out.println("睡觉");
	}
	
	public void speak(SpeakEnglish se) {
		se.speakEnglish();
	}
}


//抽象类
abstract class Player extends Person {
	public abstract void study();
}

//接口
interface SpeakEnglish {
	public abstract void speakEnglish();
}

//运动员类
class BasketBallPlayer extends Player implements SpeakEnglish {
	
	@Override
	public void study() {
		System.out.println("学习打篮球");
	}
	
	@Override
	public void speakEnglish() {
		System.out.println("学习英语");
	}
}

class PingPangPlayer extends Player {
	
	@Override
	public void study() {
		System.out.println("学习打乒乓球");
	}
}

