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
		Student [] stu = null;
		int i=0;
				
		
			while(true) {
				System.out.println("1.학생정보생성");
				System.out.println("2.학생정보출력");
				System.out.println("3.학생정보검색");
				System.out.println("4.성정순출력");
				System.out.println("5.프로그램종료");
				int check = sc.nextInt();
				
				if(check==1) {
					System.out.println("학생의 수 입력");
					check = sc.nextInt();	
					stu = new Student[check];	
					
				for(; i<check; i++) {					
					Student ar = new Student();
					stu[i]=ar;
					System.out.println("이름을 입력하시오");
					stu[i].name = sc.next(); 
					System.out.println("번호을 입력하시오");
					stu[i].num = sc.nextInt(); 
					System.out.println("학점을 입력하시오");
					stu[i].jumsu = sc.nextDouble(); 
				}
			}else if(check==2) {
				
				System.out.println("모든 학생의 정보를 출력합니다.");
				for(; i<check; i++) {
					System.out.println(stu[i].name);
				}
				for(; i<check; i++) {
					System.out.println(stu[i].num);
				}
				for(; i<check; i++) {
					System.out.println(stu[i].jumsu);
				}
			}//else if(check==3) {
//				System.out.println("학생 정보를 검색하세요");
//				System.out.println("1번:이름 2번:번호 3번:학점");
//				int check2 = sc.nextInt();
//				switch (check2) {
//				case 1:
//					System.out.println(stu[i].name);
//					
//					break;
//				default:
//					break;
//				}
//			}
//		
			
			
		
			
		
		
	
		}
	}
}
