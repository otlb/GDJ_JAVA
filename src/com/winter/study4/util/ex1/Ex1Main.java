package com.winter.study4.util.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		//위아래는 같다
		//하지만 위에는 주소가 남아있고 밑에는 주소가 사라져 다시 출력하려면 새로 만들어야한다
		StudentController st = new StudentController();
		st.start();
		
//		new StudentController().start();

	}

}
