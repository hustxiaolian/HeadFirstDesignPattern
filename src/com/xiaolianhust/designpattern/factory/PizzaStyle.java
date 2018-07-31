package com.xiaolianhust.designpattern.factory;

public enum PizzaStyle {
	CHEESE, PEPPERONI, CLAM, VEGGEI
	;

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
	
}
