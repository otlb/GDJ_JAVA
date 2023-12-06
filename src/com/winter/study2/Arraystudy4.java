package com.winter.study2;

import java.util.Scanner;

public class Arraystudy4 {

	public static void main(String[] args) {
		//1.학생정보생성
		//학생수를 입력받음
		//학생수 만큼 이름 번호 학점
		//2.학생정보출력(모든학생)
		//3.학생정보검색
		//검색할 학생번호를 입력받아서 해당학생의 정보를 출력
		//4.성적순출력
		//5.프로그램종료
		Scanner sc = new Scanner(System.in);
		int check;
		
		
		while(true) {
			System.out.println("1.학생정보생성");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.성정순출력");
			System.out.println("5.프로그램종료");
			check = sc.nextInt();			
		if(check==1) {
			System.out.println("1.학생정보생성");
		}else if(check==2) {
			System.out.println("2.학생정보출력");
		}else if(check==3) {
			System.out.println("3.학생정보검색");
		}
		else if(check==4) {
			System.out.println("4.성정순출력");
		}else if(check==5) {
			System.out.println("프로그램이 종료되었습니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
		break;
	}
		
	}

}