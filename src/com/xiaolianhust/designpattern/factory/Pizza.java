package com.xiaolianhust.designpattern.factory;

public abstract class Pizza {
	public void prepare() {
		System.out.println(pizzaName() + " prepare...");
	}
	
	public void bake() {
		System.out.println(pizzaName() + " bake...");
	}
	
	public void cut() {
		System.out.println(pizzaName() + " cut...");
	}
	
	public void box() {
		System.out.println(pizzaName() + " box");
	}
	
	public String pizzaName() {
		return this.getClass().getSimpleName();
	}
}
