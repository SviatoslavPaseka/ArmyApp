package com.solvd.laba.army.model.person.classes;

import java.time.LocalDate;

import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.person.Person;

public class NotMilitaryPerson extends Person {

	public NotMilitaryPerson() {
	}
	public NotMilitaryPerson(Integer id, String name, Gender gender, LocalDate dob, Boolean haveMedicalExamination) {
		super(id, name, gender, dob, haveMedicalExamination);
	}

	@Override
	public String toString() {
		return "NotMilitaryPerson [getId()=" + getId() + ", getName()=" + getName() + ", getGender()=" + getGender()
				+ ", getDob()=" + getDob() + ", getHaveMedicalExamination()=" + getHaveMedicalExamination() + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}
