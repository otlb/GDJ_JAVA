package com.winter.study7.ex1.client;

import java.net.Socket;

public class ClientController {
	
	
	public void start()throws Exception  {
		
		//1.서버 소켓 연결
		Socket socket = new Socket("192.168.7.200",8282);
		
		//1.날씨정보출력  
		//2.날씨정보검색
		//3.프로그램종료
		
	}

}
