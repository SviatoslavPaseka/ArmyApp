package com.solvd.laba.army.model;

import java.time.LocalDate;

public class Soldier extends Person {
	private String military_rank;
	private String army_department;

	public Soldier(Integer id, String firstname, String lastname, String sex, LocalDate dob,
				   String military_rank,String army_department) {
		super(id, firstname, lastname, sex, dob);
		this.military_rank = military_rank;
		this.army_department = army_department;
	}

	/**
	 * @return the military_rank
	 */
	public String getMilitary_rank() {
		return military_rank;
	}

	/**
	 * @param military_rank the military_rank to set
	 */
	public void setMilitary_rank(String military_rank) {
		this.military_rank = military_rank;
	}

	/**
	 * @return the army_department
	 */
	public String getArmy_department() {
		return army_department;
	}

	/**
	 * @param army_department the army_department to set
	 */
	public void setArmy_department(String army_department) {
		this.army_department = army_department;
	}
	@Override
	public String toString() {
		return "Soldier with Firstname: " + getFirstname() + ", Lastname:" + getLastname() +
				" + military rank=" + military_rank + ", army department=" + army_department
				+ ", Id:"+ getId();
	}

}
