package com.solvd.laba.army.model;

public class Tank extends MilitaryTransport{
	private Integer id;
	private Boolean isUnderRepair;
	private Integer length;
	private Integer width;
	public Tank(String name, String model, Integer numberOfSeats, Boolean isArmed, Boolean isFly, Integer id,
			Boolean isUnderRepair, Integer length, Integer width) {
		super(name, model, numberOfSeats, isArmed, isFly);
		this.id = id;
		this.isUnderRepair = isUnderRepair;
		this.length = length;
		this.width = width;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getIsUnderRepair() {
		return isUnderRepair;
	}
	public void setIsUnderRepair(Boolean isUnderRepair) {
		this.isUnderRepair = isUnderRepair;
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
		return "Tank [id=" + id + ", isUnderRepair=" + isUnderRepair + 
				", length=" + length + ", width=" + width + 
				", getIsArmed()=" + getIsArmed() + ", getName()=" + getName() + 
				", getModel()=" + getModel() + "]";
	}
	
	
	
}
