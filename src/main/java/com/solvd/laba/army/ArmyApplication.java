package com.solvd.laba.army;

import java.io.File;

import org.apache.log4j.Logger;

import com.solvd.laba.army.model.ArmyBranch;
import com.solvd.laba.army.model.files.SoldiersFiles;
import com.solvd.laba.army.model.person.classes.MilitaryRecruiter;
import com.solvd.laba.army.model.person.classes.Registrator;
import com.solvd.laba.army.model.transport.Tank;

public class ArmyApplication {
	private static final Logger LOGGER = Logger.getLogger(ArmyApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Hello world!");
		ArmyBranch<Tank> armyBranch = new ArmyBranch<Tank>(1, "Name", new Registrator(), new MilitaryRecruiter());
		
		armyBranch.setAllSoldierFromThisArmyBranch(armyBranch.getMilitaryRecruiter().getListSoldiers(new File("./target/some.txt")));
		armyBranch.getAllSoldierFromThisArmyBranch().forEach(e -> LOGGER.info(e));
		SoldiersFiles.saveSoldiersToFile(new File("./target/newFile.txt"), armyBranch.getAllSoldierFromThisArmyBranch());
	}
}
