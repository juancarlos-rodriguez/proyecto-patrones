package com.ucenfotec.text.file;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CrearArchivo {

    public static void crearArchivo(String pNombre)
    {    	
        try {
            FileOutputStream stream = new FileOutputStream(pNombre+".txt");
            OutputStreamWriter output = new OutputStreamWriter(stream,"UTF-8");
            BufferedWriter buffer = new BufferedWriter(output);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
