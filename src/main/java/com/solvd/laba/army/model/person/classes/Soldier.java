package com.solvd.laba.army.model.person.classes;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.solvd.laba.army.exceptoins.NotRegisterTransportException;
import com.solvd.laba.army.exceptoins.RepairSpecializationException;
import com.solvd.laba.army.exceptoins.WeaponRightsException;
import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.RecruiterRank;
import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.enums.TypeHandsWeapon;
import com.solvd.laba.army.model.enums.TypeTransportRegistration;
import com.solvd.laba.army.model.person.Person;
import com.solvd.laba.army.model.person.interfaces.SoldierService;
import com.solvd.laba.army.model.transport.Transport;
import com.solvd.laba.army.model.weapons.HandWeapon;
 
public class Soldier extends Person implements SoldierService{
	final Logger log = Logger.getLogger(Soldier.class);
	private MilitaryRank militaryRank;
	private SpecializationMilitary specialization;
	private List<HandWeapon> personalWeapon;
	
	public Soldier() {
	}
	
	

	public Soldier(Integer id, String name, Gender gender, LocalDate dob, Boolean haveMedicalExamination,
					MilitaryRank militaryRank, SpecializationMilitary specialization,
					List<HandWeapon> personalWeapon) {
		super(id, name, gender, dob, haveMedicalExamination);
		this.militaryRank = militaryRank;
		this.specialization = specialization;
		this.personalWeapon = personalWeapon;
	}



	public MilitaryRank getMilitaryRank() {
		return militaryRank;
	}
	public void setMilitaryRank(MilitaryRank militaryRank) {
		this.militaryRank = militaryRank;
	}
	

	public SpecializationMilitary getSpecialization() {
		return specialization;
	}
	public void setSpecialization(SpecializationMilitary specialization) {
		this.specialization = specialization;
	}

	public List<HandWeapon> getPersonalWeapon() {
		return personalWeapon;
	}

	public void setPersonalWeapon(List<HandWeapon> personalWeapon) throws WeaponRightsException {
		
		if (!getMilitaryRank().equals(MilitaryRank.NONE) || !getMilitaryRank().equals(null)) {
			this.personalWeapon = personalWeapon;
		}else throw new WeaponRightsException("A person must have a military rank to have a hand weapon");
	}

	@Override
	public String toString() {
		return "Soldier:\n" + 
				"Name:" + getName() + 
				", \ndate of birth:" + getDob()	+ 
				", \ngender:" + getGender().toString().toLowerCase() +
				", \nmilitary rank:" + militaryRank.toString().toLowerCase() + 
				", \nmilitary specialization:" + specialization + 
				", \npersonal weapon:" + personalWeapon;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((militaryRank == null) ? 0 : militaryRank.hashCode());
		result = prime * result + ((personalWeapon == null) ? 0 : personalWeapon.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
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
		Soldier other = (Soldier) obj;
		if (militaryRank != other.militaryRank)
			return false;
		if (personalWeapon == null) {
			if (other.personalWeapon != null)
				return false;
		} else if (!personalWeapon.equals(other.personalWeapon))
			return false;
		if (specialization != other.specialization)
			return false;
		return true;
	}
	public MilitaryRecruiter comeToRecruiterFromSoldier(Soldier soldier, 
														Integer salary, 
														RecruiterRank recruiterRank) {
		
		MilitaryRecruiter militaryRecruiter = new MilitaryRecruiter(getId(),
												getName(),
												getGender(),
												getDob(),
												getHaveMedicalExamination(),
												salary, getMilitaryRank());
		militaryRecruiter.setRecruiterRank(recruiterRank);
		
		return militaryRecruiter;
	}
	public void cleanHandWeapon(Integer numberPersonalWeapon){
		//����� ���� ���������� � 1
		if (numberPersonalWeapon <= 0) {
			log.info("try to enter zero and less than zero value");
			return;
		}
		try {
			getPersonalWeapon().get(numberPersonalWeapon - 1).setIsClean(true);
		} catch (IndexOutOfBoundsException e) {
			log.warn(e);
			
			log.info("This soilder has " + getPersonalWeapon().size() + " weapons!");
		}
	}
	public void doRepairTransport(Transport transport) {
		if (transport.getIsUnderRepaired().equals(false) && 
			!transport.getTransportRegistration().equals(TypeTransportRegistration.NONE)) {
			System.out.println("This transport need not repair");
			return;
		}
		
		if (transport.getTransportRegistration().equals(TypeTransportRegistration.NONE)) {
			throw new NotRegisterTransportException("This transport does not has any regisatration");
		}else {
			if(getMilitaryRank().equals(MilitaryRank.MECHANIC)&&
				getSpecialization().equals(transport.getSpecializationMilitary())) {
				transport.setIsUnderRepaired(false);
			}else if (getMilitaryRank() != MilitaryRank.MECHANIC) {
				throw new RepairSpecializationException("This soldier is not mechanic");
			}else if(!getSpecialization().equals(transport.getSpecializationMilitary())) {
				throw new RepairSpecializationException
				("This transport has " + transport.getSpecializationMilitary() +
				" specialization but current mechanic has this specialization: " + 
				getSpecialization());
			}
		}
	}
	public Map<Integer, TypeHandsWeapon> getAllHandWeaponByIdAndType(){
		Map<Integer, TypeHandsWeapon> result = 
				getPersonalWeapon().stream().
				collect(Collectors.
						toMap(HandWeapon::getGunId, HandWeapon::getTypeHadsWeapon));
		return result;
	}
}
