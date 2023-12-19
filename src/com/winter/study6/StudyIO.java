package com.winter.study6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StudyIO {
	
	
	public void input() {
		//키보드에서 입력
		
		//byte처리 ->
		InputStream is = System.in; 
		
		//문자로 ->
		InputStreamReader ir = new InputStreamReader(is);
		
		//문자열로
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String str =  br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
