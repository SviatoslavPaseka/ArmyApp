package com.solvd.laba.army.model.transport;

public abstract class Transport {
	private String name;
	private String model;
	private Integer length;
	private Integer width;
	private Integer numberOfSeats;
	private Boolean isUnderRepaired;
	
	public Transport() {}
	
	public Transport(String name, String model, Integer length, Integer width, 
					Integer numberOfSeats, Boolean isUnderRepaired) {
		this.name = name;
		this.model = model;
		this.length = length;
		this.width = width;
		this.numberOfSeats = numberOfSeats;
		this.isUnderRepaired = isUnderRepaired;
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

	public Boolean getIsUnderRepaired() {
		return isUnderRepaired;
	}

	public void setIsUnderRepaired(Boolean isUnderRepaired) {
		this.isUnderRepaired = isUnderRepaired;
	}

}
