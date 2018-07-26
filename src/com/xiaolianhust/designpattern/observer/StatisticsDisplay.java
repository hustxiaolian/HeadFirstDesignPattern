package com.xiaolianhust.designpattern.observer;

import java.util.ArrayList;
import java.util.Collections;

public class StatisticsDisplay implements Observer, DisplayElement{
	private float minTemp;
	private float maxTmep;
	private float avgTmep;
	private ArrayList<Float> lastTempData;
	private int index = 0;
	public StatisticsDisplay() {
		super();
		this.minTemp = 0.0f;
		this.maxTmep = 0.0f;
		this.avgTmep = 0.0f;
		lastTempData = new ArrayList<>();
	}

	@Override
	public void dispaly() {
		System.out.printf("max: %6.2f, min: %6.2f, avg: %6.2f\n", maxTmep, minTemp, avgTmep);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		if(lastTempData.size() < 24) {
			lastTempData.add(temp);
		}
		else {
			lastTempData.set(index++, temp);
		}
		
		minTemp = Collections.min(lastTempData);
		maxTmep = Collections.max(lastTempData);
		avgTmep = 0;
		for(float t : lastTempData) {
			avgTmep += t;
		}
		avgTmep = avgTmep / lastTempData.size();
	}

}
