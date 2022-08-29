package com.solvd.laba.army.model.enums;

public enum MilitaryRank {
	NONE("none"),
	MECHANIC("mechanic"),
	PRIVATE("private"),
	CORPORAL("corporal"),
	SERGEANT("sergeant"), 
	MAJOR("major"), 
	LIEUTENANT("lieutenant"), 
	CAPTAIN("captain"), 
	COLONEL("colonel"), 
	GENERAL("general"), 
	GENERAL_OF_ARMY("general_of_army");
	
	private final String  value;

	MilitaryRank(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
