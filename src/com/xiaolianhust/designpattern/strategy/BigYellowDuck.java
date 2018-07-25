package com.xiaolianhust.designpattern.strategy;

public class BigYellowDuck extends Duck {

	public BigYellowDuck(String name) {
		super(name, new FlyNoWay());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("我全身上下都是黄黄的，橡胶的");
	}
	
	public static void main(String[] args) {
		Duck byd = new BigYellowDuck("大黄鸭1号");
		byd.test();
	}

}
