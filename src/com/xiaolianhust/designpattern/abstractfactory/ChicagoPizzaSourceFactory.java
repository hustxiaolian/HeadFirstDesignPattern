package com.xiaolianhust.designpattern.abstractfactory;

class ChicagoCheese extends Cheese{}

class ChicagoClam extends Clam {}

class ChicagoDough extends Dough {}

class ChicagoSauce extends Sauce {}

public class ChicagoPizzaSourceFactory implements AbStractSourceFactory {

	@Override
	public Cheese createCheese() {
		return new ChicagoCheese();
	}

	@Override
	public Clam createClam() {
		return new ChicagoClam();
	}

	@Override
	public Dough createDough() {
		return new ChicagoDough();
	}

	@Override
	public Sauce createSauce() {
		return new ChicagoSauce();
	}

}
