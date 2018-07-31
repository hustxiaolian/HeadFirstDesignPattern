package com.xiaolianhust.designpattern.factory;

public abstract class AbstractPizzaStore {
	public Pizza orderPizza(PizzaStyle style) {
		Pizza p = createPizza(style);
		if(p == null) {
			System.out.println("û�и������pizza");
			return null;
		}
		
		p.prepare();
		p.bake();
		p.box();
		p.cut();
		
		return p;
	}
	
	public abstract Pizza createPizza(PizzaStyle style);
}
