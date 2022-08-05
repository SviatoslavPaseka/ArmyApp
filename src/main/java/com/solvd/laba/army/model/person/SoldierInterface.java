package com.solvd.laba.army.model.person;

import com.solvd.laba.army.model.enums.RecruiterRank;

public interface SoldierInterface {
	void cleanHandWeapon(Integer numberPersonalWeapon);
	MilitaryRecruiter comeToRecruiterFromSoldier(Soldier soldier, Integer salary, RecruiterRank recruiterRank);
	
}
