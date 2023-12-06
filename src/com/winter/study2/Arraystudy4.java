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
		
		
		String names [] = null;
		String number[] =null;
		double point[]  =null;
		
		
		while(true) {
			System.out.println("1.학생정보생성");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.성정순출력");
			System.out.println("5.프로그램종료");
			check = sc.nextInt();	
		if(check==1) {
			System.out.println("등록할 학생 수를 입력하세요");
			check = sc.nextInt();	
			
			names = new String[check];
			number = new String[check];
			point = new double[check];
			
			   for(int i=0; i<check; i++) {
		            System.out.print("이름을 입력하시오 : ");
		            names[i]=sc.next();
		            System.out.print("번호를 입력하시오 : ");	
		            number[i]=sc.next();
		            System.out.print("학점를 입력하시오 : ");
		            point[i]=sc.nextDouble();
		         }
			
		}else if(check==2) {
			System.out.println("학생정보를 출력합니다.");
			for(int i=0;i<check;i++) {
			System.out.println("이름 : "+names[i]);
			System.out.println("번호 : "+number[i]);
			System.out.println("학점 : "+point[i]);
			}
			
		}else if(check==3) {
			System.out.println("학생정보를 검색하세요");
			System.out.println("0=이름, 1=번호, 2,학점");		
			check = sc.nextInt();			
			for(int i=0; i<names.length; i=i+3) {
				System.out.println(names[i]);
			}
		}
		else if(check==4) {
			System.out.println("4.성정순출력");
		}else if(check==5) {
			System.out.println("프로그램이 종료되었습니다.");
			break;
		}
	
	}
		
	}

}