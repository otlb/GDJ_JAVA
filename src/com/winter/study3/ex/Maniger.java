package com.winter.study3.ex;

import java.util.Scanner;

public class Maniger{
	
	
	public Product [] add(Product[] products) {
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		
		System.out.println("명함의 정보를 입력하세요");
		System.out.print("0.번호를 입력 : ");
		int num = sc.nextInt();
		product.setNum(num);
		
		System.out.print("1.이름 : ");
		String name = sc.next();
		product.setName(name);
		
		System.out.print("2.전화번호 : ");
		String number = sc.next();
		product.setNumber(number);
		
		System.out.print("3.직급 : ");
		String rank = sc.next();
		product.setRank(rank);
		
		System.out.print("4.주소 : ");
		String address = sc.next();
		product.setAddress(address);

		System.out.print("5.이메일 : ");
		String email = sc.next();
		product.setEmail(email);
		
		System.out.print("6.회사명 : ");
		String company = sc.next();
		product.setCompany(company);	
		
		//배열이 null 체크
		if(products == null) {
			Product [] products2 = new Product[1];
			products2[0] = product;
			return products2;
		}else {
		
		Product [] newproducts = new Product[products.length+1];
		
		for(int i=0; i<products.length; i++) {
			newproducts[i] = products[i];			
		}
		
			newproducts[products.length] = product ;
			
			return newproducts;		
		}
		
	}
	
	public Product [] delete(Product products[]) {
					
		System.out.println("삭제할 번호를 입력하세요");	
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		int index = -1;
		
		//삭제할 명함의 인덱스 번호 찾기
		for(int i=0; i<products.length;i++) {
			if(select == products[i].getNum()) {				
				index=i;
				break;
				}				
			}
		
		if(index!=-1) {
			Product [] newPrduct = new Product[products.length-1];
			int j=0;
			for(int i=0;i<products.length;i++) {
				if(index==i) {
					continue;
				}
				newPrduct[j]=products[i];
				j++;
			}
			
			return newPrduct;
			
		}else {
			return products;	
						
		}
		
	}
		
		public Product find(Product[] products) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("검색할 명함 번호 검색");
			int num = sc.nextInt();
			
			Product product = null;
			
			for(int i=0; i<products.length;i++) {
				if(products[i].getNum()== num) {
					product = products[i];
					break;
				}
				
			}
			
			return product;
		}	
}
	

	
	

