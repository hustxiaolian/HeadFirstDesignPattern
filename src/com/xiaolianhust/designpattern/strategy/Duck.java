package com.xiaolianhust.designpattern.strategy;

/**
 * 鸭子基类，定义鸭子中不会变化的部分：
 * dispaly() 每个鸭子都需要展示出自己的样貌，而且每种样子的样貌都是不同的。
 * swim() 所有的鸭子都会游泳，而且所有鸭子游泳行为都是一样的。
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
	 * 将鸭子飞行行为的实现，委托给flyBehavior
	 */
	public void duckFly() {
		flyBehavior.fly();
	}
	
	
	/**
	 * 各自子类必须自己实现不同鸭子的样貌表征
	 */
	public abstract void display();
	
	/**
	 * 模板方法设计模式，所有测试都是相同的流程
	 */
	public void test() {
		System.out.println("我是" + name);
		display();
		duckFly();
	}
	
	
}
