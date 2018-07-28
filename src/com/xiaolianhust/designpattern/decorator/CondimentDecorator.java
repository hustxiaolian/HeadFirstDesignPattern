package com.xiaolianhust.designpattern.decorator;

public abstract class CondimentDecorator extends Beverage{
	Beverage beverage;
	protected CondimentDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	protected abstract String getDescription();
}
