package com.xiaolianhust.designpattern.strategy;

public class King extends Charactor {

	public King() {
		super(new SwordBehavior());
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		Charactor c = new King();
		c.fight();
	}
}
