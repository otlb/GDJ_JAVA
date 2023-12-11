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
	
	//findByNum
	//학생번호를 입력받아서 인치하는 학생이 있는지 검색
	//해당학생을 리턴 없으면 null을 리턴
	
	public Student findByNum(Student [] students) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("검색할 학생 번호를 입력하세요");
		
		int number = sc.nextInt();
		
		Student student = null;
				
		for(int i=0; i<students.length; i++) {			
			if(students[i].num == number) {
//				return students[i];
				student = students[i];
				break;
				
			}
		}
		
	return student;
		}	
		
	
	//addStudent
	//이름, 번호, 점수를 입력받아서 기존 배열에 추가한 효과
	public Student [] addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가 할 학생 수를 입력하시오");
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
