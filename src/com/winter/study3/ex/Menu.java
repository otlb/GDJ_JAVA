package com.winter.study3.ex;

import java.util.Scanner;

public class Menu {

	public void start(){
		
		
		
		Scanner sc = new Scanner(System.in);
		Maniger maniger = new Maniger();
		
		View view = new View();
		Product [] products = null;
		
		
		boolean check = true;
		while(check) {
			System.out.println("1.추가하기");
			System.out.println("2.수정하기");
			System.out.println("3.삭제하기");
			System.out.println("4.목록보기");
			System.out.println("5.자세히보기");
			System.out.println("6.종료합니다");
			
		int select = sc.nextInt();
			if(select == 1) {
				products = maniger.add(products);
			}
			else if(select == 2) {
				System.out.println("2.명함 수정하기");
			}
			else if(select == 3) {
				products = maniger.delete(products);
			}
			else if(select == 4) {
				view.view(products);
			}
			else if(select == 5) {
				
				Product p = maniger.find(products);
				if(p!=null) {
					view.view(p);
				}else {
					view.view("명함이없습니다.");
				}
								
			}
			else {
				System.out.println("6.종료합니다");	
				check = false;
			}
			
			
		}		
		
		

	}

}
