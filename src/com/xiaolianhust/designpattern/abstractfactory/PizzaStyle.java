package com.xiaolianhust.designpattern.abstractfactory;

public enum PizzaStyle {
	CHEESE, PEPPERONI, CLAM, VEGGEI
	;
	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
