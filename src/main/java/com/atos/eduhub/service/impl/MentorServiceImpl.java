package com.atos.eduhub.service.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.atos.eduhub.dao.impl.MentorDaoImpl;
import com.atos.eduhub.model.Mentor;
import com.atos.eduhub.service.MentorService;

@Service
public class MentorServiceImpl implements MentorService {

	@Autowired
	private Mentor mentor;

	@Autowired
	private MentorDaoImpl mentordaoimpl;

	@Override
	public String addMentor(@RequestBody Mentor mentorreq) {

		return mentordaoimpl.addMentor(mentorreq) > 0
				? "Mentor " + mentorreq.getUserid() + " has been added to EduHub successfully"
				: "Issue with adding mentor " + mentorreq.getUserid();

	}

	@Override
	public String editMentor(@RequestBody Mentor mentorreq) {

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
		return "Mentor " + mentorreq.getUserid() + " has been updated successfully";
	}

	@Override
	public Mentor viewMentor() {

		mentor.setAvailabilityid(100);
		mentor.setUserid(1000);
		mentor.setStartdatetime(Timestamp.valueOf(LocalDateTime.now()));
		mentor.setEnddatetime(Timestamp.valueOf(LocalDateTime.now()));
		mentor.setMentoringskill("Java");
		mentor.setMentoredhours("10");
		mentor.setMentorrating("5");
		mentor.setAboutmentor("Java mentor");
		mentor.setLastupdatedon();

		return mentor;
	}

	@Override
	public List<Mentor> viewAllMentors() {
		// TODO Auto-generated method stub

		
		List<Mentor> getMentors = mentordaoimpl.loadAllMentors();
		return getMentors;
	}

	@Override
	public String deleteMentor(int id) {
		return mentordaoimpl.deleteMentor(id) > 0 ? "Mentor with userid " + id + " was deleted from EduHub successfully"
				: "Issue with deleting mentor " + id;
	}

	@Override
	public String deleteAllMentors() {
		int deletedMentorsCount;
		deletedMentorsCount = mentordaoimpl.deleteAllMentors();
		return deletedMentorsCount > 0 ? deletedMentorsCount + " mentors were deleted from EduHub successfully"
				: "Issue with deleting mentors";
	}
}
