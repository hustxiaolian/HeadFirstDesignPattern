package com.xiaolianhust.designpattern.decorator;

public abstract class Beverage {
	public String description = "Unkown Beverage";
	SIZE size = SIZE.GRANDE;//Ä¬ÈÏÖÐ±­
	
	enum SIZE{ 
		TALL(0.1), GRANDE(0.18), VENTI(0.2)
		;
		private final double price;
		private SIZE(double price) {
			this.price = price;
		}
		public double getPrice() {
			return price;
		}
	}
	
	protected SIZE getSize() {
		return size;
	}

	protected void setSize(SIZE size) {
		this.size = size;
	}
	
	protected double getCupCost() {
		return getSize().price;
	}
	
	protected String getDescription() {
		return description + "(" + getSize() + ")";
	}
	
	public abstract double cost();
}
