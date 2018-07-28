package com.xiaolianhust.designpattern.decorator;

public class Milk extends CondimentDecorator {

	protected Milk(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.5;
	}

}
