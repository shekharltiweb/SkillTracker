package com.skilltracker.utils;

import java.util.ArrayList;
import java.util.List;


import com.skilltracker.entitys.SkillTracker;

public class TestUtilities {
	public SkillTracker convertToSkillTracker(SkillTracker skilltrackerdto) {
		SkillTracker skilltracker = new SkillTracker();
		skilltracker.setSkillId(skilltrackerdto.getSkillId());
		skilltracker.setSkillName(skilltracker.getSkillName());
		skilltracker.setSkillBegainMinVal(skilltracker.getSkillBegainMinVal());
		skilltracker.setSkillBegainMaxVal(skilltracker.getSkillBegainMaxVal());
		skilltracker.setSkillIntermedMinVal(skilltracker.getSkillIntermedMinVal());
		skilltracker.setSkillIntermedMaxVal(skilltracker.getSkillIntermedMaxVal());
		skilltracker.setSkillExpertMinVal(skilltracker.getSkillExpertMinVal());
		skilltracker.setSkillExpertMaxVal(skilltracker.getSkillExpertMaxVal());
		skilltracker.setSkilltype(skilltracker.getSkilltype());
		skilltracker.setRemarks(skilltracker.getRemarks());
		skilltracker.setSkillcategory(skilltracker.getSkillcategory());
		skilltracker.setSkilltotExp(skilltracker.getSkilltotExp());
		skilltracker.setTeamName(skilltracker.getTeamName());
		
		return skilltracker;
	}
	/*
	 * public VisitorComments convertToVisitorComments(VisitorCommentsDto
	 * commentdto) { VisitorComments visitorComment = new VisitorComments();
	 * visitorComment.setId(commentdto.getCommentId());
	 * visitorComment.setPostId(commentdto.getCommentId());
	 * visitorComment.setTags(commentdto.getTags());
	 * visitorComment.setVisitorComment(commentdto.getVisitorComment()); return
	 * visitorComment; } public VisitorCommentsDto
	 * convertToVisitorCommentsDto(VisitorComments visitorComments) {
	 * VisitorCommentsDto visitorCommentDto = new VisitorCommentsDto();
	 * visitorCommentDto.setCommentId(visitorComments.getId());
	 * visitorCommentDto.setPostId(visitorComments.getPostId());
	 * visitorCommentDto.setTags(visitorComments.getTags());
	 * visitorCommentDto.setVisitorComment(visitorComments.getVisitorComment());
	 * return visitorCommentDto; }
	 * 
	 * public VisitorPostsDto convertToVisitorPostsDto(VisitorPosts visitorPosts) {
	 * VisitorPostsDto visitorPostdto = new VisitorPostsDto();
	 * visitorPostdto.setPostDescription(visitorPosts.getPostDescription());
	 * visitorPostdto.setPostId(visitorPosts.getId());
	 * visitorPostdto.setTags(visitorPosts.getTags());
	 * visitorPostdto.setTitle(visitorPosts.getTitle());
	 * visitorPostdto.setAuthor(visitorPosts.getAuthor()); return visitorPostdto; }
	 * 
	 * public List<VisitorPostsDto> convertToVisitorPostsDtoList(List<VisitorPosts>
	 * visitorPostList){ List<VisitorPostsDto> list = new
	 * ArrayList<VisitorPostsDto>(); for(VisitorPosts postdto: visitorPostList) {
	 * list.add(convertToVisitorPostsDto(postdto)); }
	 * 
	 * return list; } public List<VisitorCommentsDto>
	 * convertToVisitorCommentsDtoList(List<VisitorComments> visitorCommentsList){
	 * List<VisitorCommentsDto> list = new ArrayList<VisitorCommentsDto>();
	 * for(VisitorComments commentdto : visitorCommentsList) {
	 * list.add(convertToVisitorCommentsDto(commentdto)); } return list; }
	 */
}
