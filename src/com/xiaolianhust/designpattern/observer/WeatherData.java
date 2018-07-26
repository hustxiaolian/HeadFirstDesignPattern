package com.xiaolianhust.designpattern.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private static Random rand = new Random(47);
	private float getTemperature() {return rand.nextFloat() * 100;}
	private float getHumidity() {return rand.nextFloat() * 100;}
	private float getPressure() {return rand.nextFloat() * 40;}
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	public WeatherData(Observer...observers) {
		this(Arrays.asList(observers));
	}
	
	public WeatherData(Collection<Observer> observers) {
		this.observers = new ArrayList<>(observers);
	}
	
	@Override
	public void registerObserver(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		float currTemp = getTemperature();
		float currHumi = getHumidity();
		float currPres = getPressure();
		
		for (Observer observer : observers) {
			observer.update(currTemp, currHumi, currPres);
		}
	}
	
	public void measurementsChange() {
		notifyObserver();
	}
	
	public static void main(String[] args) {
		WeatherData w = new WeatherData();
		
		CurrentConditionDisplay c = new CurrentConditionDisplay();
		StatisticsDisplay s = new StatisticsDisplay();
		w.registerObserver(c);
		w.registerObserver(s);
		for(int i = 0;i < 5;i++) {
			w.measurementsChange();
			c.dispaly();
			s.dispaly();
		}
	}

}
