package com.winter.study2.school;

public class SchoolView {	
	
	public void view(Student [] students) {		
		
		for(int i =0; i<students.length; i++) {
		System.out.println("이름 : " + students[i].name);
		System.out.println("번호 : " + students[i].num);		
		System.out.println("점수 : " + students[i].jumsu);	
		
		//심화버전
		//this.view(students[i]); 이거 하나로 위에 3줄을 의미 
		}
	 
	}
	
	public void view(Student student) {
		
		System.out.println("이름 : " + student.name);
		System.out.println("번호 : " + student.num);		
		System.out.println("점수 : " + student.jumsu);
		
	}
	
	public void view(String message) {
		System.out.println(message);
	}
	

}
