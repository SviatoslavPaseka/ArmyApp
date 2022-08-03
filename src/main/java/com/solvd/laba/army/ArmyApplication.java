package com.solvd.laba.army;

import java.time.LocalDate;

import com.solvd.laba.army.model.ArmyBranch;
import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.TypeHandsWeapon;
import com.solvd.laba.army.model.person.Soldier;
import com.solvd.laba.army.model.weapons.HandWeapon;

public class ArmyApplication {

	public static void main(String[] args) {
		Soldier soldier1 = new Soldier(1, "Slava", "SLava", Gender.MALE, 
							LocalDate.of(2000, 11, 20), 
							MilitaryRank.SERGEANT, 
							new ArmyBranch(1, "Desant", "Odesa", 1000, "Flying"), 
							new HandWeapon(LocalDate.of(2012, 3, 10), 15, 1, 1015, TypeHandsWeapon.PISTOL, false, false));
		System.out.println(soldier1 + "\n\n");
		System.out.println(soldier1.getBranch()+ "\n\n");
		System.out.println(soldier1.getPersonalWeapon());
	}

}
