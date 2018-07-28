package com.xiaolianhust.designpattern.decorator;

public class BigCup extends CondimentDecorator {

	protected BigCup(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Big Cup";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.2;
	}

}
