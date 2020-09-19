package com.skilltracker.utilityclasses;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.skilltracker.dtos.SkillTrackerDTO;
import com.skilltracker.entitys.SkillTracker;

public class MasterData {

	public static SkillTracker getSkillTracker() {

		SkillTracker skilltracker = new SkillTracker();

		skilltracker.setSkillId("1");
		skilltracker.setSkillName("Java");
		skilltracker.setSkillBegainMinVal(0);
		skilltracker.setSkillBegainMaxVal(25);
		skilltracker.setSkillIntermedMinVal(3);
		skilltracker.setSkillIntermedMaxVal(10);
		skilltracker.setSkillExpertMinVal(10);
		skilltracker.setSkillExpertMaxVal(12);
		skilltracker.setSkilltype("Java");
		skilltracker.setRemarks("Good");
		skilltracker.setSkillcategory("A");
		skilltracker.setSkilltotExp("20");
		skilltracker.setTeamName("OBL");
		return skilltracker;
	}

	public static SkillTrackerDTO getSkillTrackerDto() {
		SkillTrackerDTO skilltracker = new SkillTrackerDTO();

		skilltracker.setSkillId("1");
		skilltracker.setSkillName("Java");
		skilltracker.setSkillBegainMinVal(0);
		skilltracker.setSkillBegainMaxVal(25);
		skilltracker.setSkillIntermedMinVal(3);
		skilltracker.setSkillIntermedMaxVal(10);
		skilltracker.setSkillExpertMinVal(10);
		skilltracker.setSkillExpertMaxVal(12);
		skilltracker.setSkilltype("Java");
		skilltracker.setRemarks("Good");
		skilltracker.setSkillcategory("A");
		skilltracker.setSkilltotExp("20");
		skilltracker.setTeamName("OBL");

		return skilltracker;
	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
