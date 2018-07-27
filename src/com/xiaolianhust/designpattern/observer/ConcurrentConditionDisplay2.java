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
		System.out.println("数据更新：" + new Date());
		System.out.printf("温度：%10.2f °C, 湿度：%10.2f%%, 大气压：%10.2f KPa\n", temp, humi, pres);
	}
	
	@Override
	/**
	 * 首个参数是通知的观察者本身，这可以让通知者识别出到底是哪个观察者
	 * 同时它也提供了一种观察者从主题身上拉东西的操作
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
