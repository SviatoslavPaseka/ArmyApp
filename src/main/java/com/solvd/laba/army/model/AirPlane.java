package com.solvd.laba.army.model;

public class AirPlane extends Transport{
	private Integer id;
	private Boolean isArmed;
	private Boolean isPassenger;
	
	public AirPlane() {
	}
	
	

	public AirPlane(String name, String model, Integer length, Integer width, 
					Integer numberOfSeats,	Boolean isUnderRepaired, Integer id, 
					Boolean isArmed, Boolean isPassenger) {
		
		super(name, model, length, width, numberOfSeats, isUnderRepaired);
		this.id = id;
		this.isArmed = isArmed;
		this.isPassenger = isPassenger;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getIsArmed() {
		return isArmed;
	}
	public void setIsArmed(Boolean isArmed) {
		this.isArmed = isArmed;
	}
	public Boolean getIsPassenger() {
		return isPassenger;
	}
	public void setIsPassenger(Boolean isPassenger) {
		this.isPassenger = isPassenger;
	}
	
	
	
}
