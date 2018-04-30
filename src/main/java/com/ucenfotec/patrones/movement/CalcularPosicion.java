package com.ucenfotec.patrones.movement;

import com.ucenfotec.patrones.logic.Map;
import com.ucenfotec.patrones.logic.Coordenada;

public class CalcularPosicion {

	public static Coordenada obtenerPosicionHero(Map pMapa){
		Coordenada posicion = new Coordenada();
		
		for(int i=0;i<pMapa.getFilas();i++) {
			for(int j=0;j<pMapa.getColumnas();j++) {				            
				if(pMapa.getArena()[i][j].equals(ValorHero.valorEnMapa())) {					
					posicion.setX(i);
					posicion.setY(j);
				}				
			}
		}				
		
		return posicion;
	}
}
