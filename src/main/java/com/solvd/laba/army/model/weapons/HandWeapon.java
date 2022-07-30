package com.solvd.laba.army.model.weapons;

import java.time.LocalDate;

public class HandWeapon extends Weapon{
	private Integer gunId;
	private TypeHandsWeapon typeHadsWeapon;
	private Boolean haveAim;
	private Boolean isAutomatic;
	public HandWeapon() {
	}
	public HandWeapon(LocalDate yearManufactured, Integer amountOfAmmunition, 
			Integer weight, Integer gunId,
			TypeHandsWeapon typeHadsWeapon, Boolean haveAim, Boolean isAutomatic) {
		super(yearManufactured, amountOfAmmunition, weight);
		this.gunId = gunId;
		this.typeHadsWeapon = typeHadsWeapon;
		this.haveAim = haveAim;
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
	public Boolean getHaveAim() {
		return haveAim;
	}
	public void setHaveAim(Boolean haveAim) {
		this.haveAim = haveAim;
	}
	public Boolean getIsAutomatic() {
		return isAutomatic;
	}
	public void setIsAutomatic(Boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	@Override
	public String toString() {
		return "HandWeapon [gunId=" + gunId + ", typeHadsWeapon=" + typeHadsWeapon + ", haveAim=" + haveAim
				+ ", isAutomatic=" + isAutomatic + ", Year Manufactured=" + getYearManufactured()
				+ ", Number Of Bullets=" + getAmountOfAmmunition() + ", Weight=" + getWeight() + "]";
	}
	
	
}
