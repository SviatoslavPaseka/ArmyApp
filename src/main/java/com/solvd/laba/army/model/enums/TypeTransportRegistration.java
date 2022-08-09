package com.solvd.laba.army.model.enums;

public enum TypeTransportRegistration {
	NONE("none"),
	MILITARY("military"),
	UN_MILITARY("un_military");
	
	private final String value;

	private TypeTransportRegistration(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
