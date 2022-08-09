package com.solvd.laba.army.model;

import java.util.List;

import com.solvd.laba.army.model.enums.SpecializationMilitary;

public class ArmyBranch {
	private Integer id;
	private String name;
	private Integer countOfPeople;
	private List<SpecializationMilitary> specialization;//change to list
	
	public ArmyBranch() {
	}
	public ArmyBranch(Integer id, String name, String location, Integer countOfPeople, List<SpecializationMilitary> mainSpecialization) {
		this.id = id;
		this.name = name;
		this.countOfPeople = countOfPeople;
		this.specialization = mainSpecialization;
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
	public Integer getCountOfPeople() {
		return countOfPeople;
	}
	public void setCountOfPeople(Integer countOfPeople) {
		this.countOfPeople = countOfPeople;
	}
	
	public List<SpecializationMilitary> getSpecialization() {
		return specialization;
	}
	public void setSpecialization(List<SpecializationMilitary> specialization) {
		this.specialization = specialization;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countOfPeople == null) ? 0 : countOfPeople.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
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
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
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
				", countOfPeople=" + countOfPeople
				+ ", mainSpecialization=" + specialization;
	}
}
