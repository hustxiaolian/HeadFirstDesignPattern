package com.xiaolianhust.designpattern.observer;


/**
 * 为所有的观察者类提供同一的定义和接口
 * @author 25040
 *
 */
public interface Observer {
	void update(float temp, float humidity, float pressure);
}
