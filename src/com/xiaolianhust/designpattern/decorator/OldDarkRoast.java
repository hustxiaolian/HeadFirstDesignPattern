package com.xiaolianhust.designpattern.decorator;

public class OldDarkRoast extends OldBeverage {
	private double price;
	public OldDarkRoast() {
		description = "Most Excellent Dark Roast.";
		price = 10.6;
	}

	@Override
	public double cost() {
		return price + super.cost();
	}
	
	
}
