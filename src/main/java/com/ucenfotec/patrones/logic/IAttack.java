package com.ucenfotec.patrones.logic;

public interface IAttack {
	public int attack(Object character);
	public void receiveDamage(int pAttack);
	int attack(Enemy enemy);
}
