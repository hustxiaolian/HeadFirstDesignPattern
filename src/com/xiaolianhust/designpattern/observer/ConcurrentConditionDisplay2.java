package com.xiaolianhust.designpattern.observer;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class ConcurrentConditionDisplay2 implements Observer, DisplayElement {
	private float temp;
	private float humi;
	private float pres;
	private Observable obs;
	
	public ConcurrentConditionDisplay2(Observable observable) {
		obs = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void dispaly() {
		System.out.println("���ݸ��£�" + new Date());
		System.out.printf("�¶ȣ�%10.2f ��C, ʪ�ȣ�%10.2f%%, ����ѹ��%10.2f KPa\n", temp, humi, pres);
	}
	
	@Override
	/**
	 * �׸�������֪ͨ�Ĺ۲��߱����������֪ͨ��ʶ����������ĸ��۲���
	 * ͬʱ��Ҳ�ṩ��һ�ֹ۲��ߴ����������������Ĳ���
	 */
	public void update(Observable arg0, Object arg1) {
		if(obs instanceof WeatherData2) {
			WeatherData2 w = (WeatherData2) obs;
			temp = w.getTemperature();
			humi = w.getHumidity();
			pres = w.getPressure();
			dispaly();
		}
		
		
	}

}
