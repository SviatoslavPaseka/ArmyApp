package com.solvd.laba.army.model.person.interfaces;

import java.util.List;

import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.RecruiterRank;
import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.person.Person;
import com.solvd.laba.army.model.person.classes.NotMilitaryPerson;
import com.solvd.laba.army.model.person.classes.Soldier;
import com.solvd.laba.army.model.weapons.HandWeapon;

public interface MIlitaryRecruiterService {//IMilitaryRecrutire
	void medicalExamination(Person person, RecruiterRank recruiterRank);
	Soldier summonSoldier(Person person, MilitaryRank militaryRank, SpecializationMilitary specializationMilitary, List<HandWeapon> personalWeapons);
	List<NotMilitaryPerson> getFitPeople(List<NotMilitaryPerson> allPeople);
}
