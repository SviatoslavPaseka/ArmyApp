package com.solvd.laba.army;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.RecruiterRank;
import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.enums.TypeHandsWeapon;
import com.solvd.laba.army.model.person.Person;
import com.solvd.laba.army.model.person.classes.MilitaryRecruiter;
import com.solvd.laba.army.model.person.classes.NotMilitaryPerson;
import com.solvd.laba.army.model.person.classes.Soldier;
import com.solvd.laba.army.model.weapons.HandWeapon;

@TestInstance(Lifecycle.PER_CLASS)
public class MilitaryRecruiterTest {
	private static final Logger LOGGER = Logger.getLogger(MilitaryRecruiterTest.class);
	@ParameterizedTest
	@MethodSource(value  = "sourceToSummonSoldierTest")
	void summonSoldierTest(NotMilitaryPerson person, SpecializationMilitary specialization) {
		MilitaryRecruiter militaryRecruiter = new MilitaryRecruiter();
		LOGGER.info("Not summoned: " + person);
		Soldier soldier = militaryRecruiter.summonSoldier(person, specialization);
		LOGGER.info("Summoned: " + soldier);
		
	}
	
	@ParameterizedTest
	@MethodSource(value = "sourceListListNotMilitaryPerson")
	void getFitPeopleTest(List<NotMilitaryPerson> allPeople) {
		MilitaryRecruiter militaryRecruiter = new MilitaryRecruiter();
		List<NotMilitaryPerson> expectedList = Arrays.asList(new NotMilitaryPerson(1, "Sam", Gender.FEMALE, LocalDate.of(2000, 1, 2), true));
		List<NotMilitaryPerson> result = militaryRecruiter.getFitPeople(allPeople);
		if (!expectedList.equals(result)) {
			LOGGER.error("Result list not equals expected list");
		}
		Assertions.assertEquals(expectedList, result);
	}
	@ParameterizedTest
	@MethodSource(value = "sourceMedicalExaminationTest")
	void medicalExaminationTest(Person person, MilitaryRecruiter militaryRecruiter) {
		LOGGER.info("Start to do medical examination");
		militaryRecruiter.medicalExamination(person);
		Assertions.assertEquals(true, person.getHaveMedicalExamination());
	}
	List<HandWeapon> sourceListHandWeapon (){
		return Arrays.asList(new HandWeapon(LocalDate.now(), 121, TypeHandsWeapon.PISTOL, false),
				new HandWeapon(LocalDate.now(), 122, TypeHandsWeapon.RIFLE, true));
	}
	
	List<List<NotMilitaryPerson>> sourceListListNotMilitaryPerson(){
		List<NotMilitaryPerson> list1 = Arrays
				.asList(new NotMilitaryPerson(1, "Sam", Gender.FEMALE, LocalDate.of(2000, 1, 2), true),
						new NotMilitaryPerson(1, "Ham", Gender.MALE, LocalDate.of(2012, 1, 2), true),
						new NotMilitaryPerson(1, "Jam", Gender.MALE, LocalDate.of(2000, 1, 2), false));
		return Arrays.asList(list1);
	}
	List<Arguments> sourceToSummonSoldierTest() {
		return Arrays.asList(Arguments.arguments(
				new NotMilitaryPerson(1, "Jam", Gender.MALE, LocalDate.of(2000, 1, 2), true), SpecializationMilitary.FLYING), 
				Arguments.arguments(new NotMilitaryPerson(1, "Sam", Gender.FEMALE, LocalDate.of(2009, 1, 2), true), SpecializationMilitary.TANK));
	}
	
	List<Arguments> sourceMedicalExaminationTest() {
		return Arrays.asList(Arguments.arguments(
				new NotMilitaryPerson(1, "Jam", Gender.MALE, LocalDate.of(2000, 1, 2), false), new MilitaryRecruiter(null, null, null, null, null, null, RecruiterRank.MILITARY_DOCTOR)), 
				Arguments.arguments(new Soldier(1, "Sam", Gender.MALE, LocalDate.of(2000, 1, 1), 
						false, MilitaryRank.MECHANIC, SpecializationMilitary.TANK,sourceListHandWeapon()), new MilitaryRecruiter(null, null, null, null, null, null, RecruiterRank.OFFICE_MANAGER)));
	}
}
