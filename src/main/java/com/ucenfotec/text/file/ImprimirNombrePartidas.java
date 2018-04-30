package com.ucenfotec.text.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.util.StringUtils;

public class ImprimirNombrePartidas {

    public static String imprimir()
    {
    String listaMapas = "";
    String nombreMapaValido = "SavedMapName";
        try
        {
            FileReader reader = new FileReader("savedmaps.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;
            while((datos = buffer.readLine()) != null)
            {            	
            	if(datos.startsWith(nombreMapaValido)) {
            		listaMapas+=datos+"\n";	
            	}                
            }
            reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
		return listaMapas;
    }
}
