package com.winter.study4.lang;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		String name = "winter"; //불변
		String name2 = "winter";
		
		System.out.println(name == name2);
		System.out.println("이름입력");
		String name3=sc.next();
		System.out.println(name==name3);
		
		//문자열 데이터 값 비교방법 equals 
		System.out.println(name.equals(name3));
		
		char a = name.charAt(1);		
		System.out.println(a);
		
		for(int i = 0; i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
		
		String n = "abc";
		String n2 = "123";
		
		n = n+n2;
		
		
		
		
		
	}

}
