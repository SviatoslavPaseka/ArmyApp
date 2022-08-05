package com.solvd.laba.army.model.enums;

public enum TypeHandsWeapon {
	PISTOL("pistol"),
	RIFLE("rifle"),
	SNIPER_RIFLE("sniper_rifle"),
	HAND_MACHINE_GUN("hand_machine_gun");
	
	private final String value;

	private TypeHandsWeapon(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
