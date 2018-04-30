package com.ucenfotec.personajes;

public class Enemy extends Character implements IAbility{
	private String name;
	private int health;
	private int power;
	
	public Enemy(String pName, int pHealth, int pPower) {
		this.name = pName;
		this.health = pHealth;
		this.power = pPower;
	}
	
	public Enemy() {}
	
	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getPower() {
		return power;
	}

	private void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Enemy [name=" + name + ", health=" + health + ", power=" + power + "]";
	}
	
	@Override
	public void receiveDamage(int pAttack) {
		if ((this.getHealth() - pAttack) > 0) {
			this.setHealth(this.getHealth() - pAttack);
		} else {
			this.setHealth(0);
		}
	}

	@Override
	public void attack(Character enemy) {
		// TODO Auto-generated method stub
		
	}
}
