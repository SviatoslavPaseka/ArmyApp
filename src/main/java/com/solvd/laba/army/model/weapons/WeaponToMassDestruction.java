package com.solvd.laba.army.model.weapons;

import java.time.LocalDate;

import com.solvd.laba.army.exceptoins.NegativeNumberException;

public class WeaponToMassDestruction extends Weapon{
	private Integer id;
	private Integer radiusOfEffect;
	
	public WeaponToMassDestruction() {
	}
	public WeaponToMassDestruction(LocalDate yearManufactured, Integer id, Integer radiusOfEffect) {
		super(yearManufactured);
		this.id = id;
		this.radiusOfEffect = radiusOfEffect;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRadiusOfEffect() {
		return radiusOfEffect;
	}
	public void setRadiusOfEffect(Integer radiusOfEffect) {
		if (radiusOfEffect < 0) {
			throw new NegativeNumberException("Radius cannot be less than 0");
		}else this.radiusOfEffect = radiusOfEffect;
	}
	@Override
	public String toString() {
		return "WeaponToMassDestruction radiusOfEffect="+ radiusOfEffect + 
				", getYearManufactured()=" + getYearManufactured();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((radiusOfEffect == null) ? 0 : radiusOfEffect.hashCode());
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
		if (radiusOfEffect == null) {
			if (other.radiusOfEffect != null)
				return false;
		} else if (!radiusOfEffect.equals(other.radiusOfEffect))
			return false;
		return true;
	}
}
