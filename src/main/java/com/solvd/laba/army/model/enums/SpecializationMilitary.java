package com.solvd.laba.army.model.enums;

public enum SpecializationMilitary {
	FLYING("FLYING"), TANKS("TANKS"), JEEPS("JEEPS");
	
	
	private final String value;

	private SpecializationMilitary(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
}
