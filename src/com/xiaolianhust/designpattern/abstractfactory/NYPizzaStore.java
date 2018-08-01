package com.xiaolianhust.designpattern.abstractfactory;

public class NYPizzaStore extends AbstractPizzaStore {

	protected NYPizzaStore(AbStractSourceFactory sourceFactory) {
		super(sourceFactory);
	}

	@Override
	public Pizza createPizza(PizzaStyle style) {
		switch(style) {
		case CHEESE:
			return new CheesePizza(sourceFactory);
		case PEPPERONI:
			return new PepperoniPiiza(sourceFactory);
		default:
			return null;
		}
	}

	public static void main(String[] args) {
		NYPizzaStore pizzaStore = new NYPizzaStore(new NYPizzaSourceFactory());
		pizzaStore.orderPizza(PizzaStyle.CHEESE);
	}

}
