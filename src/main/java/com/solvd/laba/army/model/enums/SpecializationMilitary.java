package com.solvd.laba.army.model.enums;

public enum SpecializationMilitary {
	FLYING("FLYING"), TANK("TANK"), WHEEL("WHEEL");
	
	
	private final String value;

	private SpecializationMilitary(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
}
