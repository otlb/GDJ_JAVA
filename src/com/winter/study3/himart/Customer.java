package com.winter.study3.himart;

public class Customer  {

	
	private int money;
	private int point;
	
	
	public Customer() {
		this.money=2000;
		this.point=10;
	}
	
	
	
	public void buy(Product p) {
		//물건값 계산
		//최종 가진돈과 포인트 출력
		this.money = this.money - p.getPrice();
		this.point = this.point + p.getPoint();
		
		
		System.out.println("Money : "+ this.money);	
		System.out.println("Point : "+ this.point);		
		
		
	}
	
	
	
	
}
