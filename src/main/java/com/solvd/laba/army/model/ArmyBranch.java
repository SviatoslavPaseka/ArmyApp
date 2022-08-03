package com.solvd.laba.army.model;

public class ArmyBranch {
	private Integer id;
	private String name;
	private String location;
	private Integer countOfPeople;
	private String mainSpecialization;//change to list
	
	public ArmyBranch() {
	}
	public ArmyBranch(Integer id, String name, String location, Integer countOfPeople, String mainSpecialization) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.countOfPeople = countOfPeople;
		this.mainSpecialization = mainSpecialization;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getCountOfPeople() {
		return countOfPeople;
	}
	public void setCountOfPeople(Integer countOfPeople) {
		this.countOfPeople = countOfPeople;
	}
	public String getMainSpecialization() {
		return mainSpecialization;
	}
	public void setMainSpecialization(String mainSpecialization) {
		this.mainSpecialization = mainSpecialization;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countOfPeople == null) ? 0 : countOfPeople.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((mainSpecialization == null) ? 0 : mainSpecialization.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArmyBranch other = (ArmyBranch) obj;
		if (countOfPeople == null) {
			if (other.countOfPeople != null)
				return false;
		} else if (!countOfPeople.equals(other.countOfPeople))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (mainSpecialization == null) {
			if (other.mainSpecialization != null)
				return false;
		} else if (!mainSpecialization.equals(other.mainSpecialization))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Army branch id=" + id + ", name=" + name + 
				", location=" + location + ", countOfPeople=" + countOfPeople
				+ ", mainSpecialization=" + mainSpecialization;
	}
}
