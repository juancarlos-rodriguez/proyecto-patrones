package com.ucenfotec.personajes;

import java.util.ArrayList;

import com.ucenfotec.patrones.logic.Item;
import com.ucenfotec.patrones.logic.Mission;

public class Character implements IAttack, IAbility {
	
	private String name;
	private int health;
	private int experience;
	private int power;
	private ArrayList<Item> myItems = new ArrayList<>();
    private ArrayList<Mission> myMissions;


    public Character(String pName, int pHealth, int pExperience, int pPower) {
		this.name = pName;
		this.health = pHealth;
		this.experience = pExperience;
		this.power = pPower;
	}
	
	public Character() {}

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
    public void attack(Enemy enemy) {
        enemy.receiveDamage(this.getPower());
    }


    public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

    private void setHealth(int health) {
        this.health = health;
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
        if ((this.getHealth() - pAttack) > 0) {
            this.setHealth(this.getHealth() - pAttack);
        } else {
            this.setHealth(0);
        }
    }


}
