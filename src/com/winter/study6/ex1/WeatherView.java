package com.winter.study6.ex1;

import java.util.List;

public class WeatherView {
	
	public void viwe(WeatherDate date) {
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
