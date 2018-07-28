package com.xiaolianhust.designpattern.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}
	
	@Override
	public double cost() {
		return 1.99 + getSize().getPrice();
	}

}
