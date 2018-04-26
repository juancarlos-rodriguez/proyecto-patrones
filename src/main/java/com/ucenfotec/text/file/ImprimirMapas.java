package com.ucenfotec.text.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImprimirMapas {

    public static String imprimir()
    {
    String listaMapas = "";
        try
        {
            FileReader reader = new FileReader("savedmaps.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;
            while((datos = buffer.readLine()) != null)
            {
                listaMapas+=datos;
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
