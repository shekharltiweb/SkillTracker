package com.skilltracker.functionaltestcases;


import static com.skilltracker.utilityclasses.TestUtils.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import com.skilltracker.controller.SkillTrackerController;
import com.skilltracker.dtos.SkillTrackerDTO;
import com.skilltracker.entitys.SkillTracker;
import com.skilltracker.servicesImpl.SkillTrackerServiceImpl;
import com.skilltracker.utilityclasses.MasterData;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@WebMvcTest(SkillTrackerController.class)
public class SkillControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private SkillTrackerServiceImpl skillServiceImpl;

	@Test
	public void testAddSkill() throws Exception {

		SkillTrackerDTO skilltracker = new SkillTrackerDTO();
		Mockito.when(skillServiceImpl.saveSkill(skilltracker)).thenReturn(skilltracker);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/skill-tracker/addSkill")
				.content(MasterData.asJsonString(skilltracker)).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse().getContentAsString());
		System.out.println(skilltracker);
		yakshaAssert(currentTest(),
				result.getResponse().getContentAsString().contentEquals(MasterData.asJsonString(skilltracker)) ? true
						: false,
				businessTestFile);
	}
	
	//-- BDD Test : addPost -------------------------------------------------------------------
		@Test
		public void testAddPostBDD() throws Exception 
		{
			final int count[] = new int[1];
			
			SkillTrackerDTO skilltracker = MasterData.getSkillTrackerDto();
			
			Mockito.when(skillServiceImpl.saveSkill(skilltracker)).then(new Answer<SkillTrackerDTO>() {
				@Override
				public SkillTrackerDTO answer(InvocationOnMock invocation) throws Throwable {
					// TODO Auto-generated method stub
					System.out.println("Called");
					count[0]++;
					return skilltracker;
				}
			});
			
			RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/skill-tracker/addSkill")
					.content(MasterData.asJsonString(skilltracker))
					.contentType(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON);	
			
			MvcResult result = mockMvc.perform(requestBuilder).andReturn();
			
			System.out.println(result.getResponse().getContentAsString());
			System.out.println(count[0]);
			yakshaAssert(currentTest(), 
						count[0] == 1 ? true : false, 
						businessTestFile);
		}
	

	
}