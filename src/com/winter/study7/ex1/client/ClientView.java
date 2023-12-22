package com.winter.study7.ex1.client;

import java.util.List;

import com.winter.study6.ex1.WeatherDate;

public class ClientView {
	
	
	//날씨정보출력 
	public void view(WeatherDate date) {
		if(date == null) {
			System.out.println("못찾았다");
			return;
		}
		
		System.out.println("도시명\t기온\t날씨\t습도");
		System.out.print("지역 :"+date.getName()+"\t");
		System.out.print("온도 :"+date.getTemp()+"\t");
		System.out.print("날씨 :"+date.getWeather()+"\t");
		System.out.print("습도 :"+date.getHum()+"%\n");
		System.out.println("================================");
		
		
	}
	
	
	public void view(List<WeatherDate> ar) {
		
		System.out.println("도시명\t기온\t날씨\t습도");
		for(WeatherDate wd : ar) {
			System.out.print("지역 :"+wd.getName()+"\t");
			System.out.print("온도 :"+wd.getTemp()+"\t");
			System.out.print("날씨 :"+wd.getWeather()+"\t");
			System.out.print("습도 :"+wd.getHum()+"%\n");
			System.out.println("================================");
			
			
		}
		
		
	}

}
