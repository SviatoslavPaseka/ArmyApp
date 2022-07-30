package com.solvd.laba.army.model.transport;

public class MilitaryJeep extends MilitaryTransport{
	private Integer id;
	private Integer numberOfWheel;
	
	
	public MilitaryJeep() {
		super();
	}
	
	public MilitaryJeep(String name, String model, Integer length, Integer width, Integer numberOfSeats,
			Boolean isUnderRepaired, Boolean isArmed, Integer id, Integer numberOfWheel) {
		super(name, model, length, width, numberOfSeats, isUnderRepaired, isArmed);
		this.id = id;
		this.numberOfWheel = numberOfWheel;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumberOfWheel() {
		return numberOfWheel;
	}
	public void setNumberOfWheel(Integer numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}
	
	
	
	
}
