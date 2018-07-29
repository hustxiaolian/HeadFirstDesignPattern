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
		return beverage.cost() + getCupCost();//这样就直接完成了根据调料收费。昨天我看错题意了，
		//所以，在实际中，搞项目最开头，也是最重要的一步，就是仔细理解项目需求，分清职责。
	}

}
