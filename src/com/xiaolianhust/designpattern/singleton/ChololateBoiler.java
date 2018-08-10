package com.xiaolianhust.designpattern.singleton;

public class ChololateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private static ChololateBoiler singleBoilder;
	
	/**
	 * ������ǵĶ��̰߳汾�ܹ�����ͬ�������Ĵ��ۡ�
	 * ��ô����ֱ��ʹ��synchronized�ؼ�����ɣ���ʡ�¡�
	 * 
	 * ����ǵ��̰߳汾��ֱ��ȥ��synchronized�ؼ��־Ϳ�����ȷ���С�
	 * 
	 * @return
	 */
	public static synchronized ChololateBoiler getInstance() {
		if(singleBoilder == null)
			singleBoilder = new ChololateBoiler();
		return singleBoilder;
	}
	
	/**
	 * ˫�������汾�����߳��߳���ʹ���ӳ�ʵ��������Ҫ������
	 * �����ֱ��ʹ��synchronized�汾������Ҫ�����̷߳��ʵ�ʱ�򣬿��Լ�����������߳����ܡ�
	 * @return
	 */
	public static ChololateBoiler getInstance2() {
		if(singleBoilder == null) {
			synchronized (ChololateBoiler.class) {
				if(singleBoilder == null)
					singleBoilder = new ChololateBoiler();
			}
		}
		return singleBoilder;
	}
	
	/*
	 * ����һ����static������ֱ�Ӿ�̬��ʼ����getInstance��������ֱ�ӷ��أ�����Ҫͬ����
	 * ���ǣ�������û������ӳ�ʵ���������ھ޴�Ķ�����˵��Щ��������������ܹ����ܣ��Ǿ�ʹ�����֡�
	 * 
	 */
	
	private ChololateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	public void drain() {
		if(isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boilded() {
		if(!isEmpty() && isBoiled())
			boiled = true;
	}

	
	public boolean isBoiled() {
		return false;
	}

	public boolean isEmpty() {
		return false;
	}
}
