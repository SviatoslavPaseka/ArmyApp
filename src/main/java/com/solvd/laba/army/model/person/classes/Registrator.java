package com.solvd.laba.army.model.person.classes;

import java.time.LocalDate;

import com.solvd.laba.army.exceptoins.NegativeNumberException;
import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.RegistratorHierarchy;
import com.solvd.laba.army.model.enums.TypeTransportRegistration;
import com.solvd.laba.army.model.person.Person;
import com.solvd.laba.army.model.person.interfaces.RegistratorService;
import com.solvd.laba.army.model.transport.Transport;

public class Registrator extends Person implements RegistratorService{
	private Integer numberRegistration = 0;
	private RegistratorHierarchy registratorHierarchy = RegistratorHierarchy.ZERO;
	
	public Registrator() {
	}
	public Registrator(Integer id, String name, Gender gender, LocalDate dob,
			Boolean haveMedicalExamination, Integer numberRegistration) {
		super(id, name, gender, dob, haveMedicalExamination);
		this.numberRegistration = numberRegistration;
	}

	public Integer getNumberRegistration() {
		return numberRegistration;
	}

	public void setNumberRegistration(Integer numberRegistration) {
		if (numberRegistration < 0) {
			throw new NegativeNumberException("Trying to enter negative number");
		}else this.numberRegistration = numberRegistration;
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
		return getRegistratorHierarchy().getSalary();
	}
}
