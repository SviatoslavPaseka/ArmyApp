package com.solvd.laba.army.model.weapons;

import java.time.LocalDate;

public class WeaponToMassDestruction extends HeavyWeapon{
	private String locationOf;
	private Integer range;
	private Integer radiusOfEffect;
	public WeaponToMassDestruction(LocalDate yearManufactured, Integer amountOfAmmunition, 
			Integer weight, Integer hWId, Integer peopleToManage, Boolean needTransportToMove,
			String locationOf, Integer range, Integer radiusOfEffect) {
		super(yearManufactured, amountOfAmmunition, weight, hWId, peopleToManage, needTransportToMove);
		this.locationOf = locationOf;
		this.range = range;
		this.radiusOfEffect = radiusOfEffect;
	}
	public String getLocationOf() {
		return locationOf;
	}
	public void setLocationOf(String locationOf) {
		this.locationOf = locationOf;
	}
	public Integer getRange() {
		return range;
	}
	public void setRange(Integer range) {
		this.range = range;
	}
	public Integer getRadiusOfEffect() {
		return radiusOfEffect;
	}
	public void setRadiusOfEffect(Integer radiusOfEffect) {
		this.radiusOfEffect = radiusOfEffect;
	}
	@Override
	public String toString() {
		return "WeaponToMassDestruction [locationOf=" + locationOf + 
				", range=" + range + ", radiusOfEffect="+ radiusOfEffect + 
				", getYearManufactured()=" + getYearManufactured() + ", getWeight()=" + getWeight()	+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((locationOf == null) ? 0 : locationOf.hashCode());
		result = prime * result + ((radiusOfEffect == null) ? 0 : radiusOfEffect.hashCode());
		result = prime * result + ((range == null) ? 0 : range.hashCode());
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
		WeaponToMassDestruction other = (WeaponToMassDestruction) obj;
		if (locationOf == null) {
			if (other.locationOf != null)
				return false;
		} else if (!locationOf.equals(other.locationOf))
			return false;
		if (radiusOfEffect == null) {
			if (other.radiusOfEffect != null)
				return false;
		} else if (!radiusOfEffect.equals(other.radiusOfEffect))
			return false;
		if (range == null) {
			if (other.range != null)
				return false;
		} else if (!range.equals(other.range))
			return false;
		return true;
	}
	
	
}
