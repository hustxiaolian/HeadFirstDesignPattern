package com.xiaolianhust.designpattern.decorator;

public class Mocha extends CondimentDecorator {
	
	protected Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	protected String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}

}
