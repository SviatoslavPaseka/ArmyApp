package com.solvd.laba.army.model;

public class ArmyBranch {
	private Integer id;
	private String name;
	private String location;
	private Integer countOfPeople;
	public ArmyBranch(Integer id, String name, String location, Integer countOfPeople) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.countOfPeople = countOfPeople;
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
	
	
}
