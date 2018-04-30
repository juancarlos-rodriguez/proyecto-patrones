package com.ucenfotec.patrones.memory;

import com.ucenfotec.patrones.logic.Coordenada;
import com.ucenfotec.patrones.logic.Hero;
import com.ucenfotec.patrones.logic.Map;
import com.ucenfotec.patrones.movement.ValorHero;

public class Memory {
	public static Hero heroe = new Hero();
    public static Map mapa = new Map();
    public static Coordenada posicion = new Coordenada();
	
	public static void datosIniciales() {
		heroe = ValorHero.nuevoHeroe();		
	}		   

	public static Hero obtenerHeroe() {
		return heroe;
	}

	public static void cambiarHeroe(Hero pHeroe) {
		heroe = pHeroe;		
	}
		
}
