package com.ucenfotec.patrones.memory;

import com.ucenfotec.patrones.logic.Coordenada;
import com.ucenfotec.patrones.logic.Hero;
import com.ucenfotec.patrones.logic.Map;
import com.ucenfotec.patrones.movement.ValorHero;
import com.ucenfotec.personajes.Heroe;

public class Memory {
	public static Heroe heroe = new Heroe();
    public static Map mapa = new Map();
    public static Coordenada posicion = new Coordenada();
	
	public static void datosIniciales() {
		heroe = ValorHero.nuevoHeroe();		
	}		   

	public static Heroe obtenerHeroe() {
		return heroe;
	}

	public static void cambiarHeroe(Heroe pHeroe) {
		heroe = pHeroe;		
	}
		
}
