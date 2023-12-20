package com.winter.study6.ex1;

import java.util.List;
import java.util.Scanner;

public class WeatherController {
	//의존적이다 Dependency
	//주입 Injection
	//의존성 주입 DI5
	private WeatherDAO dao;
	private WeatherView	view;
	private Scanner sc;
	
	public WeatherController() {
		this.dao = new WeatherDAO();
		this.view = new WeatherView();
		this.sc = new Scanner(System.in);
	}
	
	
	
	public void start() throws Exception {
		
		List<WeatherDate> ar = dao.getWeathers();
		
		boolean check = true;
		while(check) {
			System.out.println("1. 날씨정보출력");
			System.out.println("2. 날씨정보검색");
			System.out.println("3. 날씨정보추가");
			System.out.println("4. 날씨정보삭제");
			System.out.println("5. 날씨정보저장");
			System.out.println("6. 프로그램종료");
			try {
				int select = sc.nextInt();
				if(select == 1) {
					this.view.view(ar);
				}else if(select == 2){
					WeatherDate w = dao.getDetail(ar, sc);
					view.viwe(w);
				}else if(select == 3) {
						boolean flag = dao.add(ar, sc);
						if(flag) {
							//추가 성공 메세지
						}else {
							//추가 실패 메세지
						}
				}else if(select == 4) {
						boolean flag = dao.delete(ar, sc);
						if(flag) {
							//삭제 성공 메세지
						}else {
							//삭제 실패 메세지
						}
				}else if(select==5) {
					dao.save(ar);
					
				}else {
					System.out.println("종료합니다.");
					break;
				}
			}catch(Exception e) {
				System.out.print("잘못입력");
				System.out.println(sc.next());
			}
		}
		
		
	}	

}
