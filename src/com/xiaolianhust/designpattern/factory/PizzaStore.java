package com.xiaolianhust.designpattern.factory;

public class PizzaStore {
	private SimplePizzaFactory pizzaFactory;
	
	public PizzaStore(SimplePizzaFactory pizzaFactory) {
		super();
		this.pizzaFactory = pizzaFactory;
	}

	public Pizza orderPizza(String type) {
		Pizza p = pizzaFactory.createPizza(type);
		p.prepare();
		p.bake();
		p.cut();
		p.box();
		return p;
	}
	
	public static void main(String[] args) {
		PizzaStore ps = new PizzaStore(new SimplePizzaFactory());
		
		ps.orderPizza("clam");
	}
	
}
