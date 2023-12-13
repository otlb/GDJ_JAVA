package com.winter.study3.ex;

import com.winter.study2.school.Student;

public class View {

	public void view(Product[] products) {
		
		for(int i =0; i<products.length; i++) {
			
			System.out.println("명함번호 : "+products[i].getNum());
			System.out.println("이름 : "+products[i].getName());
			System.out.println("전화번호 : "+products[i].getNumber());
					
			
		}
		
	}
	
	public void view(Product product) {
		
		System.out.println("이름 : "+product.getName());
		System.out.println("전화번호 : "+product.getNumber());
		System.out.println("직급 : "+product.getRank());
		System.out.println("주소 : "+product.getAddress());
		System.out.println("이메일 : "+product.getEmail());
		System.out.println("회사명 : "+product.getCompany());		
		
		
	}
	

	public void view(String ms) {
		System.out.println(ms);
	}
	
	
	
	
}
