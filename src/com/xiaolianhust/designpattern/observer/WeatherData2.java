package com.xiaolianhust.designpattern.observer;

import java.util.Observable;
import java.util.Random;

public class WeatherData2 extends Observable {
	private static Random rand = new Random(47);
	public float getTemperature() {return rand.nextFloat() * 100;}
	public float getHumidity() {return rand.nextFloat() * 100;}
	public float getPressure() {return rand.nextFloat() * 40;}
	
	public WeatherData2() {}
	
	public void measuerChange() {
		setChanged();
		notifyObservers();//这里我们相当于把当前主题对象本省当作参数传递过去，作为update方法的第一个参数
		//也代表着我们使用了“观察者拉数据的方式”
	}
	
	public static void main(String[] args) throws InterruptedException {
		WeatherData2 w = new WeatherData2();
		ConcurrentConditionDisplay2 c = new ConcurrentConditionDisplay2(w);
		
		for(int i = 0;i < 5;++i) {
			Thread.sleep(1000);
			w.measuerChange();
		}
	}
	
	
}
