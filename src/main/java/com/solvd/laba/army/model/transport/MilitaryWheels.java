package com.solvd.laba.army.model.transport;

import com.solvd.laba.army.exceptoins.NegativeNumberException;
import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.enums.TypeTransportRegistration;

public class MilitaryWheels extends MilitaryTransport{
	private Integer id;
	private Integer numberOfWheel;

	public MilitaryWheels() {
	}

	public MilitaryWheels(String name, Integer length, Integer width, Boolean isUnderRepaired,
			TypeTransportRegistration typeTransportRegistration, Boolean isArmed, Integer id, Integer numberOfWheel) {
		super(name, length, width, isUnderRepaired, typeTransportRegistration, isArmed);
		this.id = id;
		this.numberOfWheel = numberOfWheel;
		super.setSpecializationMilitary(SpecializationMilitary.JEEPS);
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
		if (numberOfWheel < 2) {
			throw new NegativeNumberException("Numberof wheel cannot be less than 2");
		}else this.numberOfWheel = numberOfWheel;
	}

	@Override
	public String toString() {
		return "MilitaryJeep [id=" + id + ", numberOfWheel=" + numberOfWheel + 
				", getName()=" + getName()
				+ ", getLength()=" + getLength() + ", getWidth()=" + getWidth() + "]";
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
		MilitaryWheels other = (MilitaryWheels) obj;
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
