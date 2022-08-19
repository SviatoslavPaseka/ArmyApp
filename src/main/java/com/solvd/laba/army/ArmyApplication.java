package com.solvd.laba.army;

import java.io.File;

import org.apache.log4j.Logger;

import com.solvd.laba.army.model.ArmyBranch;
import com.solvd.laba.army.model.transport.Tank;

public class ArmyApplication {
	private static final Logger LOGGER = Logger.getLogger(ArmyApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Hello world!");
//		try {
//			FileUtils.writeLines(file, Arrays.asList(soldier));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		ArmyBranch<Tank> armyBranch = new ArmyBranch<Tank>();
		
		armyBranch.readSoldiersFromFile(new File("./target/some.txt"));
		armyBranch.getAllSoldierFromThisArmyBranch().forEach(e -> LOGGER.info(e));
		armyBranch.saveSoldiersToFile(new File("./target/newFile.txt"));
	}
}
