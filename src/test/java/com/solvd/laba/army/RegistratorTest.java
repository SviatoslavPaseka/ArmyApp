package com.solvd.laba.army;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.solvd.laba.army.model.enums.TypeTransportRegistration;
import static com.solvd.laba.army.model.enums.TypeTransportRegistration.*;
import com.solvd.laba.army.model.person.classes.Registrator;
import com.solvd.laba.army.model.transport.AirPlane;
import com.solvd.laba.army.model.transport.MilitaryWheels;
import com.solvd.laba.army.model.transport.Tank;
import com.solvd.laba.army.model.transport.Transport;

@TestInstance(Lifecycle.PER_CLASS)
public class RegistratorTest {
	private static final Logger LOGGER = Logger.getLogger(RegistratorTest.class);
	@ParameterizedTest
	@MethodSource(value = "sourceListTransportTypeTransportRegistration")
	void registerTransportTest(Transport transport, 
								TypeTransportRegistration typeTransportRegistration) {
		Registrator registrator = new Registrator(null, null, null, null, null, 5);
		registrator.registerTransport(transport, typeTransportRegistration);
		
		Assertions.assertEquals(typeTransportRegistration, transport.getTransportRegistration());
		LOGGER.info("Registration completed successfully");
	}
	
	List<Arguments> sourceListTransportTypeTransportRegistration(){
		return Arrays.asList(Arguments.arguments(new Tank(), MILITARY),
				Arguments.arguments(new AirPlane(), MILITARY),
				Arguments.arguments(new MilitaryWheels(), MILITARY));
	}
}
