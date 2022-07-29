package com.solvd.laba.army;

import java.time.LocalDate;

import com.solvd.laba.army.model.Sex;
import com.solvd.laba.army.model.Soldier;
import com.solvd.laba.army.model.Tank;

public class ArmyApplication {

	public static void main(String[] args) {
		Soldier soldier1 = new Soldier(1, "Sasha", "Petrov", Sex.MALE.toString().toLowerCase(),
									  LocalDate.of(2000, 10, 15), "Sergant", "Tanks");
		Tank tank1 = new Tank("tank1", "t-10034", 6, true, false, 1, false, 6, 3);
		
		System.out.println(soldier1+"\n"+tank1);
	}

}
