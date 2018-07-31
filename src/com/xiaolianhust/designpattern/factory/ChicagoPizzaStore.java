package com.xiaolianhust.designpattern.factory;

class ChicagoCheesePizza extends Pizza {}

class ChicagoPepperoniPizza extends Pizza {}

class ChicagoClamPizza extends Pizza {}

class ChicagoVeggiePizza extends Pizza {}

public class ChicagoPizzaStore extends AbstractPizzaStore {
	
	@Override
	public Pizza createPizza(PizzaStyle style) {
		Pizza p;
		switch(style) {
		case CHEESE:
			p = new ChicagoCheesePizza();break;
		case PEPPERONI: 
			p = new ChicagoPepperoniPizza();break;
		case CLAM: 
			p = new ChicagoClamPizza();break;
		case VEGGEI: 
			p = new ChicagoVeggiePizza();break;
		default:
			p  = null;
		}
		return p;
	}

}
