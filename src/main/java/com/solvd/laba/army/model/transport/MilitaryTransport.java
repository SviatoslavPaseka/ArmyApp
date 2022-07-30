package com.solvd.laba.army.model.transport;

public abstract class MilitaryTransport extends Transport{
	private Boolean isArmed;
	
	
	public MilitaryTransport(String name, String model, Integer length, Integer width, Integer numberOfSeats,
							Boolean isUnderRepaired, Boolean isArmed) {
		super(name, model, length, width, numberOfSeats, isUnderRepaired);
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
}
