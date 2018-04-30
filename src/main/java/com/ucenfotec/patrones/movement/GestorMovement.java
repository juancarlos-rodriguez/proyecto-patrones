package com.ucenfotec.patrones.movement;

import com.ucenfotec.patrones.logic.*;

public class GestorMovement {
	
	public static Map moverArriba(Map pMap, Coordenada pOrigen) {
		Map mapa = pMap;		
		
		if(MovimientoValido.validarArriba(pOrigen)) {
			Coordenada destino = new Coordenada(pOrigen.getX()-1,pOrigen.getY());			
			
			if (CalcularDestino.espacioParaMover(pMap, destino)) {
				mapa = Movement.ejecutar(pMap, pOrigen, destino);
			}
			
		} else {
			System.out.println("Movimiento arriba fuera del mapa");
		}
		
		return mapa;
	}
	
	public static Map moverAbajo(Map pMap, Coordenada pOrigen) {
		Map mapa = pMap;		
		
		if(MovimientoValido.validarAbajo(pOrigen)) {
			Coordenada destino = new Coordenada(pOrigen.getX()+1,pOrigen.getY());			
			
			if (CalcularDestino.espacioParaMover(pMap, destino)) {
				mapa = Movement.ejecutar(pMap, pOrigen, destino);
			}
		} else {
			System.out.println("Movimiento abajo fuera del mapa");
		}
		
		return mapa;
	}
	
	public static Map moverIzquierda(Map pMap, Coordenada pOrigen) {
		Map mapa = pMap;		
		
		if(MovimientoValido.validarIzquierda(pOrigen)) {
			Coordenada destino = new Coordenada(pOrigen.getX(),pOrigen.getY()-1);			
			
			if (CalcularDestino.espacioParaMover(pMap, destino)) {
				mapa = Movement.ejecutar(pMap, pOrigen, destino);
			}
		} else {
			System.out.println("Movimiento izquierda fuera del mapa");
		}
		
		return mapa;
	}
	
	public static Map moverDerecha(Map pMap, Coordenada pOrigen) {
		Map mapa = pMap;		
		
		if(MovimientoValido.validarDerecha(pOrigen)) {
			Coordenada destino = new Coordenada(pOrigen.getX(),pOrigen.getY()+1);			
			
			if (CalcularDestino.espacioParaMover(pMap, destino)) {
				mapa = Movement.ejecutar(pMap, pOrigen, destino);
			}
		} else {
			System.out.println("Movimiento derecha fuera del mapa");
		}
		
		return mapa;
	}

}
