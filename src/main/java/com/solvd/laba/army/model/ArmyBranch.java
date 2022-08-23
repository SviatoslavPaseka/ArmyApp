package com.solvd.laba.army.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.solvd.laba.army.model.person.classes.MilitaryRecruiter;
import com.solvd.laba.army.model.person.classes.Registrator;
import com.solvd.laba.army.model.person.classes.Soldier;
import com.solvd.laba.army.model.transport.Transport;

public class ArmyBranch<T extends Transport> {
	private static final Logger LOGGER = Logger.getLogger(ArmyBranch.class);

	private Integer id;
	private String name;
	private List<T> transportInThisBranch;
	private List<Soldier> allSoldierFromThisArmyBranch;
	private Registrator registrator;
	private MilitaryRecruiter militaryRecruiter;

	public ArmyBranch() {
		this.allSoldierFromThisArmyBranch = new ArrayList<Soldier>();
		this.transportInThisBranch = new ArrayList<>();
	}
	
	public ArmyBranch(Integer id, String name, Registrator registrator, MilitaryRecruiter militaryRecruiter) {
		super();
		this.id = id;
		this.name = name;
		this.registrator = registrator;
		this.militaryRecruiter = militaryRecruiter;
		this.transportInThisBranch = new ArrayList<>();
		this.allSoldierFromThisArmyBranch = new ArrayList<>();
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

	public List<T> getTransportInThisBranch() {
		return transportInThisBranch;
	}

	public void setTransportInThisBranch(List<T> transportInThisBranch) {
		this.transportInThisBranch = new ArrayList<>(transportInThisBranch);
	}

	public List<Soldier> getAllSoldierFromThisArmyBranch() {
		return allSoldierFromThisArmyBranch;
	}

	public void setAllSoldierFromThisArmyBranch(List<Soldier> allSoldierFromThisArmyBranch) {
		this.allSoldierFromThisArmyBranch = new ArrayList<>(allSoldierFromThisArmyBranch);
	}
	
	public Registrator getRegistrator() {
		return registrator;
	}

	public void setRegistrator(Registrator registrator) {
		this.registrator = registrator;
	}

	public MilitaryRecruiter getMilitaryRecruiter() {
		return militaryRecruiter;
	}

	public void setMilitaryRecruiter(MilitaryRecruiter militaryRecruiter) {
		this.militaryRecruiter = militaryRecruiter;
	}

	@Override
	public String toString() {
		return "ArmyBranch [id=" + id + ", name=" + name + ", transportInThisBranch=" + transportInThisBranch + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((transportInThisBranch == null) ? 0 : transportInThisBranch.hashCode());
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
		if (transportInThisBranch == null) {
			if (other.transportInThisBranch != null)
				return false;
		} else if (!transportInThisBranch.equals(other.transportInThisBranch))
			return false;
		return true;
	}

	public List<Soldier> getAllUnnamedSoldier() {
		return allSoldierFromThisArmyBranch.stream()
				.filter(e -> StringUtils.equalsIgnoreCase(e.getName(), "unnamed"))
				.map(e -> new Soldier(e.getId(), 
						"Soldier without name", 
						e.getGender(), e.getDob(), 
						e.getHaveMedicalExamination(),
						e.getMilitaryRank(), 
						e.getSpecialization(),
						e.getPersonalWeapon()))
				.collect(Collectors.toList());
	}
	
	
	
}
