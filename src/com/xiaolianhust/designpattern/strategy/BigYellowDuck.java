package com.xiaolianhust.designpattern.strategy;

public class BigYellowDuck extends Duck {

	public BigYellowDuck(String name) {
		super(name, new FlyNoWay());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("��ȫ�����¶��ǻƻƵģ��𽺵�");
	}
	
	public static void main(String[] args) {
		Duck byd = new BigYellowDuck("���Ѽ1��");
		byd.test();
	}

}
