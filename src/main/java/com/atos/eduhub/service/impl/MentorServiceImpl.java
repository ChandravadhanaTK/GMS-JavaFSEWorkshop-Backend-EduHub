package com.atos.eduhub.service.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.atos.eduhub.model.MentorModel;
import com.atos.eduhub.service.MentorService;

@Service
public class MentorServiceImpl implements MentorService {

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

	@Override
	public List<MentorModel> getAllMentor() {
		// TODO Auto-generated method stub
		
		List<MentorModel> getMentors = new ArrayList<MentorModel>();
		
		MentorModel mentor1 = new MentorModel();
		mentor1.setAvailabilityid(100);
		mentor1.setUserid(1000);
		mentor1.setStartdatetime(Timestamp.valueOf(LocalDateTime.now()));
		mentor1.setEnddatetime(Timestamp.valueOf(LocalDateTime.now()));
		mentor1.setMentoringskill("Java");
		mentor1.setMentoredhours("10");
		mentor1.setMentorrating("5");
		mentor1.setAboutmentor("Java mentor");
		mentor1.setLastupdatedon();
		
		getMentors.add(mentor1);
		
		MentorModel mentor2 = new MentorModel();
		mentor2.setAvailabilityid(101);
		mentor2.setUserid(2000);
		mentor2.setStartdatetime(Timestamp.valueOf(LocalDateTime.now()));
		mentor2.setEnddatetime(Timestamp.valueOf(LocalDateTime.now()));
		mentor2.setMentoringskill("Python");
		mentor2.setMentoredhours("20");
		mentor2.setMentorrating("4");
		mentor2.setAboutmentor("Python mentor");
		mentor2.setLastupdatedon();
		
		getMentors.add(mentor2);

//		getDemo.add(demo2);		
	//	return getDemo;
		return getMentors;
	}
}
