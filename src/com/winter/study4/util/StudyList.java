package com.winter.study4.util;

import java.util.ArrayList;

public class StudyList {

	public static void main(String[] args) {
		
		//배열과 비슷
		//선언시 따로 갯수를 선언하지않음
		ArrayList ar = new ArrayList();
		//추가 add - list 끝에 
		ar.add("first"); 
		ar.add("second");
		ar.add(3);
		ar.add('a');
		System.out.println(ar.size());
		// 삽입의 개념 인덱스1번에 4 를 넣어라
		ar.add(1, 4);
		// 수정의 개념 인덱스0번을 1로 바꿔라
		ar.set(0, 1);
		// 인덱스 번호의 데이터를 지워라
		ar.remove(1);
		// 해당 객체랑 같은 데이터를 지워라
		ar.remove("second");
		// 안에있는 엘리먼트만 지움 
		ar.clear();

		for(int i=0; i<ar.size();i++) {
			//get  
			System.out.println(ar.get(i));
		}
		
		
	}

}
