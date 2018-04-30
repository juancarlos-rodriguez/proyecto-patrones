package com.ucenfotec.patrones.movement;

import com.ucenfotec.patrones.equip.Sword;
import com.ucenfotec.patrones.logic.Coordenada;
import com.ucenfotec.patrones.logic.Hero;
import com.ucenfotec.patrones.logic.Map;
import com.ucenfotec.patrones.memory.Memory;

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
				System.out.println("Has encontrado una Espada");				
			return true;
			
			case "E":
				System.out.println("Has encontrado un Enemigo");
			return true;
			
			default:
				System.out.println("Espacio no definido");
			break;
		}
				
		return false;
	}
}
