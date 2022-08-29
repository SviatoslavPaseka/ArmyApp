package com.solvd.laba.army.model.files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.log4j.Logger;

import com.solvd.laba.army.model.enums.Gender;
import com.solvd.laba.army.model.enums.MilitaryRank;
import com.solvd.laba.army.model.enums.SpecializationMilitary;
import com.solvd.laba.army.model.person.classes.Soldier;

public class SoldiersFiles{
	private static final Logger LOGGER = Logger.getLogger(SoldiersFiles.class);
	public static List<Soldier> readSoldiersFromFile(File file) {
		List<Soldier> soldiersFromFile = new ArrayList<Soldier>();
		try {
			List<String> linesFromFile = Arrays
					.asList(FileUtils
							.readFileToString(file, StandardCharsets.UTF_8)
							.split("\n"));
			for (String line : linesFromFile) {
				line = line.replace("\n", "").replace("\r", "");
				List<String> fromFile = Arrays
						.asList(line.split(","));
				
				Soldier someSoldier = new Soldier();
				
				for (int i = 0; i < fromFile.size(); i++) {
					switch (i) {
					case 0:
						someSoldier.setName(fromFile.get(i));
						break;
					case 1:
						someSoldier.setGender(Gender.valueOf(fromFile.get(i).toUpperCase()));
						break;
					case 2:
						someSoldier.setDob(LocalDate.of(0, 1, 1).plusYears(Integer.parseInt(fromFile.get(i))));
						break;
					case 3:
						someSoldier.setDob(someSoldier.getDob()
								.plusMonths(Month.valueOf(fromFile.get(i).toUpperCase()).getValue() - 1));
						break;
					case 4:
						someSoldier.setDob(someSoldier.getDob().plusDays(Integer.parseInt(fromFile.get(i)) - 1));
						break;
					case 5:
						someSoldier.setHaveMedicalExamination(Boolean.parseBoolean(fromFile.get(i)));
						break;
					case 6:
						someSoldier.setMilitaryRank(MilitaryRank.valueOf(fromFile.get(i).toUpperCase()));
						break;
					case 7:
						someSoldier.setSpecialization(SpecializationMilitary.valueOf(fromFile.get(i).toUpperCase()));
						break;
					default:
						break;
					}

				}
				someSoldier.setId(RandomUtils.nextInt(100, 999));
				soldiersFromFile.add(someSoldier);
			}
		} catch (IOException e) {
			LOGGER.error(e);
			e.printStackTrace();
		}
		return soldiersFromFile;
	}
	
	public static void saveSoldiersToFile(File file, List<Soldier> soldiers) {
		try {
			FileUtils.writeLines(file, StandardCharsets.UTF_8.name(), soldiers);//dob: year month day ','
			
		} catch (IOException e) {
			LOGGER.error(e);
			e.printStackTrace();
		}
	}
}
