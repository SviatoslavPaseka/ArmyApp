package com.solvd.laba.army.model.person.classes;

import java.time.LocalDate;

import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.RegistratorHierarchy;
import com.solvd.laba.army.model.enums.TypeTransportRegistration;
import com.solvd.laba.army.model.person.Person;
import com.solvd.laba.army.model.person.interfaces.RegistratorInterface;
import com.solvd.laba.army.model.transport.Transport;

public class Registrator extends Person implements RegistratorInterface{
	private Integer numberRegistration = 0;
	private RegistratorHierarchy registratorHierarchy = RegistratorHierarchy.ZERO;
	
	public Registrator() {
	}

	public Registrator(Integer id, String firstname, String lastname, Gender gender, LocalDate dob,
			Boolean haveMedicalExamination, Integer numberRegistration) {
		super(id, firstname, lastname, gender, dob, haveMedicalExamination);
		this.numberRegistration = numberRegistration;
	}

	public Integer getNumberRegistration() {
		return numberRegistration;
	}

	public void setNumberRegistration(Integer numberRegistration) {
		this.numberRegistration = numberRegistration;
	}

	public RegistratorHierarchy getRegistratorHierarchy() {
		return registratorHierarchy;
	}

	public void setRegistratorHierarchy(RegistratorHierarchy registratorHierarchy) {
		this.registratorHierarchy = registratorHierarchy;
	}
	
	public void registerTransport(Transport transport,
								  TypeTransportRegistration typeTransportRegistration) {
		transport.setTransportRegistration(typeTransportRegistration);
		numberRegistration++;
		
		if (numberRegistration > 0 && getRegistratorHierarchy() == RegistratorHierarchy.ZERO) {
			setRegistratorHierarchy(RegistratorHierarchy.FIRST);
		}else if (numberRegistration > 10 && getRegistratorHierarchy() != RegistratorHierarchy.SECOND) {
			setRegistratorHierarchy(RegistratorHierarchy.SECOND);
		}
	}

	public Integer getSalaryRegistrator() {
		return this.registratorHierarchy.getSalary();
	}
}
