package com.solvd.laba.army.threadClasses;

public class DeadLockStarting {
	public static void doDeadLock() {
		DeadLockExample tir = new DeadLockExample();

		Thread misha = new Thread(tir, "Misha");
		Thread sasha = new Thread(tir, "Sasha");

		misha.start();
		sasha.start();
	}
}
