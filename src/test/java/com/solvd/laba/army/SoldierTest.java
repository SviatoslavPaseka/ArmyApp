package com.solvd.laba.army;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.enums.TypeHandsWeapon;
import com.solvd.laba.army.model.enums.TypeTransportRegistration;
import com.solvd.laba.army.model.person.classes.Soldier;
import com.solvd.laba.army.model.transport.Tank;
import com.solvd.laba.army.model.weapons.HandWeapon;

public class SoldierTest {
	private List<HandWeapon> personalWeapons = Arrays.asList(new HandWeapon(LocalDate.now(), 121, TypeHandsWeapon.PISTOL, false),
			new HandWeapon(LocalDate.now(), 122, TypeHandsWeapon.RIFLE, true));
	private Soldier soldier = new Soldier(1, "Sam", Gender.MALE, LocalDate.of(2000, 1, 1), 
			true, MilitaryRank.CAPTAIN, SpecializationMilitary.TANKS,personalWeapons );
	private Tank tank = new Tank("someT", 5, 2, true, TypeTransportRegistration.MILITARY, false, 701);
	
	@Test
	public void doRepairTransportTest() {
		soldier.doRepairTransport(tank);
		
	}
	
}
