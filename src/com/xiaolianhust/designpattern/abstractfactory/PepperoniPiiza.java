package com.xiaolianhust.designpattern.abstractfactory;

public class PepperoniPiiza extends Pizza {

	public PepperoniPiiza(AbStractSourceFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() {
		//cheese = factory.createCheese();
		clam = factory.createClam();
		dough = factory.createDough();
		sauce = factory.createSauce();
	}

}
