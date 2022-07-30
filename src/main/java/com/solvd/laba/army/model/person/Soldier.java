package com.solvd.laba.army.model.person;

import java.time.LocalDate;

import com.solvd.laba.army.model.ArmyBranch;
import com.solvd.laba.army.model.weapons.HandWeapon;

public class Soldier extends Person {
	private MilitaryRank militaryRank;
	private ArmyBranch branch;;
	private HandWeapon personalWeapon;
	
	public Soldier() {
	}

	public Soldier(Integer id, String firstname, String lastname, String sex, LocalDate dob, 
				   MilitaryRank militaryRank,	ArmyBranch branch, HandWeapon personalWeapon) {
		super(id, firstname, lastname, sex, dob);
		this.militaryRank = militaryRank;
		this.branch = branch;
		this.personalWeapon = personalWeapon;
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

	public HandWeapon getPersonalWeapon() {
		return personalWeapon;
	}
	public void setPersonalWeapon(HandWeapon personalWeapon) {
		this.personalWeapon = personalWeapon;
	}

	
	
}
