package com.ucenfotec.patrones.logic;

public class Objective {
	private String name;
	private boolean status;
	
	public Objective(String pName, boolean pStatus) {
		this.name = pName;
		this.status = pStatus;
	}

	public String getName() {
		return name;
	}

	public boolean isStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Objective [name=" + name + ", status=" + status + "]";
	}
}
