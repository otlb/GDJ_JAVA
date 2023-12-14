package com.winter.study4.lang.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2Main {

	public static void main(String[] args) {
		//1.남자,여자 구별 
		//2. 대략 나이 ?
		//3.태어난 계절?
		//4.주민번호가 타당한지 
		//  9  3  0  6  2  1  -  1  0  6  6  6  1  1 
		// *2 *3 *4 *5 *6 *7    *8 *9 *2 *3 *4 *5 
		// 총합 구하기 
		// ex) 총합%11 
		// 11에서 나머지를 뻄  그결과를 체크용 번호와 비교
		// 만약 나머지가 2자리라면 그 나머지를 10으로 나눈 나머지를 구함
		// 그나머지가 체크번호와 일치하는지 확인 
		
		//이름, 주민번호 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력 : ");//930621-1066611 
		String human = sc.next();
		//교수님이 한거 
		char [] chs = human.toCharArray();
		
		for(int i=0; i<human.length()-1;i++) {
			char c = human.charAt(i);
			
		}
		
		
		
		
		
		
//		String a = human.replaceAll("-","");
//		
//		
//		String sum = a.substring(0, 8);
//		String sum2 = a.substring(8, 12);	
//		
//				
//		int[] intSum = new int[sum.length()];	
//		
//		for(int i=0; i<sum.length();i++) {
//			intSum[i] = sum.charAt(i)-'0';
//		}
//		int[] intSum2 = new int[sum2.length()];	
//		
//		for(int i=0; i<sum2.length();i++) {
//			intSum2[i] = sum2.charAt(i)-'0';
//		}
//		
//		int count = 2;
//		for(int i =0; i<intSum.length;i++) {
//			intSum[i]= intSum[i]*count;
//			count++;
//		}
//		int count2 = 2;
//		for(int i =0; i<intSum2.length;i++) {
//			intSum2[i]= intSum2[i]*count2;
//			count2++;
//		}
//		
//		int [] newIntsum = new int[intSum.length + intSum2.length];
//		int index=0;
//		for(int i=0; i<intSum.length;i++) {
//			newIntsum[index++] = intSum[i];
//		}
//		for(int i=0; i<intSum2.length;i++) {
//			newIntsum[index++] = intSum2[i];
//		}
////		System.out.println(Arrays.toString(newIntsum));
//		
//		int num =0;
//		for(int i=0; i<newIntsum.length;i++) {
//			num+=newIntsum[i];
//		}
//		char b = a.charAt(12);
//		String st = String.valueOf(b);
//		
//		int lastnumber = Integer.parseInt(st);
		
//			num = 11-num%11;			
//			if(num<10) {
//				
//				System.out.println("정상입니다.");							
//			}
			

			
		
		
		
//		char a = human.charAt(7);
//		
//		System.out.print("성별은? ");
//		if(a == '1' || a=='3') {
//			System.out.println("남자입니다.");
//		}else if(a == '2' || a=='4'){
//			System.out.println("여자입니다.");
//		}else {
//			System.out.println("잘못입력했습니다.");
//		}
//		
//		System.out.println("=======================");
//		
//		System.out.print("나이는? ");
//		
//		String age = human.substring(0, 2);
//		int num = Integer.parseInt(age);
//		num = 123-num;
//		System.out.println(num+"살");
//		
//		System.out.println("=======================");
//		
//		String weanther = human.substring(2, 4);
//		int num2 = Integer.parseInt(weanther);
//		if(2 < num2 && num2<6 ) {
//			System.out.println("태어난 계절은 봄");
//		}else if(5<num2 && num2<9){
//			System.out.println("태어난 계절은 여름");
//		}else if(8<num2 && num2<11) {
//			System.out.println("태어난 계절은 가을");
//		}else if(num2==12 || num2==1 || num2==2) {
//			System.out.println("태어난 계절은 겨울");
//		}else {
//			System.out.println("잘못입력했습니다.");
//		}
//		
//		System.out.println("=======================");
		
			

		
		
		
		
		
		

	}

}
