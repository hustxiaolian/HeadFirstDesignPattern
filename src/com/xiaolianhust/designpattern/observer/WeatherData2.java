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
		notifyObservers();//���������൱�ڰѵ�ǰ�������ʡ�����������ݹ�ȥ����Ϊupdate�����ĵ�һ������
		//Ҳ����������ʹ���ˡ��۲��������ݵķ�ʽ��
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
