package com.ucenfotec.patrones.logic;

import java.util.ArrayList;

public class Character implements IAttack, IAbility{
	
	private String name;
	private int health;
	private int experience;
	private int power;
	private ArrayList<Item> myItems = new ArrayList<>();
	private ArrayList<Mission> myMissions = new ArrayList<>();//Refactorizar (No estoy seguro)
	
	
	public Character(String pName, int pHealth, int pExperience, int pPower) {
		this.name = pName;
		this.health = pHealth;
		this.experience = pExperience;
		this.power = pPower;
	}
	
	public Item getObject() {
		return null;
	}
	
	public ArrayList<Item> loadObject(Item pItem) {
		myItems.add(pItem);
		return myItems;
	}
	
	public int addExperience() {
		return 0;
	}
	
	public void moveCharacter() {
	}
	

	@Override
	public String ability() {
		return null;
	}

	@Override
	public int attack(Enemy enemy) {
		int attack = 0;
		attack = enemy.getHealth() - getPower();
		return attack;
	}

	
	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getExperience() {
		return experience;
	}

	public int getPower() {
		return power;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", health=" + health + ", experience=" + experience + ", power=" + power
				+ ", myItems=" + myItems + ", myMissions=" + myMissions + "]";
	}

	@Override
	public void receiveDamage(int pAttack) {
		int damage = 0;
		damage = getHealth() - pAttack;
		this.health = damage;
	}

	@Override
	public int attack(Object character) {
		// TODO Auto-generated method stub
		return 0;
	}

}
