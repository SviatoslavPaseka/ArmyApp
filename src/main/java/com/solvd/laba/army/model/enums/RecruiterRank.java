package com.solvd.laba.army.model.enums;

public enum RecruiterRank { 
	MILITARY_DOCTOR("Military doctor"), 
	RANK1_EMPL("Employee rank1"),
	RANK2_EMPL("Employee rank1"), 
	OFFICE_MANAGER("Office manager"),
	OFFICE_HEAD("Head office");
	
	private final String value;

	private RecruiterRank(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
