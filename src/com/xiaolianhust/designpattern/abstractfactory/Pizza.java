package com.xiaolianhust.designpattern.abstractfactory;

public abstract class Pizza {
	protected Cheese cheese;
	protected Clam clam;
	protected Dough dough;
	protected Sauce sauce;
	protected AbStractSourceFactory factory;
	private String name;
	public Pizza(AbStractSourceFactory factory) {
		this.factory = factory;
	}
	
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public abstract void prepare();
	
	public void bake() {
		System.out.println(this.getClass().getSimpleName() + " bake()");
	}
	
	public void cut() {
		System.out.println(this.getClass().getSimpleName() + " cut()");
	}
	
	public void box() {
		System.out.println(this.getClass().getSimpleName() + " box()");
	}
	
}
