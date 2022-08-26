package com.solvd.laba.army.threadClasses;

import org.apache.log4j.Logger;

import com.solvd.laba.army.model.weapons.HandWeapon;

public class DeadLockExample implements Runnable {
	private static final Logger LOGGER = Logger.getLogger(DeadLockExample.class);
	
    private final HandWeapon pistol = new HandWeapon();
    private final HandWeapon riffle = new HandWeapon();
    
    public void doCleanThanShoot() {
    	synchronized (pistol) {
			LOGGER.info(Thread.currentThread().getName() + " clean gun");
			
			synchronized (riffle) {
				LOGGER.info(Thread.currentThread().getName() + " shoot");
				LOGGER.info(Thread.currentThread().getName() + " end");
			}
		}
    }
    
    public void doShootThanClean() {
    	synchronized (riffle) {
			LOGGER.info(Thread.currentThread().getName() + " shoot");
			
			synchronized (pistol) {
				LOGGER.info(Thread.currentThread().getName() + " clean gun");
				LOGGER.info(Thread.currentThread().getName() + " end");
			}
		}
    }
    
	@Override
	public void run() {
		doCleanThanShoot();
		doShootThanClean();
	}
}
