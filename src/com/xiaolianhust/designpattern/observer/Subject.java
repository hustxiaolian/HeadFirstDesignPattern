package com.xiaolianhust.designpattern.observer;


/**
 * 主题接口，为所有实现主题的定义同一的规范
 * @author 25040
 *
 */
public interface Subject {
	void registerObserver(Observer newObserver);
	void removeObserver(Observer observer);
	void notifyObserver();
}
