package com.xiaolianhust.designpattern.strategy;

public class Charactor {
	public WeaponBehavior weaponBehavior;
	
	public Charactor(WeaponBehavior weaponBehavior) {
		super();
		this.weaponBehavior = weaponBehavior;
	}

	protected void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
	public void fight() {
		weaponBehavior.useWeapon();
	}
	
	
}
