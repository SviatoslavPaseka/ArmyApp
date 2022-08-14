package com.solvd.laba.army.model;

import java.util.List;

import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.transport.Transport;

public class ArmyBranch<T extends Transport> {
	private Integer id;
	private String name;
	private List<T> transportInThisBranch;
	
	public ArmyBranch() {
	}
	public ArmyBranch(Integer id, String name, List<SpecializationMilitary> specialization,
			List<T> transportInThisBranch) {
		this.id = id;
		this.name = name;
		this.transportInThisBranch = transportInThisBranch;
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
		this.transportInThisBranch = transportInThisBranch;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		return true;
	}
	@Override
	public String toString() {
		return "ArmyBranch [id=" + id + ", name=" + name + 
				", transportInThisBranch=" + transportInThisBranch + "]";
	}
	
}
