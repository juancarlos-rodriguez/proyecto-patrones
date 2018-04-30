package com.ucenfotec.patrones.movement;

import java.io.IOException;

import com.ucenfotec.patrones.activity.GestorActivity;
import com.ucenfotec.patrones.logic.Coordenada;
import com.ucenfotec.patrones.logic.Map;

public class Movement {

	public static Map ejecutar(Map pMap, Coordenada origen, Coordenada destino) throws IOException {
		Map mapa = pMap;
		String aux="";
				
		aux = GestorActivity.action(mapa.getArena()[destino.getX()][destino.getY()]);
		mapa.getArena()[destino.getX()][destino.getY()] = mapa.getArena()[origen.getX()][origen.getY()];
		mapa.getArena()[origen.getX()][origen.getY()] = aux;				
		
		return mapa;
	}
}
