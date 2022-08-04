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
}
