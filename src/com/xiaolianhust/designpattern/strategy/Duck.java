package com.xiaolianhust.designpattern.strategy;

/**
 * Ѽ�ӻ��࣬����Ѽ���в���仯�Ĳ��֣�
 * dispaly() ÿ��Ѽ�Ӷ���Ҫչʾ���Լ�����ò������ÿ�����ӵ���ò���ǲ�ͬ�ġ�
 * swim() ���е�Ѽ�Ӷ�����Ӿ����������Ѽ����Ӿ��Ϊ����һ���ġ�
 * 
 * @author 25040
 *
 */
public abstract class Duck {
	public String name;
	public FlyBehavior flyBehavior;

	public Duck(String name, FlyBehavior flyBehavior) {
		super();
		this.name = name;
		this.flyBehavior = flyBehavior;
	}
	
	/**
	 * ��Ѽ�ӷ�����Ϊ��ʵ�֣�ί�и�flyBehavior
	 */
	public void duckFly() {
		flyBehavior.fly();
	}
	
	
	/**
	 * ������������Լ�ʵ�ֲ�ͬѼ�ӵ���ò����
	 */
	public abstract void display();
	
	/**
	 * ģ�巽�����ģʽ�����в��Զ�����ͬ������
	 */
	public void test() {
		System.out.println("����" + name);
		display();
		duckFly();
	}
	
	
}
