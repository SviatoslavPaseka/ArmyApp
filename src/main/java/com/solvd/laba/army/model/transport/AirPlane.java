package com.solvd.laba.army.model.transport;

import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.enums.TypeTransportRegistration;

public class AirPlane extends Transport{
	private Integer id;
	private Boolean isPassenger;
	
	public AirPlane() {
	}
	public AirPlane(String name, Integer length, Integer width, Boolean isUnderRepaired,
			TypeTransportRegistration transportRegistration, Integer id, Boolean isPassenger) {
		super(name, length, width, isUnderRepaired, transportRegistration);
		this.id = id;
		this.isPassenger = isPassenger;
		super.setSpecializationMilitary(SpecializationMilitary.FLYING);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getIsPassenger() {
		return isPassenger;
	}
	public void setIsPassenger(Boolean isPassenger) {
		this.isPassenger = isPassenger;
	}
	
	@Override
	public String toString() {
		return "AirPlane [id=" + id + ", isPassenger=" + isPassenger 
				+ ", getName()="+ getName() + 
				", getLength()=" + getLength() + ", getWidth()=" + getWidth() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isPassenger == null) ? 0 : isPassenger.hashCode());
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
		AirPlane other = (AirPlane) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isPassenger == null) {
			if (other.isPassenger != null)
				return false;
		} else if (!isPassenger.equals(other.isPassenger))
			return false;
		return true;
	}
}
