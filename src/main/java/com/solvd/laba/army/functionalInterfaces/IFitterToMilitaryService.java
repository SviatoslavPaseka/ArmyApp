package com.solvd.laba.army.functionalInterfaces;

import java.time.LocalDate;

@FunctionalInterface
public interface IFitterToMilitaryService {
	boolean determine(LocalDate dob, boolean medicalExamination);
}
