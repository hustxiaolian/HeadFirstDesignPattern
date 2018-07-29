package com.xiaolianhust.designpattern.decorator;

public class Soy extends CondimentDecorator {

	protected Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	protected String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + getCupCost();//������ֱ������˸��ݵ����շѡ������ҿ��������ˣ�
		//���ԣ���ʵ���У�����Ŀ�ͷ��Ҳ������Ҫ��һ����������ϸ�����Ŀ���󣬷���ְ��
	}

}
