package com.ucenfotec.patrones.decorate;

import com.ucenfotec.patrones.equip.*;
import com.ucenfotec.patrones.logic.*;

public class DecoratorApplication {
	
    public static void main(String[] args) {
        Hero personaje = new Hero("Hero",100,10,50);        
        
        Sword personajeConEspada = new Sword(personaje);
        
        System.out.println("El heroe base tiene " 
        		+ personaje.getName() + " de nombre "
        		+ personaje.getHealth() + " de vida "
        		+ personaje.getPower() + " de ataque "
        		+ personaje.getExperience() + " de experiencia ");              
        
        System.out.println("Su personaje heroe con espada tiene "        		
        		+ personajeConEspada.getHealth() + " de vida "
        		+ personajeConEspada.getPower() + " de ataque "
        		+ personajeConEspada.getExperience() + " de experiencia ");        		
                
 }
}
