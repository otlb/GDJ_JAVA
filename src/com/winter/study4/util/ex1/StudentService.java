package com.winter.study4.util.ex1;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentService {
	
	private String info;
	
	public StudentService() {
		this.info="안인권-1-60-40-80";
		this.info = this.info+"-홍길동-2-90-75-65";
		this.info = this.info+"-장발장-3-60-45-25";
	}

	
	//init
	//info 파싱해서 
	//이름 번호 국영수 총점 평균
	
	public ArrayList<Student> init() {	
			
		ArrayList<Student> students = new ArrayList<>();
		
		StringTokenizer str = new StringTokenizer(info,"-");
		
		while(str.hasMoreTokens()) {
			Student	student = new Student();
			student.setName(str.nextToken());
			student.setNumber(Integer.parseInt(str.nextToken()));
			student.setLanguage(Integer.parseInt(str.nextToken()));
			student.setEnglihs(Integer.parseInt(str.nextToken()));
			student.setMath(Integer.parseInt(str.nextToken()));	
			
//			int e =student.getEnglihs();
//			int m = student.getMath();
//			int l = student.getLanguage();
//			student.setSum(m+e+l);
			student.setSum(student.getEnglihs()+student.getLanguage()+student.getMath());
			
			student.setAverage(student.getSum()/3.0);
//			double s = student.getSum();
//			student.setAverage(s/3.0);
			
			students.add(student);			
			
		}	
		
		
			
		return students;
		
		
		//학생정보검색 findByName 이름으로 검색
		//학생정보추가 studentAdd 
		//학생정보삭제 studentDelete 이름으로 검색해서 삭제
		
		
	}
	
	
}
