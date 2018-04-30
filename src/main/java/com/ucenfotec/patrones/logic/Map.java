package com.ucenfotec.patrones.logic;

import java.util.ArrayList;
import java.util.Arrays;

public class Map implements IGround {
	private int filas;
	private int columnas;
	private String name;
	private String[][] arena;
	private ArrayList<Item> mapItems = new ArrayList<>();
	private ArrayList<Mission> mapMissions = new ArrayList<>();
	
	public Map(String pName, String[][] pArena, ArrayList<Mission> pMyMissions, ArrayList<Item> pMyItems) {
		this.name = pName;
		this.arena = pArena;
		this.mapMissions = pMyMissions;
		this.mapItems = pMyItems;
	}
	
	public Map() {
		this.name = "";
		this.filas = 10;
		this.columnas = 10;
		this.arena = new String[filas][columnas];
	}
	
	public Map(String pName) {
		this.name = pName;
		this.filas = 10;
		this.columnas = 10;
		this.arena = new String[filas][columnas];
	}

	public String getName() {
		return name;
	}
	
	public void setName(String pName) {
		this.name = pName;
	}	

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public String[][] getArena() {
		return arena;
	}

	public void setArena(String[][] pArena) {
		this.arena = pArena;
	}
	
	public String arenaToString() {
		
		String arenaText="";
		
		for(int i=0;i<filas;i++) {		
			for(int j=0;j<columnas;j++){
				arenaText+=(arena[i][j]);
			}
			arenaText+=("\n");
		};
		return arenaText;
	}
	
	public ArrayList<Item> getMapItems() {
		return this.mapItems;
	}
	
	public ArrayList<Mission> getMapMissions() {
		return this.mapMissions;
	}

	public ArrayList<Item> addObjetsIntoMap(String pNameItem, int pPowerItem){
		Item newItem = new Item(pNameItem, pPowerItem);
		try {
			if(this.mapItems == null || this.mapItems != null){
				this.mapItems.add(newItem);
			}
		}catch(Exception error) {
			System.out.println("Class " + error.getClass());
			System.out.println("Message " + error.getMessage());
			System.out.println("Cause " + error.getCause());
		}
		
		return this.mapItems;
	}
	
	public ArrayList<Mission> addMissionsIntoMap(String pNameMission, ArrayList<Objective> pMyObjectives){
		Mission newMission = new Mission(pNameMission, pMyObjectives);
		
		try {
			 if(mapMissions == null || this.mapMissions != null){
				 this.mapMissions.add(newMission);
			 }

		}catch(Exception error) {
			System.out.println("Class " + error.getClass());
			System.out.println("Message " + error.getMessage());
			System.out.println("Cause " + error.getCause());
		}
		
		return this.mapMissions;
		
	}
	
	@Override
	public String type(String pType) {
		return pType;//Refactorizar después
	}

	@Override
	public String toString() {
		return "Map [name=" + name + ", arena=" + Arrays.toString(arena) + ", mapItems=" + mapItems + ", mapMissions="
				+ mapMissions + "]";
	}
}
