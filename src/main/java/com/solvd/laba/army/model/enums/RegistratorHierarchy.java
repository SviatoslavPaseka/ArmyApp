package com.solvd.laba.army.model.enums;

public enum RegistratorHierarchy {
	ZERO("zero", 0), FIRST("first", 1000), SECOND("second", 2000);
	
	private final String named;
	private final Integer salary;
	
	private RegistratorHierarchy(String named, Integer salary) {
		this.named = named;
		this.salary = salary;
	}

	public String getNamed() {
		return named;
	}
	public Integer getSalary() {
		return salary;
	}
	
	
}
