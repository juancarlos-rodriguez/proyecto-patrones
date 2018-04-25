package com.ucenfotec.patrones.logic;

public class Item {
	private String name;
	private int power;
	
	public Item(String pName, int pPower) {

		this.name = pName;
		this.power = pPower;
	}
	
	public int addPowerToCharacterByItem() {
		return 0;//Refactorizar después
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	@Override
	public String toString() {
		return "Object [name=" + name + ", power=" + power + "]";
	}
	
	
}
