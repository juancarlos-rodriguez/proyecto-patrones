package com.ucenfotec.text.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.ucenfotec.patrones.logic.*;

public class GuardarMapaNuevo {

    public static void guardar(Map pMapa)
    {
    	
        try {
        	FileReader reader = new FileReader("savedmaps.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;            
            
            String nombreMapa = "SavedMapName:"+pMapa.getName();
            boolean nombreRepetido = false;
            
            while((datos = buffer.readLine()) != null && nombreRepetido==false){
            	
            	
            	if(datos.equals(nombreMapa)) {
            		nombreRepetido = true;	            	            		
            	}
            }
            if(nombreRepetido == false) {
            	FileWriter writer = new FileWriter("savedmaps.txt", true);
                BufferedWriter buffered = new BufferedWriter(writer);	            		             
                
                buffered.newLine();
	            buffered.write(nombreMapa);	            
	            buffered.newLine();
	            
	            for(int i=0;i<pMapa.getFilas();i++) {
	            	String filaTerreno="";
	            	for(int j=0;j<pMapa.getColumnas();j++) {
	            		filaTerreno+=pMapa.getArena()[i][j];            	
	            	}   		            		
	            		buffered.write(filaTerreno);            		
	            		buffered.newLine();
	            }        
	            
	            buffered.write("end");		            
	            buffered.close();
            }
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
