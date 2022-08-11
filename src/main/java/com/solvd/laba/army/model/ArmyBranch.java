package com.solvd.laba.army.model;

import java.util.List;

import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.person.Person;

public class ArmyBranch<T> {
	private Integer id;
	private String name;
	private List<T> somethgThere;
	private List<SpecializationMilitary> specialization;
	
	public ArmyBranch() {
	}
	public ArmyBranch(Integer id, String name, List<T> somethgThere, List<SpecializationMilitary> specialization) {
		super();
		this.id = id;
		this.name = name;
		this.somethgThere = somethgThere;
		this.specialization = specialization;
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
	public List<SpecializationMilitary> getSpecialization() {
		return specialization;
	}
	public void setSpecialization(List<SpecializationMilitary> specialization) {
		this.specialization = specialization;
	}
	public List<T> getSomethgThere() {
		return somethgThere;
	}
	public void setSomethgThere(List<T> somethgThere) {
		this.somethgThere = somethgThere;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((somethgThere == null) ? 0 : somethgThere.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
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
		ArmyBranch<T> other = (ArmyBranch<T>) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (somethgThere == null) {
			if (other.somethgThere != null)
				return false;
		} else if (!somethgThere.equals(other.somethgThere))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Army branch id=" + id + ", name=" + name + 
				", people there=" + somethgThere	+ ", mainSpecialization=" + specialization;
	}
	
	public T findPersonById(Integer id) {
		return somethgThere.stream()
						.filter(e -> ((Person) e).getId().equals(id))
						.findAny().orElse(null);
	}
}
