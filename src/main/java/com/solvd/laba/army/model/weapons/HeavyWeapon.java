package com.solvd.laba.army.model.weapons;

import java.time.LocalDate;

public class HeavyWeapon extends Weapon{
	private Integer HWId;
	private Integer peopleToManage;
	private Boolean needTransportToMove;
	public HeavyWeapon() {
	}
	public HeavyWeapon(LocalDate yearManufactured, Integer amountOfAmmunition, Integer weight, Integer hWId,
			Integer peopleToManage, Boolean needTransportToMove) {
		super(yearManufactured, amountOfAmmunition, weight);
		HWId = hWId;
		this.peopleToManage = peopleToManage;
		this.needTransportToMove = needTransportToMove;
	}
	public Integer getHWId() {
		return HWId;
	}
	public void setHWId(Integer hWId) {
		HWId = hWId;
	}
	public Integer getPeopleToManage() {
		return peopleToManage;
	}
	public void setPeopleToManage(Integer peopleToManage) {
		this.peopleToManage = peopleToManage;
	}
	public Boolean getNeedTransportToMove() {
		return needTransportToMove;
	}
	public void setNeedTransportToMove(Boolean needTransportToMove) {
		this.needTransportToMove = needTransportToMove;
	}
	@Override
	public String toString() {
		return "HeavyWeapon [HWId=" + HWId + ", peopleToManage=" + peopleToManage + ", needTransportToMove="
				+ needTransportToMove + ", YearManufactured=" + getYearManufactured() + ", NumberOfBullets="
				+ getAmountOfAmmunition() + ", Weight=" + getWeight() + "]";
	}
	
	
}
