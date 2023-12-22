package com.winter.study7.ex1.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.winter.study6.ex1.WeatherDate;

public class ClientController {
	private ClientView cv;
	
	public ClientController() {
		this.cv = new ClientView();
	}
	
	
	public void start()throws Exception  {
		
		//1.서버 소켓 연결
		Socket socket = new Socket("192.168.7.200",8282);
		System.out.println("서버와 접속 성공");
		//1.날씨정보출력  입력된 1을 서버로 보내고 1을 입력받은 서버는 날씨정보를 클라이언트로 보냄 그정보를 클라이언트뷰에서 출력 
		//보낼준비
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		//받을준비
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		//2.날씨정보검색
		//3.프로그램종료
		boolean check = true;
		List<WeatherDate> ar = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(check) {
			System.out.println("1.날씨정보출력");
			System.out.println("3.프로그램종료");
			int number = sc.nextInt();
			if(number == 1) {
				bw.write(number+"\n\r");
				bw.flush();
				
				String data = br.readLine();// 오는 형식이 p-1-z-3-d-4 이런 형태로 옴
				StringTokenizer st = new StringTokenizer(data,"-");
				while(st.hasMoreTokens()) {
					WeatherDate date =new WeatherDate();
					date.setName(st.nextToken()); //도시
					date.setTemp(Integer.parseInt(st.nextToken())) ;//기온
					date.setWeather(st.nextToken()) ;//날씨
					date.setHum(Integer.parseInt(st.nextToken())) ;//습도
					ar.add(date);
				}
				cv.view(ar);
				
				
				
				
			}else{
				System.out.println("종료");
				break;
			}
			
			
			
		}
		
	}

}
