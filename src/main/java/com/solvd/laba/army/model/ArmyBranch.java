package com.solvd.laba.army.model;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.person.classes.Soldier;
import com.solvd.laba.army.model.transport.Transport;

public class ArmyBranch<T extends Transport> {
	private static final Logger LOGGER = Logger.getLogger(ArmyBranch.class);

	private Integer id;
	private String name;
	private List<T> transportInThisBranch;
	private List<Soldier> allSoldierFromThisArmyBranch;

	public ArmyBranch() {
		this.allSoldierFromThisArmyBranch = new ArrayList<Soldier>();
		this.transportInThisBranch = new ArrayList<T>();
	}

	public ArmyBranch(Integer id, String name, List<T> transportInThisBranch,
			List<Soldier> allSoldierFromThisArmyBranch) {
		super();
		this.id = id;
		this.name = StringUtils.deleteWhitespace(StringUtils.defaultString(name, "Unnamed"));
		this.transportInThisBranch = new ArrayList<>(transportInThisBranch);
		this.allSoldierFromThisArmyBranch = new ArrayList<>(allSoldierFromThisArmyBranch);
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
				.collect(Collectors.toList());
	}

	public void readSoldiersFromFile(File file) {
		try {
			List<String> linesFromFile = Arrays
					.asList(FileUtils
							.readFileToString(file, StandardCharsets.UTF_8)
							.split("\n"));
			for (String line : linesFromFile) {
				line = line.replace("\n", "").replace("\r", "");
				List<String> fromFile = Arrays
						.asList(line.split(","));
				
				Soldier someSoldier = new Soldier();
				
				for (int i = 0; i < fromFile.size(); i++) {
					switch (i) {
					case 0:
						someSoldier.setName(fromFile.get(i));
						break;
					case 1:
						someSoldier.setGender(Gender.valueOf(fromFile.get(i).toUpperCase()));
						break;
					case 2:
						someSoldier.setDob(LocalDate.of(0, 1, 1).plusYears(Integer.parseInt(fromFile.get(i))));
						break;
					case 3:
						someSoldier.setDob(someSoldier.getDob()
								.plusMonths(Month.valueOf(fromFile.get(i).toUpperCase()).getValue() - 1));
						break;
					case 4:
						someSoldier.setDob(someSoldier.getDob().plusDays(Integer.parseInt(fromFile.get(i)) - 1));
						break;
					case 5:
						someSoldier.setHaveMedicalExamination(Boolean.parseBoolean(fromFile.get(i)));
						break;
					case 6:
						someSoldier.setMilitaryRank(MilitaryRank.valueOf(fromFile.get(i).toUpperCase()));
						break;
					case 7:
						someSoldier.setSpecialization(SpecializationMilitary.valueOf(fromFile.get(i).toUpperCase()));
						break;
					default:
						break;
					}

				}
				someSoldier.setId(RandomUtils.nextInt(100, 999));
				this.allSoldierFromThisArmyBranch.add(someSoldier);
			}
		} catch (IOException e) {
			LOGGER.error(e);
			e.printStackTrace();
		}
	}
	
	public void saveSoldiersToFile(File file) {
		try {
			FileUtils.writeLines(file, StandardCharsets.UTF_8.name(), getAllSoldierFromThisArmyBranch());
			
		} catch (IOException e) {
			LOGGER.error(e);
			e.printStackTrace();
		}
	}
}
