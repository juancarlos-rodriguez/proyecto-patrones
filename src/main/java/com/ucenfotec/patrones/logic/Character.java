package com.ucenfotec.patrones.logic;

import java.util.ArrayList;

public class Character implements IAttack, IAbility {
	
	private String name;
	private int health;
	private int experience;
	private int power;
	private ArrayList<Item> myItems;
	private ArrayList<Mission> myMissions;//Refactorizar (No estoy seguro)
	
	
	public Character(String pName, int pHealth, int pExperience, int pPower) {
		this.name = pName;
		this.health = pHealth;
		this.experience = pExperience;
		this.power = pPower;
	}
	
	public Character() {}

	public Item getObject() {
		return null;//Refactorizar después
	}
	
	public ArrayList<Item> loadObject(Item pItem) {
		myItems.add(pItem);
		return myItems;//Refactorizar después
	}
	
	public int addExperience() {
		return 0;//Refactorizar después
	}
	
	public void moveCharacter() {
		//Refactorizar después
	}
	

	@Override
	public String ability() {
		return null;//Refactorizar después
	}

	@Override
	public int attack() {
		Enemy enemy = new Enemy();
		int myAttack = 0;
		myAttack = enemy.getHealth() - getPower();
		return myAttack;//Refactorizar
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

}
