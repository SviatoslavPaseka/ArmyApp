package com.solvd.laba.army.model.weapons;

import java.time.LocalDate;

import com.solvd.laba.army.exceptoins.IncorrectYearException;


public abstract class Weapon {
	private LocalDate yearManufactured;
	
	public Weapon() {
	}
	public Weapon(LocalDate yearManufactured) {
		this.yearManufactured = yearManufactured;
	}
	public LocalDate getYearManufactured() {
		return yearManufactured;
	}
	public void setYearManufactured(LocalDate yearManufactured) throws IncorrectYearException {
		if (yearManufactured.getYear() > LocalDate.now().getYear()) {
			throw new IncorrectYearException("the entered year of Manufactured is greater than the current one");
		}
		this.yearManufactured = yearManufactured;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (yearManufactured == null) {
			if (other.yearManufactured != null)
				return false;
		} else if (!yearManufactured.equals(other.yearManufactured))
			return false;
		return true;
	}
}
