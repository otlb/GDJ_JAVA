package com.winter.study1;

import java.util.Scanner;

public class Sutdy4For {
	public static void main(String[]args) {
		
		
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번입력 단발 2번입력 점사");
		int danbal = sc.nextInt();
		String tang = "탕탕탕";

		
		if(danbal==1) {
		for(int i=1; i<4; i++) {
			for(int j=1; j<31; j++) {
				System.out.println(i+"번째탄창 "+j+"발");
				}
			}
		}
		if(danbal==2) {
			for(int i=1; i<4; i++) {
				for(int j=3; j<31; j=j+3) {
					System.out.println(tang);
					System.out.println(i+"번째탄창 "+j+"발");
					}
				}
			}
		
		
		
	}
}
