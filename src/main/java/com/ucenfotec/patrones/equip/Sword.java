package com.ucenfotec.patrones.equip;

import com.ucenfotec.patrones.logic.Hero;

public class Sword extends CharacterEquipment{
	int health;
	int experience;
	int power;
	
	public Sword(Hero pPersonaje){
        this.health = pPersonaje.getHealth() + 10;
        this.experience = pPersonaje.getExperience() + 10;
        this.power = pPersonaje.getPower() + 100;        
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
}
