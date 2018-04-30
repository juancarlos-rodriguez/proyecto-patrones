package com.ucenfotec.text.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.ucenfotec.patrones.logic.Map;

public class CargarMapa {
	
   public static Map buscarMapa(String pNombre)
   {
	   Map mapaJuego = new Map(pNombre);
	   Map mapaEncontrado = null;
       try
       {    	      	   
           FileReader reader = new FileReader("savedmaps.txt");
           BufferedReader buffer = new BufferedReader(reader);                     
           String datos;           

           String nombreMapa = "SavedMapName:"+pNombre;
           boolean encontrado=false;
           int j=0;
           String terreno [][]= new String[mapaJuego.getFilas()][mapaJuego.getColumnas()];
           
           while((datos = buffer.readLine()) != null)
           {        	   
               if(datos.equals(nombreMapa)||encontrado==true) {
            	   mapaEncontrado = new Map(pNombre);
            	   
            	   if(datos.equals("End")) {
            		   mapaEncontrado.setName(pNombre);
            		   mapaEncontrado.setArena(terreno);
            		   return mapaEncontrado;
            	   }
            	   if(datos.length()==mapaJuego.getColumnas()) {            		               		   
            		   for(int i=0;i<mapaJuego.getColumnas();i++) {
            			   terreno[j][i]=String.valueOf(datos.charAt(i));            			  
            		   }
            		   j++;
            	   }            	               	   
            	   encontrado=true;                        	               		 
            	               	   
               }else{
            	   encontrado=false;
            	   
               }
           }
           reader.close();
       }
       catch(IOException e)
       {
           e.printStackTrace();
       }
	
	return mapaEncontrado;
   }
}
