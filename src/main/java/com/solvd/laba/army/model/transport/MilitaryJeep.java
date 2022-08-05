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

	@Override
	public String toString() {
		return "MilitaryJeep [id=" + id + ", numberOfWheel=" + numberOfWheel + ", getName()=" + getName()
				+ ", getModel()=" + getModel() + ", getNumberOfSeats()=" + getNumberOfSeats() + ", getLength()="
				+ getLength() + ", getWidth()=" + getWidth() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numberOfWheel == null) ? 0 : numberOfWheel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MilitaryJeep other = (MilitaryJeep) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numberOfWheel == null) {
			if (other.numberOfWheel != null)
				return false;
		} else if (!numberOfWheel.equals(other.numberOfWheel))
			return false;
		return true;
	}
	
}
