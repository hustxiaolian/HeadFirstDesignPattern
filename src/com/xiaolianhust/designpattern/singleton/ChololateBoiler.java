package com.xiaolianhust.designpattern.singleton;

public class ChololateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private static ChololateBoiler singleBoilder;
	
	/**
	 * 如果我们的多线程版本能够接受同步带来的代价。
	 * 那么我们直接使用synchronized关键字完成，简单省事。
	 * 
	 * 如果是单线程版本，直接去掉synchronized关键字就可以正确运行。
	 * 
	 * @return
	 */
	public static synchronized ChololateBoiler getInstance() {
		if(singleBoilder == null)
			singleBoilder = new ChololateBoiler();
		return singleBoilder;
	}
	
	/**
	 * 双重锁，版本，多线程线程中使用延迟实例化必须要这样。
	 * 相比于直接使用synchronized版本，在需要大量线程访问的时候，可以极大的提升多线程性能。
	 * @return
	 */
	public static ChololateBoiler getInstance2() {
		if(singleBoilder == null) {
			synchronized (ChololateBoiler.class) {
				if(singleBoilder == null)
					singleBoilder = new ChololateBoiler();
			}
		}
		return singleBoilder;
	}
	
	/*
	 * 还有一种在static变量中直接静态初始化，getInstance函数可以直接返回，不需要同步。
	 * 但是，这样就没法完成延迟实例化，对于巨大的对象来说有些不利。如果我们能够接受，那就使用这种。
	 * 
	 */
	
	private ChololateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	public void drain() {
		if(isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boilded() {
		if(!isEmpty() && isBoiled())
			boiled = true;
	}

	
	public boolean isBoiled() {
		return false;
	}

	public boolean isEmpty() {
		return false;
	}
}
