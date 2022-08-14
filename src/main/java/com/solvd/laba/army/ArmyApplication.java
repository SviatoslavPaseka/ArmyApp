package com.solvd.laba.army;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.person.classes.MilitaryRecruiter;
import com.solvd.laba.army.model.person.classes.NotMilitaryPerson;

public class ArmyApplication {
	private static final Logger LOGGER = Logger.getLogger(ArmyApplication.class);
	public static void main(String[] args) {
		MilitaryRecruiter militaryRecruiter = new MilitaryRecruiter(1, "Sam", Gender.MALE, LocalDate.of(2000, 1, 12), true, 1000, MilitaryRank.CAPTAIN);
		
		List<NotMilitaryPerson> notMilitaryPersons = 
					Arrays.asList(new NotMilitaryPerson(2, "Misha", Gender.MALE, LocalDate.of(2012, 1, 1), true),
							new NotMilitaryPerson(2, "Sasha", Gender.FEMALE, LocalDate.of(2000, 1, 1), false),
							new NotMilitaryPerson(2, "Dima", Gender.MALE, LocalDate.of(2000, 1, 1), true));
		
		LOGGER.info(militaryRecruiter.getFitPeople(notMilitaryPersons));
		
	}
}
