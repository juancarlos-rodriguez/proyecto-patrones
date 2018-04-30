package com.ucenfotec.patrones.movement;

import com.ucenfotec.patrones.logic.Hero;

public class ValorHero {
	public static String valorEnMapa() {
		String hero = "H";
		
		return hero;
	};
	
	public static Hero nuevoHeroe() {
		String nombre = "Heroe";
		
		int poder = 50;
		int vida = 100;
		int experiencia = 10;
		
		Hero heroe = new Hero(nombre,vida,experiencia,poder);
		
		return heroe;
	}
}
