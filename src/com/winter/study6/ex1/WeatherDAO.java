package com.winter.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherDAO {
	private static int count;
	
	static {
		WeatherDAO.count = 0;
	}

	//DAO : Data Access Onject 데이터에 접근하는 클래스
	
	//getWeathers
	//file에서 내용을 읽어오는 역할을 하는 메서드
	//파싱 작업 ,토큰 분류별 저장 그걸 Arayy 저장  
	public ArrayList<WeatherDate> getWeathers() throws Exception {
		
		ArrayList<WeatherDate> dates = new ArrayList<>();
		
		File file = new File("c:\\study\\weather");	
		String [] names = file.list();
//		long [] name = new long[names.length];
		long max=0;
		
		for(int i=0;i<names.length;i++) {
//			String [] r = names[i].split(".");
			//name[i]
//			long n =Long.parseLong(r[0]) ;
			long n= Long.parseLong(names[i].substring(0, names[i].lastIndexOf(".")));
			if(max<n) {
				max=n;
			}
		}
		
//		
//		for(int i=0;i<name.length;i++) {
//			if(max<name[i]) {
//				max=name[i];
//			}
//		}

		
		file = new File(file,max+".txt");	
		FileReader fr = new FileReader(file);		
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		
		
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
	
	//검색
	public WeatherDate getDetail(List<WeatherDate> ar,Scanner sc) {
		System.out.println("도시명 입력");
		WeatherDate date = new WeatherDate();
		date.setName(sc.next());
		for(WeatherDate w:ar) {
			if(w.getName().equals(date.getName())) {
				return w;
				
			}
		}
		return null; //못찾으면 널 
		
	}
	//추가
	public boolean add(List<WeatherDate> ar, Scanner sc) {
		WeatherDate date = new WeatherDate();
		System.out.println("도시 입력");
		date.setName(sc.next());
		System.out.println("기온 입력");
		date.setTemp(sc.nextInt());
		System.out.println("날씨 입력");
		date.setWeather(sc.next());
		System.out.println("습도 입력");
		date.setHum(sc.nextInt());
		
		
		return ar.add(date); // true 는 성공 false 실패
	}
	
	//삭제
	public boolean delete(List<WeatherDate> ar, Scanner sc) {
		boolean result = false;
		System.out.println("도시명 입력");
		String name = sc.next();
		for(WeatherDate w:ar) {
			if(w.getName().equals(name)) {
				result = ar.remove(w);
				break;
			}
		}
		return result;
	}
	
	//저장
	public WeatherDate save(List<WeatherDate> ar) throws Exception {
		//1.파일에 작성
		//파일명은 save.txt
		//##날씨정보
		//도시명-기온-정보-습도
		//20231220+count
		WeatherDAO.count++;
		
		Calendar ca = Calendar.getInstance();
//		int y = ca.get(Calendar.YEAR);
//		int m = ca.get(Calendar.MONTH);
//		int d = ca.get(Calendar.DATE);
//		String fileName = String.valueOf(y)+m+d+WeatherDAO.count;
		String fileName=ca.getTimeInMillis()+".txt";
		
		File file = new File("c:\\study\\weather");
		file = new File(file,fileName);
		FileWriter fw = new FileWriter(file); 
		WeatherDate date = new WeatherDate();
		
		fw.write("##날씨정보\r");
		
		for(WeatherDate w:ar) {
	
			fw.write(w.getName()+"-");
			fw.write(w.getTemp()+"-");
			fw.write(w.getWeather()+"-");
			fw.write(w.getHum()+"\r");
		
			fw.flush();	
		}
				
		fw.close();
		return date;
	}
		
		
		
	}
	
	
	

