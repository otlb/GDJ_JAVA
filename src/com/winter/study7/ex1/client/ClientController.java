package com.winter.study7.ex1.client;

import java.net.Socket;
import java.util.Scanner;

public class ClientController {
	
	
	public void start()throws Exception  {
		
		//1.서버 소켓 연결
		Socket socket = new Socket("192.168.7.200",8282);
		System.out.println("서버와 접속 성공");
		//1.날씨정보출력  입력된 1을 서버로 보내고 1을 입력받은 서버는 날씨정보를 클라이언트로 보냄 그정보를 클라이언트뷰에서 출력 
		//2.날씨정보검색
		//3.프로그램종료
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("1.날씨정보출력");
//			System.out.println("3.프로그램종료");
//			int number = sc.nextInt();
//			if(number == 1) {
//				
//			}else{
//				System.out.println("종료");
//				break;
//			}
//			
//			
//			
//		}
		
	}

}
