package com.winter.study1;

import java.util.Scanner;

public class Study1For {
	public static void main(String[]args) {
		System.out.println("프로그램시작");
		System.out.println("테스트");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나를 입력하세요");
		int num = sc.nextInt();
		
		//입력받은 정수에 약수를 출력하세요
		//약수의 갯수를 출력하세요.
		
		int number = 0 ;
		for(int i=1; i<=num; i++ ) {
			if(num%i==0) {
				System.out.println(i);
				number++;
			}
		}		
		System.out.println("약수의 갯수 : "+number);
		
		
		
	}
}
