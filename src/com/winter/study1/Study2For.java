package com.winter.study1;

import java.util.Scanner;

public class Study2For {
	public static void main(String[]agrs) {
		//아이디와 패스워드를 입력받습니다.
		//로그인 성공 유무 판단
		//로그인 시도 횟수는 최대 5번
		int id =1234;
		int pw =5678;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를입력하세요");
		int Id = sc.nextInt();
		System.out.println("비밀번호를입력하세요");
		int Pw = sc.nextInt();
		boolean check = false; // false면 로그인 실패
		String result = "로그인 실패";
		
		for(int i=0; i<5; i++) {
			if(Id==id && Pw==pw) {
//				System.out.println("로그인되었습니다.");
				result="로그인 성공";
				check = !check;				
				break;
			}					
		} 
		System.out.println(result);
		
//		if(check) {
//			System.out.println("로그인되었습니다.");
//		}else {
//			System.out.println("로그인 실패.");
//		}
		
	}
}
