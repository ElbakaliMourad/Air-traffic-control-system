package com.mourad.main.model;

public enum ACEnum {
	
	SMALL(1),
	LARGE(2),
	CARGO(3), 
	PASSENGER(4);

	private int value;
	
	private ACEnum (int value) { 
		   this.value = value; 
	   }

	public int getValue() {
		return value;
	}
}
