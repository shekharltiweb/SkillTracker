package com.skilltracker.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.skilltracker.entitys.User;

import lombok.Data;

@SuppressWarnings("deprecation")
@Data
public class SkillTrackerDTO {


    private String skillId;
    
	@Length(min = 5, max = 30)
	@NotNull
	private String skillName;

	@Length(min = 3, max = 25)
	@NotNull
	private long skillMinVal;

	@Length(min = 3, max = 25)
	private long skillMaxVal;

	@Length(min = 3, max = 25)
	private long skillBegainMinVal;

	@NotNull
	@Min(0L)
	private long skillBegainMaxVal;
	
	@NotNull
	@Length(min = 10, max = 10)
	private long skillIntermedMinVal ;
	
	@NotNull
	private long skillIntermedMaxVal;
	
	@NotNull
	@Length(min = 10, max = 10)
	private long skillExpertMinVal;
	
	@NotNull
	@Length(min = 10, max = 10)
	private long skillExpertMaxVal;
	
	@NotNull
	@Length(min = 10, max = 10)
	private String teamName;
	
	@NotNull
	@Length(min = 10, max = 10)
	private String remarks;
	
	@NotNull
	@Length(min = 10, max = 10)
	private String skillcategory;
	
	@NotNull
	@Length(min = 10, max = 10)
	private String skilltype;
	
	@NotNull
	@Length(min = 10, max = 10)
	private String skilltotExp;

	private User user;
	
	
	
	public SkillTrackerDTO(String skillId, String skillName, long skillMinVal, long skillMaxVal, long skillBegainMinVal,
			long skillBegainMaxVal, long skillIntermedMinVal, long skillIntermedMaxVal, long skillExpertMinVal, long skillExpertMaxVal,
			String teamName, String remarks, String skillcategory, String skilltype, String skilltotExp, User user) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.skillMinVal = skillMinVal;
		this.skillMaxVal = skillMaxVal;
		this.skillBegainMinVal = skillBegainMinVal;
		this.skillBegainMaxVal = skillBegainMaxVal;
		this.skillIntermedMinVal = skillIntermedMinVal;
		this.skillIntermedMaxVal = skillIntermedMaxVal;
		this.skillExpertMinVal = skillExpertMinVal;
		this.skillExpertMaxVal = skillExpertMaxVal;
		this.teamName = teamName;
		this.remarks = remarks;
		this.skillcategory = skillcategory;
		this.skilltype = skilltype;
		this.skilltotExp = skilltotExp;
		this.user = user;
	}

	public SkillTrackerDTO() {
		
	}

	public String getSkillId() {
		return skillId;
	}

	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public long getSkillMinVal() {
		return skillMinVal;
	}

	public void setSkillMinVal(long skillMinVal) {
		this.skillMinVal = skillMinVal;
	}

	public long getSkillMaxVal() {
		return skillMaxVal;
	}

	public void setSkillMaxVal(long skillMaxVal) {
		this.skillMaxVal = skillMaxVal;
	}

	public long getSkillBegainMinVal() {
		return skillBegainMinVal;
	}

	public void setSkillBegainMinVal(long skillBegainMinVal) {
		this.skillBegainMinVal = skillBegainMinVal;
	}

	public long getSkillBegainMaxVal() {
		return skillBegainMaxVal;
	}

	public void setSkillBegainMaxVal(long skillBegainMaxVal) {
		this.skillBegainMaxVal = skillBegainMaxVal;
	}

	public long getSkillIntermedMinVal() {
		return skillIntermedMinVal;
	}

	public void setSkillIntermedMinVal(long skillIntermedMinVal) {
		this.skillIntermedMinVal = skillIntermedMinVal;
	}

	public long getSkillIntermedMaxVal() {
		return skillIntermedMaxVal;
	}

	public void setSkillIntermedMaxVal(long skillIntermedMaxVal) {
		this.skillIntermedMaxVal = skillIntermedMaxVal;
	}

	public long getSkillExpertMinVal() {
		return skillExpertMinVal;
	}

	public void setSkillExpertMinVal(long skillExpertMinVal) {
		this.skillExpertMinVal = skillExpertMinVal;
	}
	
	public long getskillExpertMaxVal() {
		return skillExpertMaxVal;
	}

	public void setSkillExpertMaxVal(long skillExpertMaxVal) {
		skillExpertMaxVal = skillExpertMaxVal;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSkillcategory() {
		return skillcategory;
	}

	public void setSkillcategory(String skillcategory) {
		this.skillcategory = skillcategory;
	}

	public String getSkilltype() {
		return skilltype;
	}

	public void setSkilltype(String skilltype) {
		this.skilltype = skilltype;
	}

	public String getSkilltotExp() {
		return skilltotExp;
	}

	public void setSkilltotExp(String skilltotExp) {
		this.skilltotExp = skilltotExp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
}
