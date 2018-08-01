package com.xiaolianhust.designpattern.abstractfactory;

class NYCheese extends Cheese{}

class NYClam extends Clam {}

class NYDough extends Dough {}

class NYSauce extends Sauce {}

public class NYPizzaSourceFactory implements AbStractSourceFactory {

	@Override
	public Cheese createCheese() {
		return new NYCheese();
	}

	@Override
	public Clam createClam() {
		return new NYClam();
	}

	@Override
	public Dough createDough() {
		return new NYDough();
	}

	@Override
	public Sauce createSauce() {
		return new NYSauce();
	}

}
