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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((HWId == null) ? 0 : HWId.hashCode());
		result = prime * result + ((needTransportToMove == null) ? 0 : needTransportToMove.hashCode());
		result = prime * result + ((peopleToManage == null) ? 0 : peopleToManage.hashCode());
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
		HeavyWeapon other = (HeavyWeapon) obj;
		if (HWId == null) {
			if (other.HWId != null)
				return false;
		} else if (!HWId.equals(other.HWId))
			return false;
		if (needTransportToMove == null) {
			if (other.needTransportToMove != null)
				return false;
		} else if (!needTransportToMove.equals(other.needTransportToMove))
			return false;
		if (peopleToManage == null) {
			if (other.peopleToManage != null)
				return false;
		} else if (!peopleToManage.equals(other.peopleToManage))
			return false;
		return true;
	}
	
	
	
}
