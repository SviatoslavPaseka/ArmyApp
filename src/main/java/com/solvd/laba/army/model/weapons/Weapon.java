package com.solvd.laba.army.model.weapons;

import java.time.LocalDate;

public abstract class Weapon {
	private LocalDate yearManufactured;
	private Integer amountOfAmmunition;
	private Integer weight;
	
	public Weapon() {
	}
	public Weapon(LocalDate yearManufactured, Integer numberOfBullets, Integer weight) {
		this.yearManufactured = yearManufactured;
		this.amountOfAmmunition = numberOfBullets;
		this.weight = weight;
	}
	public LocalDate getYearManufactured() {
		return yearManufactured;
	}
	public void setYearManufactured(LocalDate yearManufactured) {
		this.yearManufactured = yearManufactured;
	}
	public Integer getAmountOfAmmunition() {
		return amountOfAmmunition;
	}
	public void setAmountOfAmmunition(Integer numberOfBullets) {
		this.amountOfAmmunition = numberOfBullets;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amountOfAmmunition == null) ? 0 : amountOfAmmunition.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		result = prime * result + ((yearManufactured == null) ? 0 : yearManufactured.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weapon other = (Weapon) obj;
		if (amountOfAmmunition == null) {
			if (other.amountOfAmmunition != null)
				return false;
		} else if (!amountOfAmmunition.equals(other.amountOfAmmunition))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		if (yearManufactured == null) {
			if (other.yearManufactured != null)
				return false;
		} else if (!yearManufactured.equals(other.yearManufactured))
			return false;
		return true;
	}
	
}
