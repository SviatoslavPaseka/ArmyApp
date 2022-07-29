package com.solvd.laba.army.model;

public abstract class Transport {
	private String name;
	private String model;
	private Integer numberOfSeats;
	private Boolean isFly;
	
	public Transport() {}
	public Transport(String name, String model, Integer numberOfSeats, Boolean isFly) {
		this.name = name;
		this.model = model;
		this.numberOfSeats = numberOfSeats;
		this.isFly = isFly;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public Boolean getIsFly() {
		return isFly;
	}
	public void setIsFly(Boolean isFly) {
		this.isFly = isFly;
	}
	
	
}
