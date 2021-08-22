package com.eni.TP.enums;

public enum Category {
	GENTIL("Gentil"),
	MECHANT("Méchant"),
	GENTIL_MECHANT("Gentil/Méchant");
	
	private String name;
	
	private Category(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

