package com.winter.study4.lang;

public class StringStudy2 {

	public static void main(String[] args) {
		
		
		String name = "wintertesttset";
		int a = -1;
		int count=0;
		while(true) {
			a = name.indexOf('t',a+1);
			if(a == -1) {
				break;
			}
			count++;
		}			
		System.out.println(count);		
		
	}

}
