package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	
	public void send()  throws Exception{
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.200",8282);
		OutputStream os= null;
		OutputStreamWriter ow =null;
		BufferedWriter bw = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		InputStream is = null;
		System.out.println("서버와 접속 성공");
		
		while(true) {	
			
		System.out.println("서버로 보낼 메세지 입력");
		String m = sc.next();
				
		os = socket.getOutputStream(); //0,1
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		bw.write(m+"\n\r");
		bw.flush();
		
		if(m.toUpperCase().equals("EXIT")) {			
			System.out.println("종료");			
			break;
		}		
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		System.out.println(br.readLine());
		
		}
		
		if(is != null) {
			is.close();		
		}
		br.close();
		ir.close();		
		
		
		bw.close();
		ow.close();
		os.close();
		socket.close();
		sc.close();
	}
}
