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

import com.solvd.laba.army.exceptoins.NotRegisterTransportException;
import com.solvd.laba.army.exceptoins.RepairSpecializationException;
import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.RecruiterRank;
import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.enums.TypeHandsWeapon;
import com.solvd.laba.army.model.enums.TypeTransportRegistration;
import com.solvd.laba.army.model.person.classes.MilitaryRecruiter;
import com.solvd.laba.army.model.person.classes.Soldier;
import com.solvd.laba.army.model.transport.Tank;
import com.solvd.laba.army.model.weapons.HandWeapon;

@TestInstance(Lifecycle.PER_CLASS) 
public class SoldierTest {
	private static final Logger LOGGER = Logger.getLogger(SoldierTest.class);
	
	@ParameterizedTest
	@MethodSource(value = "sourceListSoldier")
	void getAllHandWeaponByIdAndTypeTest(Soldier soldier) {
		soldier.getAllHandWeaponByIdAndType()
			.forEach((k, v) -> LOGGER.info("Key=" + k + ", value=" + v.getValue()));
	}
	@ParameterizedTest
	@MethodSource(value = "sourceSoldierTankList")
	void doRepairTransportTest(Tank tank, Soldier soldier) {
		LOGGER.info("before: " + tank.getIsUnderRepaired());
		try {
			soldier.doRepairTransport(tank);
		} catch (NotRegisterTransportException e) { 
			LOGGER.error(e);
		}catch(RepairSpecializationException e) {
			LOGGER.error(e);
		}
		LOGGER.info("after: " + tank.getIsUnderRepaired());
		Assertions.assertEquals(false, tank.getIsUnderRepaired());
	}
	@ParameterizedTest
	@MethodSource(value = "sourceListSoldier")
	void cleanHandWeaponTest(Soldier s) {
		Soldier localSoldier = new Soldier(s.getId(), s.getName(), s.getGender(), s.getDob(), s.getHaveMedicalExamination(), s.getMilitaryRank(), s.getSpecialization(), sourceListHandWeapon());
		LOGGER.info("before: " + localSoldier.getPersonalWeapon().get(0).getIsClean());
		localSoldier.cleanHandWeapon(0);
		LOGGER.info("after: " + localSoldier.getPersonalWeapon().get(0).getIsClean());
	}
	@ParameterizedTest
	@MethodSource(value = "sourceListSoldier")
	void comeToRecruiterFromSoldierTest(Soldier soldier) {
		MilitaryRecruiter militaryRecruiter = new MilitaryRecruiter();
		LOGGER.info("before: " + militaryRecruiter);
		militaryRecruiter = soldier
				.comeToRecruiterFromSoldier(1300, RecruiterRank.RANK1_EMPL);
		LOGGER.info("after: " + militaryRecruiter);
	}
	List<HandWeapon> sourceListHandWeapon (){
		return Arrays.asList(new HandWeapon(LocalDate.now(), 121, TypeHandsWeapon.PISTOL, false),
				new HandWeapon(LocalDate.now(), 122, TypeHandsWeapon.RIFLE, true));
	}
	List<Soldier> sourceListSoldier () {
		return Arrays.asList(new Soldier(1, "Sam", Gender.MALE, LocalDate.of(2000, 1, 1), 
				true, MilitaryRank.MECHANIC, SpecializationMilitary.TANK,sourceListHandWeapon()));
	}
	List<Tank> sourceTank() {
		return Arrays.asList(new Tank("someT", 5, 2, true, TypeTransportRegistration.NONE, false, 701));
	}
	List<Arguments> sourceSoldierTankList(){
		return Arrays.asList(Arguments.arguments(
				new Tank("someT", 5, 2, true, TypeTransportRegistration.MILITARY, false, 701),
				new Soldier(1, "Sam", Gender.MALE, LocalDate.of(2000, 1, 1), 
						true, MilitaryRank.MECHANIC, SpecializationMilitary.TANK,sourceListHandWeapon())));
	}
}
