package com.solvd.laba.army.model.person;

import java.time.LocalDate;

import com.solvd.laba.army.exceptoins.IncorrectYearException;
import com.solvd.laba.army.model.enums.Gender;

public abstract class Person {
	private Integer id; 
	private String name;
	private Gender gender;
	private LocalDate dob;
	private Boolean haveMedicalExamination;//чи встановлена пригодність для військової служби
	
	public Person() {
	}

	public Person(Integer id, String name, Gender gender, LocalDate dob, Boolean haveMedicalExamination) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.haveMedicalExamination = haveMedicalExamination;
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

	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) throws IncorrectYearException {
		if (dob.getYear() > LocalDate.now().getYear()) {
			throw new IncorrectYearException("the entered year of birth is greater than the current one");
		}
		this.dob = dob;
	}

	public Boolean getHaveMedicalExamination() {
		return haveMedicalExamination;
	}

	public void setHaveMedicalExamination(Boolean haveMedicalExamination) {
		this.haveMedicalExamination = haveMedicalExamination;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((haveMedicalExamination == null) ? 0 : haveMedicalExamination.hashCode());
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
		Person other = (Person) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (gender != other.gender)
			return false;
		if (haveMedicalExamination == null) {
			if (other.haveMedicalExamination != null)
				return false;
		} else if (!haveMedicalExamination.equals(other.haveMedicalExamination))
			return false;
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

	
}
