package com.solvd.laba.army.model.transport;

public abstract class MilitaryTransport extends Transport {
	private Boolean isArmed;

	public MilitaryTransport(String name, String model, Integer length, Integer width, Integer numberOfSeats,
			Boolean isUnderRepaired, Boolean isArmed) {
		super(name, model, length, width, numberOfSeats, isUnderRepaired);
		this.isArmed = isArmed;
	}

	public MilitaryTransport() {
	}

	public Boolean getIsArmed() {
		return isArmed;
	}

	public void setIsArmed(Boolean isArmed) {
		this.isArmed = isArmed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((isArmed == null) ? 0 : isArmed.hashCode());
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
		MilitaryTransport other = (MilitaryTransport) obj;
		if (isArmed == null) {
			if (other.isArmed != null)
				return false;
		} else if (!isArmed.equals(other.isArmed))
			return false;
		return true;
	}
	
	
}
