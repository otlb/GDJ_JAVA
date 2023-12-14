package com.winter.study4;

public class ApiMain {

	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		
		
		
		Object object = new Object();
		
		
		//매서드 선언공식
		//접근지정자 [그외지정자] 리턴타입 매서드명([매개변수]){}	
		
		//참조변수명.변수명
		//참조변수명.매서드명([]);
		boolean ch = object.equals(object);
		System.out.println(ch);
		
		String ab = object.toString();
		System.out.println(ab);
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append(123);
		
		
		
	}
	
	

}
