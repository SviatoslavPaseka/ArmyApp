package com.solvd.laba.army.model.transport;

import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.enums.TypeTransportRegistration;

public class Tank extends MilitaryTransport{
	private Integer id;

	public Tank(String name, Integer length, Integer width,
			Boolean isUnderRepaired, TypeTransportRegistration typeTransportRegistration, Boolean isArmed, Integer id) {
		super(name, length, width, isUnderRepaired, typeTransportRegistration, isArmed);
		this.id = id;
		super.setSpecializationMilitary(SpecializationMilitary.TANKS);
	}
	public Tank() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Tank [id=" + id +  ", getName()=" + getName() + ", getLength()=" + getLength()
				+ ", getWidth()=" + getWidth() + ", getIsUnderRepaired()=" + getIsUnderRepaired() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Tank other = (Tank) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
