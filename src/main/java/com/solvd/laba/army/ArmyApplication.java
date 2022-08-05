package com.solvd.laba.army;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import com.solvd.laba.army.exceptoins.IncorrectDOBException;
import com.solvd.laba.army.model.ArmyBranch;
import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.RecruiterRank;
import com.solvd.laba.army.model.enums.TypeHandsWeapon;
import com.solvd.laba.army.model.person.MilitaryRecruiter;
import com.solvd.laba.army.model.person.Soldier;
import com.solvd.laba.army.model.weapons.HandWeapon;

public class ArmyApplication {

	public static void main(String[] args) {
		
		List<HandWeapon> personalWeapons = new ArrayList<HandWeapon>();
		HandWeapon handWeapon1 = new HandWeapon(LocalDate.of(2000, Month.MARCH, 11), 15, 1, 1015, 
												TypeHandsWeapon.PISTOL, false, false);
		personalWeapons.add(handWeapon1);
		Soldier soldier = new Soldier(1, "Sam", "Sam", Gender.MALE, LocalDate.of(2000, 10, 1), MilitaryRank.COLONEL, new ArmyBranch(1, "Some","Some where" , 100, "asd"), personalWeapons, true);
		System.out.println(personalWeapons.get(0).getIsClean());
		soldier.cleanHandWeapon(1);
		System.out.println(personalWeapons.get(0).getIsClean());
	}

}
