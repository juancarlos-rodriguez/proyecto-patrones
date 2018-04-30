package com.ucenfotec.text.file;

import com.ucenfotec.patrones.logic.*;

public class GestorMapa {

	public static Map cargarMapa(String pNombreMapa) {
		Map buscarMapa = new Map();
		buscarMapa = CargarMapa.buscarMapa(pNombreMapa);
		
		return buscarMapa;
	}
	
	public static String imprimirListaMapas(){		
		return ImprimirMapas.imprimir();
	} 
	
	public static void guardarMapa(Map pMapa) {
		GuardarMapaNuevo.guardar(pMapa);
	}

}
