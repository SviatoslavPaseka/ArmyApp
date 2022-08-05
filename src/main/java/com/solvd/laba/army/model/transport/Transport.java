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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isUnderRepaired == null) ? 0 : isUnderRepaired.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numberOfSeats == null) ? 0 : numberOfSeats.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transport other = (Transport) obj;
		if (isUnderRepaired == null) {
			if (other.isUnderRepaired != null)
				return false;
		} else if (!isUnderRepaired.equals(other.isUnderRepaired))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfSeats == null) {
			if (other.numberOfSeats != null)
				return false;
		} else if (!numberOfSeats.equals(other.numberOfSeats))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}

	
	
}
