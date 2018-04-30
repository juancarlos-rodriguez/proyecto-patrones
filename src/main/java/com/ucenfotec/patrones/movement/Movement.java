package com.ucenfotec.patrones.movement;

import com.ucenfotec.patrones.logic.Coordenada;
import com.ucenfotec.patrones.logic.Map;

public class Movement {

	public static Map ejecutar(Map pMap, Coordenada origen, Coordenada destino) {
		Map mapa = pMap;
		String aux="";
				
		aux = mapa.getArena()[destino.getX()][destino.getY()];
		mapa.getArena()[destino.getX()][destino.getY()] = mapa.getArena()[origen.getX()][origen.getY()];
		mapa.getArena()[origen.getX()][origen.getY()] = aux;				
		
		return mapa;
	}
}
