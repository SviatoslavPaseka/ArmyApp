package com.solvd.laba.army.model.transport;

public class Tank extends MilitaryTransport{
	private Integer id;
	private Boolean machineGun;//пулемет
	
	
	public Tank(String name, String model, Integer length, Integer width, Integer numberOfSeats,
			Boolean isUnderRepaired, Boolean isArmed, Integer id, Boolean machineGun) {
		super(name, model, length, width, numberOfSeats, isUnderRepaired, isArmed);
		this.id = id;
		this.machineGun = machineGun;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getMachineGun() {
		return machineGun;
	}
	public void setMachineGun(Boolean machineGun) {
		this.machineGun = machineGun;
	}
	
	
}
