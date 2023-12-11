package com.winter.study2.rpg;

public class Magiction {

	int hp;
	int mp;
	String name;
	
	
	
	public void info() {
		
//		String name="abc";
		//멤버메서드내에서 멤버변수를 접근해서 사용 가능
//		name="iu";
		
		System.out.println(this);
		System.out.println("Name : "+name);
		System.out.println("Hp : " +this.hp);
		this.t1();
//		t1();
	}
	
	
	public void t1() {
		System.out.println("Test 메서드 입니다");
		
	}
	
	
	
}
