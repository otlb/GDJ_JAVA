package com.winter.study6.ex1;

import java.util.ArrayList;
import java.util.List;

public class WeatherMain {

	public static void main(String[] args) throws Exception {
		WeatherDAO dao = new WeatherDAO();
		dao.getWeathers();
		
//	try {
//		new WeatherController().start();
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}
}
