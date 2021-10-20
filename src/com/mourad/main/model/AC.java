package com.mourad.main.model;

public class AC {
	private ACEnum type;
	private ACEnum size;
	
	public AC(String type, String size) {
		
		if(type.equalsIgnoreCase("P")){
		this.type=ACEnum.PASSENGER;
		}
		else if(type.equalsIgnoreCase("C")){
			this.type=ACEnum.CARGO;
		}
		if(size.equalsIgnoreCase("S")){
			this.size=ACEnum.SMALL;
			}
		else if(size.equalsIgnoreCase("L")){
			this.size=ACEnum.LARGE;
		}
	}

	public int getType() {
		return type.getValue();
	}

	public int getSize() {
		return size.getValue();
	}
	
	@Override
	public String toString() {
		return "AC [type=" + type + ", size=" + size + "]";
	}
	
	

}
