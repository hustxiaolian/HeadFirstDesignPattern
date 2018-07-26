package com.xiaolianhust.designpattern.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temp;
	private float humi;
	private float pres;
	
	CurrentConditionDisplay() {
		temp = 0.0f;
		humi = 0.0f;
		pres = 0.0f;
	}

	@Override
	public void dispaly() {
		System.out.printf("温度：%10.2f °C, 湿度：%10.2f%%, 大气压：%10.2f KPa\n", temp, humi, pres);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humi = humidity;
		this.pres = pressure;
	}

}
