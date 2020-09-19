package com.skilltracker.entitys;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("skilltracker")
@Data
public class SkillTracker {

	@Id
	private String skillId;
	private String skillName;
	private long skillMinVal;
	private long skillMaxVal;
	private long skillBegainMinVal;
	private long skillBegainMaxVal;
	private long skillIntermedMinVal;
	private long skillIntermedMaxVal;
	private long skillExpertMinVal;
	private long SkillExpertMaxVal;
	private String teamName;
	private String remarks;
	private String skillcategory;
	public long getSkillExpertMaxVal() {
		return SkillExpertMaxVal;
	}

	public void setSkillExpertMaxVal(long skillExpertMaxVal) {
		SkillExpertMaxVal = skillExpertMaxVal;
	}

	private String skilltype;
	private String skilltotExp;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
	private User user;
	
	public SkillTracker(String skillId, String skillName, long skillMinVal, long skillMaxVal, long skillBegainMinVal,
			long skillBegainMaxVal, long skillIntermedMinVal, long skillIntermedMaxVal, long skillExpertMinVal,
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
		this.teamName = teamName;
		this.remarks = remarks;
		this.skillcategory = skillcategory;
		this.skilltype = skilltype;
		this.skilltotExp = skilltotExp;
		this.user = user;
	}

	public SkillTracker() {
		
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