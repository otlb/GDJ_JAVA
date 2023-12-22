package com.winter.study7.ex1.sever;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverController {

	public void start() throws Exception {
		
		//client랑 연결 준비
		System.out.println("클라이언트가 접속하기를 기다리는중");
		ServerSocket ss = new ServerSocket(8282);
		Socket sc = ss.accept();
		System.out.println("client 연결 성공");
		
		
		
	}
	
	
}
