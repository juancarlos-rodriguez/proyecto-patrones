package com.ucenfotec.patrones.movement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import com.ucenfotec.patrones.equip.*;
import com.ucenfotec.patrones.logic.*;
import com.ucenfotec.text.file.GestorMapa;
import com.ucenfotec.text.file.ImprimirNombrePartidas;

public class ProyectoPatronesMovementUI {
    
	static BufferedReader   in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream      out = System.out;
    
    static Hero personaje = new Hero();
    static Map mapa = null;
    static Coordenada posicion;
    public static void main(String[] args) throws IOException{                               	
                
    	int opcion = -1; 
        do {	        	
            	out.println("\n MENU APLICACION");
                out.println("1.Cargar partida");
                out.println("2.Salir");                
                out.println("Digite la opcion");
                opcion = Integer.parseInt(in.readLine());
                procesarOpcion(opcion);
	        	if(partidaValida(mapa)) {
	        		calcularPosicionHeroe();	            	
	            	realizarPartida();
	            }else {
	            	out.println("Partida no encontrada");
	            }                              
        }while(opcion !=2);
        
    }
    
    private static void realizarPartida() throws IOException {
    	int opcionJugador;
    	do {
    		menuJugador();            
            opcionJugador = Integer.parseInt(in.readLine());
            procesarMovimiento(opcionJugador);        	                             
    	}while(opcionJugador !=0);    	    		
	}

	private static void procesarMovimiento(int pOpcionJugador) throws IOException{
		
    switch (pOpcionJugador)
    {
        case 1:
    		out.println("Heroe");
        	break;
        case 2:
        	out.println("Mostrando mapa");
        	out.println(mapa.getName());        	
        	out.println(mapa.arenaToString());
        	break;
        case 3:
        	out.println("Moviendo hacia arriba");
        	mapa = GestorMovement.moverArriba(mapa,posicion);
        	calcularPosicionHeroe();
        	break;
        case 4:
        	out.println("Moviendo hacia abajo");
        	mapa = GestorMovement.moverAbajo(mapa,posicion);
        	calcularPosicionHeroe();
        	break;
        case 5:
        	out.println("Moviendo hacia la izquierda");
        	mapa = GestorMovement.moverIzquierda(mapa,posicion);
        	calcularPosicionHeroe();
        	break;
        case 6:
        	out.println("Moviendo hacia la derecha");
        	mapa = GestorMovement.moverDerecha(mapa,posicion);
        	calcularPosicionHeroe();
        	break;        
        case 0:
        	out.println("Saliendo del juego");
        	break;  
        default:
        	out.println("Opcion invalida");
        break;

	    }
	}			

	private static void menuJugador() {
		out.println("\n MENU DE JUGADOR");
		out.println("1.Ver estado personaje");
        out.println("2.Ver el mapa");
        out.println("3.Mover hacia arriba");
        out.println("4.Mover hacia abajo");
        out.println("5.Mover hacia la izquierda");
        out.println("6.Mover hacia la derecha");
        out.println("0.Terminar partida");
        out.println("Digite la opcion");		
	}

	private static void calcularPosicionHeroe() {    	    
    	posicion = CalcularPosicion.obtenerPosicionHero(mapa);		
	}

	public static void procesarOpcion(int pOpcion) throws java.io.IOException{

		switch (pOpcion)
        {
            case 1:
                try{              
                	out.println("Lista de partidas guardadas");
                	out.println(ImprimirNombrePartidas.imprimir());
                	out.println( "Digite el nombre de partida a cargar");
                	String mapaNombre = in.readLine();                	
                	mapa = GestorMapa.cargarMapa(mapaNombre);                	                	
                }
                catch(IOException e)
                {
                    out.println("Partina no encontrada");
                }

                break;
            case 2:
            		out.println("Fin de la aplicacion");
            	break;
            default:
            	out.println("Opcion invalida");
            break;

        }
    }
    
    public static boolean partidaValida(Map pMapa) {
    	
    return (pMapa!=null);
    }
}
