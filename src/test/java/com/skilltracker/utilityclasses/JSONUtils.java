package com.skilltracker.utilityclasses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.skilltracker.dtos.SkillTrackerDTO;

import com.skilltracker.entitys.User;

import java.io.IOException;

public class JSONUtils {
	public static byte[] toJson(Object object) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		return mapper.writeValueAsBytes(object);
	}

	public static SkillTrackerDTO createskillDto(String skillId, String skillName, long skillMinVal, long skillMaxVal,
			long skillBegainMinVal, long skillBegainMaxVal, long skillIntermedMinVal, long skillIntermedMaxVal,
			long skillExpertMinVal, String teamName, String remarks, String skillcategory, String skilltype,
			String skilltotExp, User user) {

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

}