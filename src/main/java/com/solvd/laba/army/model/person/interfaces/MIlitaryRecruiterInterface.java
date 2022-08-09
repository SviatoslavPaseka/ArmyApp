package com.solvd.laba.army.model.person.interfaces;

import com.solvd.laba.army.model.enums.RecruiterRank;
import com.solvd.laba.army.model.person.Person;

public interface MIlitaryRecruiterInterface {
	void medicalExamination(Person person, RecruiterRank recruiterRank);
}
