package com.solvd.laba.army.model.person;

import java.time.LocalDate;

import com.solvd.laba.army.model.ArmyBranch;
import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.weapons.HandWeapon;

public class Soldier extends Person {
	private MilitaryRank militaryRank;
	private ArmyBranch branch;
	private HandWeapon personalWeapon;
	
	public Soldier() {
	}

	public Soldier(Integer id, String firstname, String lastname, Gender gender, LocalDate dob, 
				   MilitaryRank militaryRank,	ArmyBranch branch, HandWeapon personalWeapon) {
		super(id, firstname, lastname, gender, dob);
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

	@Override
	public String toString() {
		return "Soldier:\n" + 
				"Firstname:" + getFirstname() + 
				", \nLastname:" + getLastname() + 
				", \ndate of birth:" + getDob()	+ 
				", \ngender:" + getGender().toString().toLowerCase() +
				", \nmilitary rank:" + militaryRank.toString().toLowerCase() + 
				", \nmilitary branch:" + branch + 
				", \npersonal weapon:" + personalWeapon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((militaryRank == null) ? 0 : militaryRank.hashCode());
		result = prime * result + ((personalWeapon == null) ? 0 : personalWeapon.hashCode());
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
		Soldier other = (Soldier) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (militaryRank != other.militaryRank)
			return false;
		if (personalWeapon == null) {
			if (other.personalWeapon != null)
				return false;
		} else if (!personalWeapon.equals(other.personalWeapon))
			return false;
		return true;
	}
	
	
}
