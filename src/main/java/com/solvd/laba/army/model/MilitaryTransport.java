package com.solvd.laba.army.model;

public abstract class MilitaryTransport extends Transport{
	private Boolean isArmed;
	public MilitaryTransport(String name, String model, Integer numberOfSeats, Boolean isArmed, Boolean isFly) {
		super(name, model, numberOfSeats, isFly);
		this.isArmed = isArmed;
	}
	public MilitaryTransport() {
	}
	
	public Boolean getIsArmed() {
		return isArmed;
	}
	public void setIsArmed(Boolean isArmed) {
		this.isArmed = isArmed;
	}
	@Override
	public String toString() {
		return "MilitaryTransport [ name=" + getName() + ", model=" + getModel() +", isArmed=" + isArmed + "]";
	}
}
