package com.winter.study4.util;

import java.util.Calendar;
import java.util.UUID;

public class StudyCalender3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023, 11, 31);
		System.out.println(calendar.getTime());
		
		int d = calendar.get(calendar.DATE);
		d=d+3;
		calendar.set(calendar.DATE, d);
		System.out.println(d);
		
		System.out.println(calendar.getTime());
		
		
		calendar.set(2023, 12, 31);
		System.out.println(calendar.getTime());
		
		calendar.roll(calendar.DATE, 3);
//		System.out.println(calendar.getTime());
		calendar.add(calendar.DATE, 3);
		System.out.println(calendar.getTime());
		
		//UUID
		String u = UUID.randomUUID().toString();
		System.out.println(u);
		
		
		
		
		
	}

}
