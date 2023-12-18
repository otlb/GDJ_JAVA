package com.winter.study5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study5Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		try {
			int num = sc.nextInt();
//			throw new InputMismatchException();
		
			System.out.println("정상 진행");
		
		String str =null;
		
//		System.out.println(str.toString());
		
		
		int [] ar1 = new int[2];
		ar1[3]=10;
//		new = ArrayIndexOutOfBoundsException();
		}catch(RuntimeException e) {
			System.out.println("Exception 발생");
		}
		
		Test t = new Test();
		
		int a = 10;
		a = a/0;
		
		ArrayList<Integer> ar = null;
		t.t1(ar);
		System.out.println("종료합니다.");		
		

	}

}
