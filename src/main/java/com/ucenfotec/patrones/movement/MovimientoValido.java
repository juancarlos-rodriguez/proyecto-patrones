package com.ucenfotec.patrones.movement;

import com.ucenfotec.patrones.logic.Coordenada;

public class MovimientoValido {

	public static boolean validarArriba(Coordenada pCoordenada) {
	
		if(pCoordenada.getX()>0) {
			return true;
		}
		
		return false;
	}
	
	public static boolean validarAbajo(Coordenada pCoordenada) {
		
		if(pCoordenada.getX()<9) {
			return true;
		}
		
		return false;
	}
	
	public static boolean validarIzquierda(Coordenada pCoordenada) {
		
		if(pCoordenada.getY()>0) {
			return true;
		}
		
		return false;
	}
	
	public static boolean validarDerecha(Coordenada pCoordenada) {
		
		if(pCoordenada.getY()<9) {
			return true;
		}
		
		return false;
	}
}
