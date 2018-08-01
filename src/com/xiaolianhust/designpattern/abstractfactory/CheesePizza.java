package com.xiaolianhust.designpattern.abstractfactory;

public class CheesePizza extends Pizza {

	public CheesePizza(AbStractSourceFactory factory) {
		super(factory);
	}

	@Override
	public void prepare() {
		System.out.println(this.getClass().getSimpleName() + " prepare");
		cheese = factory.createCheese();
		clam = factory.createClam();
		dough = factory.createDough();
		sauce = factory.createSauce();
	}

}
