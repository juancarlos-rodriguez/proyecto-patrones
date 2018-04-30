package com.ucenfotec.patrones.movement;

import com.ucenfotec.patrones.logic.Coordenada;
import com.ucenfotec.patrones.logic.Map;

public class CalcularDestino {

	public static boolean espacioParaMover(Map pMapa, Coordenada pDestino){
		
		String valorMapa = pMapa.getArena()[pDestino.getX()][pDestino.getY()]; 
		
		switch(valorMapa) {
		
			case "-":
			return true;			
			
			case "M":
				System.out.println("No es posible por espacio de Montaña");
			break;
			
			case "A":
				System.out.println("No es posible por espacio de Agua");
			break;
			
			case "S":
				System.out.println("No es posible por espacio de Espada");
			break;
			
			default:
				System.out.println("Espacio no definido");
			break;
		}
				
		return false;
	}
}
