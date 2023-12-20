
package com.winter.study6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudyFile {
	public void f4() throws IOException {
		File file = new File("c:\\study\\test2.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
		String s = br.readLine();
		if(s==null) {
			break;
		}
//		if(s.length()!=0) 크기가0
		if(!s.isEmpty()) //비어있지않으면
		{
		System.out.println(s);
		}
		
		}
		//연결된 역순으로 해제 
		br.close();
		fr.close();
		}

			
	
	
	public void f3() throws IOException {
		Scanner sc=new Scanner(System.in);
		File file = new File("c:\\study\\save1.txt");
		
		FileWriter fw = new FileWriter(file,true);
		
		
		
		while(true) {
			
		System.out.println("입력하세요");
		String message = sc.next();
		
		if(message.toUpperCase().equals("EXIT")){
			System.out.println("종료");
			break;
		}
		fw.write(message+"\r");
		fw.flush();//버퍼를 강제로 밀어냄			
		
		
		}
		fw.close();
		sc.close();
	}	
	
	
	public void f2() throws Exception{
		
		File file = new File("c:\\study");
		
		String [] ar =  file.list();
		
		for(String s:ar) {
			System.out.println(s);
			File f = new File(file, s);
			System.out.println(f.length());
		}
		
//		File [] fr = file.listFiles();
//		
//		for(File s : fr) {			
//		System.out.println(s);
//		System.out.println(s.length());
//		}
		
	}

	public void f1() throws Exception {
		
		File file = new File("c:\\study\\Test.java");
		
		file = new File("c:\\study\\test", "sub1");
		
		if(!file.exists()) {
//			file.mkdir(); 1개 만들기
			file.mkdirs(); // 여러개만들기
		}
		
		file = new File(file, "t1.txt");

		file.createNewFile();
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		
		file = new File("c:\\study\\test\\sub1\\t1.txt"); //비어 있어야 지울수있음 
		
		file.delete();
		
		
	}
	
	
	
	
	
	
}
