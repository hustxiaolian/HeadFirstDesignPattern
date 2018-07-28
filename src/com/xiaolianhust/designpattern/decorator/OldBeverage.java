package com.xiaolianhust.designpattern.decorator;

public abstract class OldBeverage {
	String description;
	
	boolean milk;
	boolean soy;
	boolean mocha;
	boolean whip;
	
	public double cost() {
		double result = 0;
		
		result += !isMilk()? 0 :5.5;
		result += !isSoy()? 0 :20;
		result += !isMocha() ? 0: 15.5;
		result += !isWhip()? 0:7.7;
		
		return result;
	}
	
	protected boolean isMilk() {
		return milk;
	}
	protected void setMilk(boolean milk) {
		this.milk = milk;
	}
	protected boolean isSoy() {
		return soy;
	}
	protected void setSoy(boolean soy) {
		this.soy = soy;
	}
	protected boolean isMocha() {
		return mocha;
	}
	protected void setMocha(boolean mocha) {
		this.mocha = mocha;
	}
	protected boolean isWhip() {
		return whip;
	}
	protected void setWhip(boolean whip) {
		this.whip = whip;
	}
	protected String getDescription() {
		return description;
	}
	
	
}
