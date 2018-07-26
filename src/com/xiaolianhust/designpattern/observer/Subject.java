package com.xiaolianhust.designpattern.observer;


/**
 * ����ӿڣ�Ϊ����ʵ������Ķ���ͬһ�Ĺ淶
 * @author 25040
 *
 */
public interface Subject {
	void registerObserver(Observer newObserver);
	void removeObserver(Observer observer);
	void notifyObserver();
}
