package com.winter.study3.himart;

public class HimartMain {
	
	
	
	public static void main(String[] args) {
		
		
		Notebook notebook =  new Notebook();  
		Phone phone = new Phone();
		Tv	tv	= new Tv();
		
		
		Customer customer = new Customer();
		customer.buy(tv);
		
		
		Product [] products = new Product[3];
		products[0] = tv;
		products[1] = phone;
		products[2] = notebook;
		
		
	}
	
	

}
