package com.xiaolianhust.designpattern.decorator;

public class Soy extends CondimentDecorator {

	protected Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	protected String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.3;
	}

}
