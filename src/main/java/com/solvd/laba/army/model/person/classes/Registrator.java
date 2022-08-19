package com.solvd.laba.army.model.person.classes;

import java.time.LocalDate;

import org.apache.log4j.Logger;

import com.solvd.laba.army.exceptoins.NegativeNumberException;
import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.RegistratorHierarchy;
import com.solvd.laba.army.model.enums.TypeTransportRegistration;
import com.solvd.laba.army.model.person.Person;
import com.solvd.laba.army.model.person.interfaces.IRegistrator;
import com.solvd.laba.army.model.transport.Transport;

public class Registrator extends Person implements IRegistrator{
	private static final Logger LOGGER = Logger.getLogger(Registrator.class);
	
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
	
	@Override
	public void registerTransport(Transport transport,
								  TypeTransportRegistration typeTransportRegistration) {
		if (typeTransportRegistration != null) {
			transport.setTransportRegistration(typeTransportRegistration);
			numberRegistration++;
		}else {
			LOGGER.warn("typeTransportRegistration cannot be null!\n Transport was not registered");
		}
		if (numberRegistration > 0 && getRegistratorHierarchy() == RegistratorHierarchy.ZERO) {
			setRegistratorHierarchy(RegistratorHierarchy.FIRST);
		}else if (numberRegistration > 10 && getRegistratorHierarchy() != RegistratorHierarchy.SECOND) {
			setRegistratorHierarchy(RegistratorHierarchy.SECOND);
		}
	}
	
	@Override
	public Integer getSalaryRegistrator() {
		return getRegistratorHierarchy().getSalary();
	}
}
