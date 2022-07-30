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
	
}
