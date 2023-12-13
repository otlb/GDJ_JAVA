package com.winter.study3.himart;

public class Notebook extends Product {
	
	private String cpu;
	
	public Notebook() {
		this.cpu="16giga";
		this.setPoint(60);
		this.setPrice(500);
		this.setSize(80);
		
	}
	
	

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
	

}
