package com.atos.eduhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.atos.eduhub.model.MentorModel;
import com.atos.eduhub.service.AddMentor;

@Service
public class AddMentorService implements AddMentor {

	@Autowired
	private MentorModel mentor;
	
	@Override
	public String addMentor(@RequestBody MentorModel mentorreq) {
		
		mentor.setLastupdatedon();
		mentor.setUserid(mentorreq.getUserid());
		mentor.setEnddatetime(mentorreq.getEnddatetime());
		mentor.setAboutmentor(mentorreq.getAboutmentor());
		mentor.setMentorrating(mentorreq.getMentorrating());
		mentor.setStartdatetime(mentorreq.getStartdatetime());
		mentor.setMentoredhours(mentorreq.getMentoredhours());
		mentor.setAvailabilityid(mentorreq.getAvailabilityid());
		mentor.setMentoringskill(mentorreq.getMentoringskill());
	
		System.out.println(mentor);
		return "Mentor " + mentorreq.getUserid() + " has been added successfully";
	}
}
