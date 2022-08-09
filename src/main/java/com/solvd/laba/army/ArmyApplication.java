package com.solvd.laba.army;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.solvd.laba.army.model.ArmyBranch;
import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.enums.TypeHandsWeapon;
import com.solvd.laba.army.model.enums.TypeTransportRegistration;
import com.solvd.laba.army.model.person.classes.Soldier;
import com.solvd.laba.army.model.transport.Tank;
import com.solvd.laba.army.model.weapons.HandWeapon;

public class ArmyApplication {
	public static void main(String[] args) {
		List<HandWeapon> personalWeapons = new ArrayList<HandWeapon>();
		HandWeapon handWeapon1 = new HandWeapon(LocalDate.of(2000, Month.MARCH, 11), 1015, 
												TypeHandsWeapon.PISTOL, false);
		personalWeapons.add(handWeapon1);
		List<SpecializationMilitary> specializationMilitaries = 
				Arrays.asList(SpecializationMilitary.FLYING, SpecializationMilitary.TANKS);
		ArmyBranch armyBranch1 = new ArmyBranch(1, "Name1", "Ukraine", 20, specializationMilitaries);
		
		Soldier soldier1 = new Soldier(1, "Sam", "Sam", Gender.MALE, 
				LocalDate.of(2000, 10, 10), MilitaryRank.MECHANIC, armyBranch1, personalWeapons, true);
		
		Tank tank1 = new Tank("T", "-72", 10, 3, true, TypeTransportRegistration.MILITARY, true, 1);
		
		System.out.println(tank1.getIsUnderRepaired());
		soldier1.doRepairTransport(tank1);
		System.out.println(tank1.getIsUnderRepaired());
	}

}
