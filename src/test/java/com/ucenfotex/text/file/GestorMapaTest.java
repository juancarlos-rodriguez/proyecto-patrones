package com.ucenfotex.text.file;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.ucenfotec.patrones.logic.*;
import com.ucenfotec.text.file.CargarMapa;
import com.ucenfotec.text.file.GestorMapa;


public class GestorMapaTest {
	@Test
	public void testCargarMapa() {
						
		String testMapa="";		
		testMapa +="----------\n";
		testMapa +="----------\n";
		testMapa +="----------\n";
		testMapa +="----------\n";
		testMapa +="AAAAAAAAAA\n";
		testMapa +="AAAAAAAAAA\n";
		testMapa +="----------\n";
		testMapa +="---------M\n";
		testMapa +="----MMMMMM\n";
		testMapa +="MMMMMMMMMM\n";		
		
		Map mapa = new Map();
		String nombreMapa= "m1";
		
		mapa = GestorMapa.cargarMapa(nombreMapa);		
		assertEquals(testMapa,mapa.arenaToString());
	}
}
