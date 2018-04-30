package com.ucenfotec.patrones.activity;

import com.ucenfotec.patrones.equip.Sword;
import com.ucenfotec.patrones.logic.Hero;
import com.ucenfotec.patrones.memory.Memory;

public class GestorActivity {
	
	public static String action(String pArea) {
		String nuevoTerreno = "-";

		switch(pArea) {
		
			case "-":
				System.out.println("Movimiento realizado");				
			break;									
			
			case "E":
				System.out.println("Enemigo derrotado");				
			break;
			
			case "S":
				System.out.println("Equipando espada");
				Hero personaje = Memory.obtenerHeroe();
				Sword personajeConEspada = new Sword(personaje);
				Hero nuevoHeroe = new Hero(personaje.getName(),
										personajeConEspada.getHealth(),
										personajeConEspada.getExperience(),
										personajeConEspada.getPower());
				Memory.cambiarHeroe(nuevoHeroe);
												
			break;
			
			default:
				System.out.println("Espacio no definido");
			break;
		}
	
		return nuevoTerreno;
	}
}
