package com.winter.study4.util.ex1;

import java.util.ArrayList;

public class StudentView {

	//학생들의 모든 정보를 출력
	//학생 한명의 모든정보를 출력
	public void view(Student student) {
		
	}
	
	public void view(ArrayList<Student> students) {		
		
		//향상된 for문
		//for(모은데이터타입명 변수명:collection변수명){}
		
		for(Student st:students) {
			System.out.println("이름 : "+st.getName());
			System.out.println("번호 : "+st.getNumber());
			System.out.println("언어점수 : "+st.getLanguage());
			System.out.println("영어점수 : "+st.getEnglihs());
			System.out.println("수학점수 : "+st.getMath());
			System.out.println("종합점수 : "+st.getSum());
			System.out.println("평균 : "+st.getAverage());			
			System.out.println("==============");
		}
		
		
	
		
		
	
		
		
		
	}	
}
