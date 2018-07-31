package com.xiaolianhust.designpattern.factory;

class NYCheesePizza extends Pizza {}

class NYPepperoniPizza extends Pizza {}

class NYClamPizza extends Pizza {}

class NYVeggiePizza extends Pizza {}


public class NYPizzaStore extends AbstractPizzaStore {

	@Override
	public Pizza createPizza(PizzaStyle style) {
		Pizza p;
		switch(style) {
		case CHEESE:
			p = new NYCheesePizza();break;
		case PEPPERONI: 
			p = new NYPepperoniPizza();break;
		case CLAM: 
			p = new NYClamPizza();break;
		case VEGGEI: 
			p = new NYVeggiePizza();break;
		default:
			p  = null;
		}
		return p;
	}
	
	public static void main(String[] args) {
		NYPizzaStore nyps = new NYPizzaStore();
		
		nyps.orderPizza(PizzaStyle.CHEESE);
		nyps.orderPizza(PizzaStyle.valueOf("CLAM"));
	}

}
