package com.ucenfotec.patrones.logic;

public class Coordenada {
	int x;
	int y;
	
	public Coordenada() {
		this.x = 0;
		this.y = 0;
	}
	
	public Coordenada(int pX, int pY) {
		this.x = pX;
		this.y = pY;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
		
}
