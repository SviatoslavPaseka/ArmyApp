package com.solvd.laba.army.model;

public class MilitaryJeep extends MilitaryTransport{
	private Integer id;
	private Integer length;
	private Integer numberOfWheel;
	public MilitaryJeep(String name, String model, Integer numberOfSeats, Boolean isArmed,
			Boolean isFly, Integer id,	Integer length, Integer numberOfWheel) {
		super(name, model, numberOfSeats, isArmed, isFly);
		this.id = id;
		this.length = length;
		this.numberOfWheel = numberOfWheel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getNumberOfWheel() {
		return numberOfWheel;
	}
	public void setNumberOfWheel(Integer numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}
	@Override
	public String toString() {
		return "MilitaryJeep [id=" + id + ", length=" + length + ", numberOfWheel=" + numberOfWheel + ", getIsArmed()="
				+ getIsArmed() + ", getName()=" + getName() + ", getModel()=" + getModel() + ", getNumberOfSeats()="
				+ getNumberOfSeats() + "]";
	}
	
	
	
}
