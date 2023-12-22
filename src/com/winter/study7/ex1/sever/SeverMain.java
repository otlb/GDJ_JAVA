package com.winter.study7.ex1.sever;

public class SeverMain {

	public static void main(String[] args) {

		SeverController sc = new SeverController();
		try {
			sc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
