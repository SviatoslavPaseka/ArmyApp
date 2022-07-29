package com.solvd.laba.army.model;

public class AirPlane extends Transport{
	private Integer id;
	private Boolean isArmed;
	private Boolean isPassenger;
	private Integer length;
	private Integer width;
	
	public AirPlane() {
	}
	public AirPlane(String name, String model, Integer numberOfSeats,
					Boolean isFly, Integer id, Boolean isArmed, Boolean isPassenger,
					Integer length, Integer width) {
		super(name, model, numberOfSeats, isFly);
		this.id = id;
		this.isArmed = isArmed;
		this.isPassenger = isPassenger;
		this.length = length;
		this.width = width;
	}
	public AirPlane(String name, String model, Integer numberOfSeats, Boolean isFly) {
		super(name, model, numberOfSeats, isFly);
		// TODO Auto-generated constructor stub
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
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "AirPlane [id=" + id + ", isArmed=" + isArmed + ", isPassenger=" + isPassenger + 
				", length=" + length + ", width=" + width + ", getName()=" + getName() + 
				", getModel()=" + getModel() + ", getNumberOfSeats()=" + getNumberOfSeats() + "]";
	}
	
	
	
}
