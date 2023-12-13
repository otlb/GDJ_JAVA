package com.winter.study3.himart;

public class Phone extends Product {

	private int pixel;
	private String model;
	
	public Phone() {
		this.model = "appel";
		this.pixel = 20;
		this.setPoint(30);
		this.setPrice(580);
		this.setSize(15);
		
	} 
	
	
	
	
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
