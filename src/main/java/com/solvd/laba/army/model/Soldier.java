package com.solvd.laba.army.model;

import java.time.LocalDate;

public class Soldier extends Person {
	private MilitaryRank militaryRank;
	private ArmyBranch branch;;
	
	public Soldier() {
	}

	public Soldier(Integer id, String firstname, String lastname, String sex, LocalDate dob, 
				   MilitaryRank militaryRank,	ArmyBranch branch) {
		super(id, firstname, lastname, sex, dob);
		this.militaryRank = militaryRank;
		this.branch = branch;
	}

	public MilitaryRank getMilitaryRank() {
		return militaryRank;
	}
	public void setMilitaryRank(MilitaryRank militaryRank) {
		this.militaryRank = militaryRank;
	}
	public ArmyBranch getBranch() {
		return branch;
	}
	public void setBranch(ArmyBranch branch) {
		this.branch = branch;
	}

	
	
}
