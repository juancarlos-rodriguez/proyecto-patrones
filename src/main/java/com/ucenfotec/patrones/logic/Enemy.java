package com.ucenfotec.patrones.logic;

public class Enemy implements IAttack {
	private String name;
	private int health;
	private int power;
	
	public Enemy(String pName, int pHealth, int pPower) {
		this.name = pName;
		this.health = pHealth;
		this.power = pPower;
	}
	
	public Enemy() {}

	@Override
	public int attack( Character character ) {
		int myAttack = 0;
		myAttack = character.getHealth() - getPower();
		return myAttack;//Refactorizar
	}
	
	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getPower() {
		return power;
	}

	@Override
	public String toString() {
		return "Enemy [name=" + name + ", health=" + health + ", power=" + power + "]";
	}

	@Override
	public int receiveDamage() {
		// TODO Auto-generated method stub
		return 0;
	}
}
