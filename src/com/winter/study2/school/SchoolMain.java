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
		
				
			System.out.println("학생의 수 입력");
			int check = sc.nextInt();
			Student [] stu = new Student[check];
			
		
			
				for(int i=0; i<check; i++) {
					Student ar = new Student();
					stu[i]=ar;
					System.out.println("이름을 입력하시오");
					stu[i].name = sc.next(); 
					System.out.println("번호을 입력하시오");
					stu[i].num = sc.nextInt(); 
					System.out.println("학점을 입력하시오");
					stu[i].jumsu = sc.nextDouble(); 
				}
									
			
			
			for(int i=0;i<check;i++) {
				System.out.println(stu[i].name);			
			}
			
		
		
	
		
	}
}
