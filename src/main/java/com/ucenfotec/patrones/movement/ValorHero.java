package com.ucenfotec.patrones.movement;

import com.ucenfotec.patrones.logic.Hero;
import com.ucenfotec.personajes.Heroe;

public class ValorHero {
	public static String valorEnMapa() {
		String hero = "H";
		
		return hero;
	};
	
	public static Heroe nuevoHeroe() {
		String nombre = "Heroe";
		
		int poder = 50;
		int vida = 100;
		int experiencia = 10;
		
		Heroe heroe = new Heroe(nombre,vida,experiencia,poder);
		
		return heroe;
	}
}
