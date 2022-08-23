package com.solvd.laba.army.model.person.interfaces;

import java.util.List;

import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.person.Person;
import com.solvd.laba.army.model.person.classes.NotMilitaryPerson;
import com.solvd.laba.army.model.person.classes.Soldier;

public interface IMilitaryRecruiter {
	void medicalExamination(Person person);
	Soldier summonSoldier(NotMilitaryPerson person, SpecializationMilitary specializationMilitary);
	List<NotMilitaryPerson> getFitPeople(List<NotMilitaryPerson> allPeople);
	
}
