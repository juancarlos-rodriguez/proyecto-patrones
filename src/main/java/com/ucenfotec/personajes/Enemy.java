package com.ucenfotec.personajes;

public class Enemy {
	private String name;
	private int health;
	private int power;
	
	public Enemy(String pName, int pHealth, int pPower) {
		this.name = pName;
		this.health = pHealth;
		this.power = pPower;
	}
	
	public Enemy() {}
	// Para que los dos reciban un enemigo con las mismas caracteristicas me parece que enemy y character tienen que heredar de una clase abstracta
//	@Override
//	public void attack(Character character) {
//		int myAttack = 0;
//		myAttack = character.getHealth() - getPower();
//	}
	
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
	
//	@Override
//	public void receiveDamage(int pAttack) {
//		if ((this.getHealth() - pAttack) > 0) {
//			this.setHealth(this.getHealth() - pAttack);
//		} else {
//			this.setHealth(0);
//		}
//	}
}
