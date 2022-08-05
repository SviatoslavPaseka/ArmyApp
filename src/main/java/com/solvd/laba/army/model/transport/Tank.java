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
	@Override
	public String toString() {
		return "Tank [id=" + id + ", machineGun=" + machineGun + ", getName()=" + getName() + ", getModel()="
				+ getModel() + ", getNumberOfSeats()=" + getNumberOfSeats() + ", getLength()=" + getLength()
				+ ", getWidth()=" + getWidth() + ", getIsUnderRepaired()=" + getIsUnderRepaired() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((machineGun == null) ? 0 : machineGun.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tank other = (Tank) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (machineGun == null) {
			if (other.machineGun != null)
				return false;
		} else if (!machineGun.equals(other.machineGun))
			return false;
		return true;
	}

}
