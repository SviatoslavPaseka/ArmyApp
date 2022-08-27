package com.solvd.laba.army;

import org.apache.log4j.Logger;

import com.solvd.laba.army.threadClasses.DeadLockStarting;

public class ArmyApplication {
	private static final Logger LOGGER = Logger.getLogger(ArmyApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Hello world!\n");
		
		DeadLockStarting.doDeadLock();
		
		
		
		
		
//		HandWeapon hw = new HandWeapon();
//		System.out.println(hw);
	}
}
