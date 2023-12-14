package com.winter.study4.lang.ex1;

public class WeatherService {
	
	
	private String datas;
	
	public WeatherService() {
		this.datas="서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25,태풍.75";
		
		
		
	}
	
	
	//init 매서드 
	public WeatherData [] init() {
		
		
		
//		System.out.println(this.datas);		
		
		datas = this.datas.replace(',', '-');
		
//		System.out.println(datas);
		
		datas = this.datas.replace('.', '-');
		
//		System.out.println(datas);
		
		
		String [] datas = this.datas.split("-");
		
//		for(int i=0; i<datas.length;i++) {
//			System.out.println(datas[i]);
//		}	
		
		
		WeatherData [] weatherDatas = new WeatherData[datas.length/4];				
		int count = 0;	
		for(int i =0; i<datas.length;i++) {
			WeatherData weatherData = new WeatherData();
			
			weatherData.setCity(datas[i]);
			++i;
			weatherData.setGion(datas[i]);
			++i;
			weatherData.setInfo(datas[i]);
			++i;
			weatherData.setHum(datas[i]);	
			
			weatherDatas[count] = weatherData;
			count++;
		}				
		
		return weatherDatas;
		
		
	}
	

}
