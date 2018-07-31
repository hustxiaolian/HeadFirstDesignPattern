package com.xiaolianhust.designpattern.factory;

class CheesePizza extends Pizza{}

class PepperoniPizza extends Pizza {}

class ClamPizza extends Pizza {}

class VeggiePizza extends Pizza {}

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza p;
		
		if(type.equals("cheese"))
			p = new CheesePizza();
		else if(type.equals("pepperoni"))
			p = new PepperoniPizza();
		else if(type.equals("clam"))
			p = new ClamPizza();
		else 
			p = new VeggiePizza();
		
		return p;
	}
}
