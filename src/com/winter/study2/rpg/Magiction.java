package com.winter.study2.rpg;

public class Magiction extends Character {

	
	private int mp;
	
	
	
	
	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public void info() {
		super.superInfo();
		System.out.println(this.mp);
		
	}


	@Override
	public void attack() {
		System.out.println("마법공격");
		
	}
	
	
	

	
	
}
