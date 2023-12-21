package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Sever {

	public void s() throws Exception{
		
		System.out.println("클라이언트가 접속하기를 기다리는중");
		ServerSocket ss = new ServerSocket(8282);
		Socket sc = ss.accept();
		System.out.println("client 연결 성공");
		
		InputStream is =null;
		OutputStream os= null;
		OutputStreamWriter ow =null;
		BufferedWriter bw = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner sr = new Scanner(System.in);
		
		
		while(true) {
						
			
		is = sc.getInputStream();//0,1
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		System.out.println(br.readLine());
		if(br.equals("exit")) {
			System.out.println("종료");
			break;
		}	 
		
		
		System.out.println("클라이언트로 보낼 메세지 입력");
		String str = sr.next();
					
		
		os = sc.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		bw.write(str+"\n\r");
		bw.flush();
		
		}
		sr.close();
		br.close();
		ir.close();
		bw.close();
		ow.close();
		os.close();
		
		is.close();
		ss.close();
		
		
		
		System.out.println("서버 프로그램 종료");
		
	}
}
