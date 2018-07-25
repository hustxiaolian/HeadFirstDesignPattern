package com.xiaolianhust.designpattern.strategy;

public class RedHeadDuck extends Duck {

	public RedHeadDuck(String name) {
		super(name, new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我的头是红色的，我最傲娇...");
	}
	
	public static void main(String[] args) {
		Duck rhd = new RedHeadDuck("红头鸭1号");
		rhd.test();
	}

}
