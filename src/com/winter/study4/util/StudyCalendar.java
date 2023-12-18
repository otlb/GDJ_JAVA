package com.winter.study4.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudyCalendar {

	public static void main(String[] args) {
		
//		Calendar calendar = new GregorianCalendar();
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar);
		
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month+1);
		
		calendar.set(Calendar.YEAR, 2200);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.MONTH, 0);// 월은 0부터 시작 그러므로 1월을 넣고싶으면 0을 넣어야함
	}

}
