package com.xiaolianhust.designpattern.abstractfactory;

public abstract class AbstractPizzaStore {
	protected AbStractSourceFactory sourceFactory;
	
	protected AbstractPizzaStore(AbStractSourceFactory sourceFactory) {
		super();
		this.sourceFactory = sourceFactory;
	}

	public abstract Pizza createPizza(PizzaStyle style);
	
	public Pizza orderPizza(PizzaStyle style) {
		Pizza p = createPizza(style);
		
		p.prepare();
		p.bake();
		p.cut();
		p.box();
		
		return p;
	}
}
