package com.solvd.laba.army.model.person.classes;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.solvd.laba.army.exceptoins.IncorrectRankException;
import com.solvd.laba.army.exceptoins.NegativeNumberException;
import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.RecruiterRank;
import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.person.Person;
import com.solvd.laba.army.model.person.interfaces.MIlitaryRecruiterService;
import com.solvd.laba.army.model.weapons.HandWeapon;

public class MilitaryRecruiter extends Person implements MIlitaryRecruiterService{

	private static final Logger LOGGER = Logger.getLogger(MilitaryRecruiter.class);
	
	private RecruiterRank recruiterRank;
	private Integer salary;
	private MilitaryRank militaryRank = MilitaryRank.NONE;
	
	public MilitaryRecruiter() {
	}
	
	public MilitaryRecruiter(Integer id, String name, Gender gender, LocalDate dob, 
						Boolean haveMedicalExamination, Integer salary, MilitaryRank militaryRank) {
		super(id, name, gender, dob, haveMedicalExamination);
		this.salary = salary;
		this.militaryRank = militaryRank;
	}

	public RecruiterRank getRecruiterRank() {
		return recruiterRank;
	}
	public void setRecruiterRank(RecruiterRank recruiterRank) throws IncorrectRankException {
		
		if (recruiterRank != RecruiterRank.OFFICE_HEAD && 
			(getMilitaryRank() == MilitaryRank.GENERAL || 
			getMilitaryRank() == MilitaryRank.GENERAL_OF_ARMY)) {
			throw new IncorrectRankException("try to set GENERAL other recruitment rank than HEAD_OF_OFFICE");
		}
		if (recruiterRank == RecruiterRank.OFFICE_HEAD && getMilitaryRank() == MilitaryRank.NONE) {//== or equals in this case?
			throw new IncorrectRankException("try to set a person without a military rank to head the office");
		}
		this.recruiterRank = recruiterRank;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		if (salary < 0) {
			throw new NegativeNumberException("Salary cannot be less than 0");
		}else this.salary = salary;
	}
	public MilitaryRank getMilitaryRank() {
		return militaryRank;
	}
	public void setMilitaryRank(MilitaryRank militaryRank) {
		this.militaryRank = militaryRank;
	}
	
	@Override
	public String toString() {
		return "MilitaryRecruiter [recruiterRank=" + recruiterRank + ", salary=" + salary + ", militaryRank="
				+ militaryRank + ", getId()=" + getId() + ", getName()=" + getName() + ", getGender()=" + getGender()
				+ ", Dob=" + getDob();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((militaryRank == null) ? 0 : militaryRank.hashCode());
		result = prime * result + ((recruiterRank == null) ? 0 : recruiterRank.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
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
		MilitaryRecruiter other = (MilitaryRecruiter) obj;
		if (militaryRank != other.militaryRank)
			return false;
		if (recruiterRank != other.recruiterRank)
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

	public void medicalExamination(Person person, RecruiterRank recruiterRank) {
		if (recruiterRank == RecruiterRank.MILITARY_DOCTOR) {
			person.setHaveMedicalExamination(true);
		}else {
			LOGGER.info("you are not a doctor");
		}
	}

	@Override
	public Soldier summonSoldier(Person person, MilitaryRank militaryRank, SpecializationMilitary specializationMilitary, List<HandWeapon> personalWeapons) {
		
		if (person.getDob().getYear() + 18 > LocalDate.now().getYear() ||
			person.getDob().getYear() + 60 <= LocalDate.now().getYear()) {
			LOGGER.warn("This person can not be summon to army");
			return null;
		}
		return new Soldier(person.getId(),
							person.getName(),
							person.getGender(),
							person.getDob(),
							person.getHaveMedicalExamination(),
							militaryRank,
							specializationMilitary,
							personalWeapons);
	}

	@Override
	public List<NotMilitaryPerson> getFitPeople(List<NotMilitaryPerson> allPeople) {
		
		LOGGER.info("Receivind list of fit people");
		return allPeople.stream()
					.filter(e -> e.getDob().getYear() < LocalDate.now().getYear() - 18)
					.filter(i -> i.getHaveMedicalExamination())
					.collect(Collectors.toList());
	}
	
	
}
