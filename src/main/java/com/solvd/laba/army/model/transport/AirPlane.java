package com.solvd.laba.army.model.transport;

public class AirPlane extends Transport{
	private Integer id;
	private Boolean isArmed;
	private Boolean isPassenger;
	
	public AirPlane() {
	}
	
	public AirPlane(String name, String model, Integer length, Integer width, 
					Integer numberOfSeats,	Boolean isUnderRepaired, Integer id, 
					Boolean isArmed, Boolean isPassenger) {
		
		super(name, model, length, width, numberOfSeats, isUnderRepaired);
		this.id = id;
		this.isArmed = isArmed;
		this.isPassenger = isPassenger;
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

	@Override
	public String toString() {
		return "AirPlane [id=" + id + ", isArmed=" + isArmed + ", isPassenger=" + isPassenger + ", getName()="
				+ getName() + ", getModel()=" + getModel() + ", getNumberOfSeats()=" + getNumberOfSeats()
				+ ", getLength()=" + getLength() + ", getWidth()=" + getWidth() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isArmed == null) ? 0 : isArmed.hashCode());
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
		if (isArmed == null) {
			if (other.isArmed != null)
				return false;
		} else if (!isArmed.equals(other.isArmed))
			return false;
		if (isPassenger == null) {
			if (other.isPassenger != null)
				return false;
		} else if (!isPassenger.equals(other.isPassenger))
			return false;
		return true;
	}

	
}
