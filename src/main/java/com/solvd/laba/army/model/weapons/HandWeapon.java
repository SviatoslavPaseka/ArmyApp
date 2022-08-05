package com.solvd.laba.army.model.weapons;

import java.time.LocalDate;

import com.solvd.laba.army.model.enums.TypeHandsWeapon;

/*add methods: needRepaired
 shoot
 */

public class HandWeapon extends Weapon{
	private Integer gunId;
	private TypeHandsWeapon typeHadsWeapon;
	private Boolean isClean;
	private Boolean isAutomatic;
	public HandWeapon() {
	}
	public HandWeapon(LocalDate yearManufactured, Integer amountOfAmmunition, 
			Integer weight, Integer gunId,
			TypeHandsWeapon typeHadsWeapon, Boolean haveAim, Boolean isAutomatic) {
		super(yearManufactured, amountOfAmmunition, weight);
		this.gunId = gunId;
		this.typeHadsWeapon = typeHadsWeapon;
		this.isClean = haveAim;
		this.isAutomatic = isAutomatic;
	}
	public Integer getGunId() {
		return gunId;
	}
	public void setGunId(Integer gunId) {
		this.gunId = gunId;
	}
	public TypeHandsWeapon getTypeHadsWeapon() {
		return typeHadsWeapon;
	}
	public void setTypeHadsWeapon(TypeHandsWeapon typeHadsWeapon) {
		this.typeHadsWeapon = typeHadsWeapon;
	}
	
	public Boolean getIsClean() {
		return isClean;
	}
	public void setIsClean(Boolean isClean) {
		this.isClean = isClean;
	}
	public Boolean getIsAutomatic() {
		return isAutomatic;
	}
	public void setIsAutomatic(Boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	@Override
	public String toString() {
		return "HandWeapon gunId=" + gunId + ", typeHadsWeapon=" + typeHadsWeapon + ", haveAim=" + isClean
				+ ", isAutomatic=" + isAutomatic + ", Year Manufactured=" + getYearManufactured()
				+ ", Number Of Bullets=" + getAmountOfAmmunition() + ", Weight=" + getWeight() + "kg";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((gunId == null) ? 0 : gunId.hashCode());
		result = prime * result + ((isClean == null) ? 0 : isClean.hashCode());
		result = prime * result + ((isAutomatic == null) ? 0 : isAutomatic.hashCode());
		result = prime * result + ((typeHadsWeapon == null) ? 0 : typeHadsWeapon.hashCode());
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
		HandWeapon other = (HandWeapon) obj;
		if (gunId == null) {
			if (other.gunId != null)
				return false;
		} else if (!gunId.equals(other.gunId))
			return false;
		if (isClean == null) {
			if (other.isClean != null)
				return false;
		} else if (!isClean.equals(other.isClean))
			return false;
		if (isAutomatic == null) {
			if (other.isAutomatic != null)
				return false;
		} else if (!isAutomatic.equals(other.isAutomatic))
			return false;
		if (typeHadsWeapon != other.typeHadsWeapon)
			return false;
		return true;
	}
}
