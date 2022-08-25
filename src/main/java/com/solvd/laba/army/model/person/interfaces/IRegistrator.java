package com.solvd.laba.army.model.person.interfaces;

import com.solvd.laba.army.model.enums.TypeTransportRegistration;
import com.solvd.laba.army.model.transport.Transport;

public interface IRegistrator {
	void registerTransport(Transport transport, TypeTransportRegistration typeTransportRegistration);
	Double getSalaryRegistrator(Double coefficient);
}
