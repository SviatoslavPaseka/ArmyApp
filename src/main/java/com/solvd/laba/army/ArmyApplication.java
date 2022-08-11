package com.solvd.laba.army;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.solvd.laba.army.exceptoins.NotRegisterTransportException;
import com.solvd.laba.army.exceptoins.RepairSpecializationException;
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
	private static final Logger log = Logger.getLogger(ArmyApplication.class);
	public static void main(String[] args) {
		List<HandWeapon> personalWeapons = new ArrayList<HandWeapon>();
		for (int i = 0; i < 1; i++) {
			personalWeapons.add(new HandWeapon(LocalDate.of(1990 + i, 1, 10),
								1000 + i, TypeHandsWeapon.PISTOL, false));
		}
		
		List<SpecializationMilitary> specializationMilitaries = 
				Arrays.asList(SpecializationMilitary.FLYING);
		
				
		Soldier soldier1 = new Soldier(1, "Sam", Gender.MALE, 
										LocalDate.of(2000, 10, 10), true, MilitaryRank.MECHANIC, 
										SpecializationMilitary.FLYING, personalWeapons);
		ArmyBranch<Soldier> armyBranch1 = new ArmyBranch<Soldier>(1, "Kiev", Arrays.asList(soldier1), specializationMilitaries);//

		Tank tank1 = new Tank("T-72", 10, 3, true, TypeTransportRegistration.NONE, true, 1);
		
		try {
			soldier1.doRepairTransport(tank1);
		} catch (RepairSpecializationException e) {
			log.error(e);
		} catch(NotRegisterTransportException ex) {
			log.info(ex);
		}
		for (Map.Entry<Integer, TypeHandsWeapon> item : soldier1.getAllHandWeaponByIdAndType().entrySet()) {
			System.out.println("Id: " + item.getKey() + ", type: " + item.getValue().getValue());
		}
		System.out.println(armyBranch1.getSomethgThere());
	}

}
