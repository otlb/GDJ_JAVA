package com.winter.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherDAO {

	//DAO : Data Access Onject 데이터에 접근하는 클래스
	
	//getWeathers
	//file에서 내용을 읽어오는 역할을 하는 메서드
	//파싱 작업 ,토큰 분류별 저장 그걸 Arayy 저장  
	public ArrayList<WeatherDate> getWeathers() throws Exception {
				
		File file = new File("c:\\study\\weather.txt");		
		FileReader fr = new FileReader(file);		
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		
		ArrayList<WeatherDate> dates = new ArrayList<>();
		
		while(true) {
			
		String s = br.readLine();	
		if(s==null) {
			break;
		}			
		
		StringTokenizer str = new StringTokenizer(s,"-");
				
		
			
			WeatherDate date = new WeatherDate();
			date.setName(str.nextToken());
			date.setTemp(Integer.parseInt(str.nextToken()));
			date.setWeather(str.nextToken());
			date.setHum(Integer.parseInt(str.nextToken()));
			dates.add(date);
		
		}
				
	
		
		
		br.close();
		fr.close();
		
		return dates;	
	}
		
		
		
	}
	
	
	

