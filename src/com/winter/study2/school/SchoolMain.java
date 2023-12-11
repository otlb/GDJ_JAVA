package com.winter.study2.school;

import java.util.Scanner;

public class SchoolMain {
	public static void main(String[]args) {
		
		//객체 생성
		//클레스명 변수명 = new 클레스명();
		//학생의 수를 입력받아서
		//학생의 정보를 입력받기
		
//		Student stu1 = new Student();
//		stu1.name="안인권";
//		stu1.num=1022949426;
//		stu1.jumsu=3.1;
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int check;
		
		System.out.println("학생수를 입력하세요");
		check = sc.nextInt();
		
		Student [] stu = new Student[check];
		
		for(int i =0; i<check; i++) {
			Student ar = new Student();
			System.out.println("이름을 입력하세요");
			stu[i].name = sc.next();
			
		}
		
		
			
		
			
		
		
	
		}
	}

