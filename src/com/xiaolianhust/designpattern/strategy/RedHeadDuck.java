package com.xiaolianhust.designpattern.strategy;

public class RedHeadDuck extends Duck {

	public RedHeadDuck(String name) {
		super(name, new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("�ҵ�ͷ�Ǻ�ɫ�ģ��������...");
	}
	
	public static void main(String[] args) {
		Duck rhd = new RedHeadDuck("��ͷѼ1��");
		rhd.test();
	}

}
