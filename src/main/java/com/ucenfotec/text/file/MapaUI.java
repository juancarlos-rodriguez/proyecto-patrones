package com.ucenfotec.text.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import com.ucenfotec.patrones.logic.Map;

public class MapaUI {
	static BufferedReader   in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream      out = System.out;
    static Map mapa = new Map();
    public static void main(String args []) throws  java.io.IOException
    {
    	
        int opcion = -1; 
        do {
                out.println("1.Cargar mapa");
                out.println("2.Imprimir mapa");
                out.println("3.Crear archivo para guardar");
                out.println("4.Agregar mapa al archivo guardado");
                out.println("5. Salir");
                out.println("Digite la opcion");
                opcion = Integer.parseInt(in.readLine());
                procesarOpcion(opcion);
        }while(opcion !=5);
    }

    public static void procesarOpcion(int pOpcion) throws java.io.IOException
    {
        switch (pOpcion)
        {
            case 1:
                try{                	
                	out.println( "Digite el nombre de partida a cargar");
                	String mapaNombre = in.readLine();                	
                	mapa = CargarMapa.buscarMapa(mapaNombre);                	                	
                }
                catch(IOException e)
                {
                    out.println("No se encontr� el archivo");
                }

                break;
            case 2:            	            
            	mapa.imprimirMapa(); 
                break;
            case 3:
            	CrearArchivo.crearArchivo("savedmaps");
                break;
            case 4:       
            	out.println("Digite el nombre del mapa");
            	String nombreMapa = in.readLine();
            	mapa.setName(nombreMapa);
            	GuardarMapaNuevo.guardar(mapa);
                break;

            case 5:
                out.println( "Saliendo del programa");
                break;                        
            	
            default:
                out.println("Opcion inv�lida");
                break;

        }
    }
}
