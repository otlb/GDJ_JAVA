package com.winter.study6.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherDAO dao = new WeatherDAO();
		
		try {
			ArrayList<WeatherDate> ar = dao.getWeathers();
			for(WeatherDate wd:ar) {
				System.out.println("지역 :"+wd.getName());
				System.out.println("온도 :"+wd.getTemp());
				System.out.println("날씨 :"+wd.getWeather());
				System.out.println("습도 :"+wd.getHum());
				System.out.println("================");
			}	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
