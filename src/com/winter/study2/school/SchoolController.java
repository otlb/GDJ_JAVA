package com.winter.study2.school;

import java.util.Scanner;

public class SchoolController {

	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		SchoolService schoolService = new SchoolService();
		Student [] students = null;
		
		SchoolView schoolView = new SchoolView();
		
		int check;
		
		boolean select = true;
		
		while(select) {
			System.out.println("1.학생정보입력");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.학생정보추가");
			System.out.println("5.프로그램종료");
			check = sc.nextInt();
			if(check==1) {
				students = schoolService.makeStudents();				
			}else if(check==2) {
				schoolView.view(students);			
			}else if(check==3) {
			Student s  = schoolService.findByNum(students);
			if(s != null) {
				schoolView.view(s);
			}else {
				schoolView.view("학생이없다");
			}			
			}else if(check==4) {
				
				
			}else {
				System.out.println("프로그램이 종료되었습니다.");
				select = false;
			}
			
		
		}
		
		
	}
	
	
	
}
