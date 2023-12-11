package com.winter.study2.school;

import java.util.Scanner;

public class SchoolService {
	
	// 메서드 makeStudents
	// 학생수를 입력받아서 학생 수만큼 학생정보를 입력
	
	public Student [] makeStudents() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("학생 수를 입력하시오");
	int check = sc.nextInt();
	
	Student [] stu = new Student[check];
	
	for(int i=0; i<check; i++) {
		Student student = new Student();
		stu[i] = student;
		System.out.println("이름을 입력하세요");
		stu[i].name = sc.next();
		System.out.println("번호을 입력하세요");
		stu[i].num = sc.nextInt();
		System.out.println("점수를 입력하세요");
		stu[i].jumsu = sc.nextDouble();
		
	}	
	
	return stu;
	
	
	}
}
