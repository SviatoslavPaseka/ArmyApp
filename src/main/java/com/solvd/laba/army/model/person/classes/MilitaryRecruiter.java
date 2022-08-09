package com.solvd.laba.army.model.person.classes;

import java.time.LocalDate;

import com.solvd.laba.army.exceptoins.IncorrectRankException;
import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.RecruiterRank;
import com.solvd.laba.army.model.person.Person;
import com.solvd.laba.army.model.person.interfaces.MIlitaryRecruiterInterface;

public class MilitaryRecruiter extends Person implements MIlitaryRecruiterInterface{

	private RecruiterRank recruiterRank;
	private Integer salary;
	private MilitaryRank militaryRank = MilitaryRank.NONE;
	
	public MilitaryRecruiter() {
	}
	public MilitaryRecruiter(Integer id, String firstname, String lastname, Gender gender, LocalDate dob,
			RecruiterRank recruiterRank, Integer salary, Boolean haveMedicalExamination) {
		super(id, firstname, lastname, gender, dob, haveMedicalExamination);
		this.recruiterRank = recruiterRank;
		this.salary = salary;
	}
	public RecruiterRank getRecruiterRank() {
		return recruiterRank;
	}
	public void setRecruiterRank(RecruiterRank recruiterRank) throws IncorrectRankException {
		
		
		/*якщо намагатися для працівника воєнкоммату
		з військовим рангом GENERAL або GENERAL_OF_ARMY 
		встановити якусь іншу посаду окрім OFFICE_HEAD
		- автоматично буде встановлена посада OFFICE_HEAD*/
//		if ( getMilitaryRank() == MilitaryRank.GENERAL || getMilitaryRank() == MilitaryRank.GENERAL_OF_ARMY) {
//			this.recruiterRank = RecruiterRank.OFFICE_HEAD;
//			return;
//		}
		/*якщо намагатися для працівника воєнкоммату
		з військовим рангом GENERAL або GENERAL_OF_ARMY 
		встановити якусь іншу посаду окрім OFFICE_HEAD
		- вкине IncorrectRankException*/
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
		this.salary = salary;
	}
	public MilitaryRank getMilitaryRank() {
		return militaryRank;
	}
	public void setMilitaryRank(MilitaryRank militaryRank) {
		this.militaryRank = militaryRank;
	}
	
	public void medicalExamination(Person person, RecruiterRank recruiterRank) {
		if (recruiterRank == RecruiterRank.MILITARY_DOCTOR) {
			person.setHaveMedicalExamination(true);
		}else {
			System.out.println("you are not a doctor");
		}
	}
}
