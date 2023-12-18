package com.winter.study4.util.ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class StudySetInfo {
	//로또번호 랜덤 
	//1-45 , 6개
	
	
	public void ex1() {
		//보관 ArrayList
		ArrayList<Integer> ar = new ArrayList<>();
		Random random = new Random();		
	
		for(int i=0; i<6;i++) {			
				ar.add(i,random.nextInt(45)+1);		
					
				for(int j=0; j<i;j++) {
					if(ar.get(i)==ar.get(j)) {
						i--;
						break;
					}					
				}
			}	
		Collections.sort(ar);
		
		
		for(int i=0; i<ar.size();i++) {
		  
			System.out.println(i+1+"번 : "+ar.get(i));
		}
		
	}
	
	
	public void ex2() {
		//HashSet 보관 
		HashSet<Integer> hs = new HashSet<>();
		Random random = new Random();
		
		while(hs.size()!=6) {
			hs.add(random.nextInt(45)+1);
		}
		
		System.out.println(hs);
		
		
		}
		
		
	}


