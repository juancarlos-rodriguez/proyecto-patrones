package com.ucenfotec.patrones.equip;

import com.ucenfotec.patrones.logic.Hero;
import com.ucenfotec.personajes.Character;
import com.ucenfotec.personajes.Heroe;

public class Sword extends CharacterEquipment{
	int health;
	int experience;
	int power;
	
	public Sword(Heroe personaje){
        this.health = personaje.getHealth() + 10;
        this.experience = personaje.getExperience() + 10;
        this.power = personaje.getPower() + 100;        
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
	public void attack(Character enemy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveDamage(int pAttack) {
		// TODO Auto-generated method stub
		
	}
}
