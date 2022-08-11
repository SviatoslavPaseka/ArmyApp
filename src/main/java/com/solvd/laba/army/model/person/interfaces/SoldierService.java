package com.solvd.laba.army.model.person.interfaces;

import com.solvd.laba.army.exceptoins.NotRegisterTransportException;
import com.solvd.laba.army.model.enums.RecruiterRank;
import com.solvd.laba.army.model.person.classes.MilitaryRecruiter;
import com.solvd.laba.army.model.person.classes.Soldier;
import com.solvd.laba.army.model.transport.Transport;

public interface SoldierService {
	void cleanHandWeapon(Integer numberPersonalWeapon);
	MilitaryRecruiter comeToRecruiterFromSoldier(Soldier soldier, Integer salary, RecruiterRank recruiterRank);
	void doRepairTransport(Transport transport) throws NotRegisterTransportException;
}
