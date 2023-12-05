package com.winter.study1;

import java.util.Scanner;

public class Sutdy4For {
	public static void main(String[] args) {
		
		//1. 로그인 처리
		// 1번 로그인 2번 종료
		// id,pw 입력 
		//실패하면 다시 로그인 종료 화면
		
//		Scanner sc = new Scanner(System.in);
//		int id=1234;
//		int pw=5678;
//		boolean check = true;
//		
//	
//		while(check){
//			System.out.println("1번:로그인 2번:종료");
//			int login = sc.nextInt();
//			if(login==1) {
//				System.out.println("ID입력");
//				int yId=sc.nextInt();
//				System.out.println("PW입력");
//				int yPw=sc.nextInt();
//				if(yId==id&&yPw==pw) {
//					System.out.println("로그인 성공");
//					break;
//				}else {
//					System.out.println("ID나 PW가 틀림");
//				}
//			}else {
//				check=false;
//			}
//			
//		}
//		
//		if(check) {
//			System.out.println("게임시작");
//			
//			
//		}
		
		
	   for(int i=0;i<15;i++) {
			int monster = i*3;
			int gold =  0;
			
			if(i%5==0) {
				System.out.println(gold+"G");
			}
			System.out.print(monster+"마리사냥->");
			System.out.println(i+1+"레벨");	
			
			if(i==14) {
				System.out.println("최종레벨 :"+(i+1)+"보유골드");
				
			}			
		 }
	
						
		//2. MMORPG 로그인 되면 실행
		//레벨은 1부터 시작
		//골드0 시작
		//레벨1에서 2로 갈땐 3마리 한마리사냥 두마리사냥 표시 렙업 할땐 축 레벨업 표시
		//2에서 3으로갈땐 6마리 
		//3에서 4는 9마리
		//최종 15레벨 끝
		
		//레벨 5렙 달성시 1000골드 지급
		//10렙달성시 2000골드
		//15렙 3000골드
		
		//최종 레벨과 골드 출력하고 게임 종료 
		
		
	}
}
