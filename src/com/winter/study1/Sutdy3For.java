package com.winter.study1;

import java.util.Scanner;

public class Sutdy3For {
	public static void main(String [] args) {
		//구구단
		
//		for(int i=2; i<10;i++) {
//			for(int j=1; j<10; j++) {
//				System.out.println(i+"X"+j+"="+i*j);
//				
//			}
//		}
		
		Scanner sc =new Scanner(System.in);
		//시계
		//0-59분 0-59초
		//지정하는 분,초를 입력하면 종료 
		System.out.println("분을 입력하세요");
		int min = sc.nextInt();
		System.out.println("초을 입력하세요");
		int sec = sc.nextInt();
		boolean check =false;
		
//	 	반복문을 종료하는 방법
//		1.break 만났을때
//		2.조건식이 false일때
		
		for(int i=0; i<60;i++){
			for(int j=0; j<60; j++){
				System.out.println(i+"분 "+j+"초");
				if(i==min && j==sec) {
//					check = !check;	
					i=60;
					break;
				}			
			}
//			if(check) {
//				break;
//			}
		}
		
		
		
	}
}
