package com.winter.study5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyException {

	
	public void t1 (){
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
//		throw new InputMismatchException();
		int num2 = 9;
		
		System.out.println(num2/num);
//		throw new ArithmeticException();
		
		StudyException2 se2 = new StudyException2();
		se2.t2();
		
		
	}
	
}
