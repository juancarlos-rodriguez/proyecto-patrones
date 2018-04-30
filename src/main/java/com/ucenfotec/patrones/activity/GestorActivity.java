package com.ucenfotec.patrones.activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import com.ucenfotec.patrones.equip.Sword;
import com.ucenfotec.patrones.logic.Hero;
import com.ucenfotec.patrones.memory.Memory;
import com.ucenfotec.personajes.Enemy;
import com.ucenfotec.personajes.Heroe;

public class GestorActivity {
	static BufferedReader   in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream      out = System.out;
	
	public static String action(String pArea) throws IOException {
		String nuevoTerreno = "-";

		switch(pArea) {
		
			case "-":
				System.out.println("Movimiento realizado");				
			break;									
			
			case "E":
				menuPeleaEnemigo();
			break;
			
			case "S":
				System.out.println("Equipando espada");
				Heroe personaje = Memory.obtenerHeroe();
				Sword personajeConEspada = new Sword(personaje);
				Heroe nuevoHeroe = new Heroe(personaje.getName(),
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
	
	
	private static void menuPeleaEnemigo() throws IOException {
		Enemy knight = new Enemy("Caballero del bosque", 5, 5);
		int pelear = -1;
		int atacar = -1;
		out.println("\n Has encontrado un: "+ knight.getName() +" nivel 6");
		out.println("\n ¿Desea pelear con: "+ knight.getName()+ "?");
		out.println("\n Digite el número de la opción que desea");
		out.println("(1) Si");
		out.println("(2) No");
		pelear = Integer.parseInt(in.readLine());
		
		if(pelear == 1) {
			out.println("\nEl caballero te ha atacado con "+ knight.getPower() + " de ataque");
			out.println("Opciones: (1) Atacar, (2) Huir");
			out.println("Digite el número de la opción que desea");
			atacar = Integer.parseInt(in.readLine());
			if(atacar == 1) {
				Heroe personaje = Memory.obtenerHeroe();
				personaje.attack(knight);
				out.println("Has atacado con un poder de: "+ personaje.getPower());
				for(int i = 0; i < 10; i++) {
					out.println("*");
				}
				out.println("Has derrotado al enemigo!! Hurra!!!");
			}
				
		}else {
			out.println("\n Has huído de la pelea, cobarde!");
		}
		
		
	}
	
	
	
	
}
