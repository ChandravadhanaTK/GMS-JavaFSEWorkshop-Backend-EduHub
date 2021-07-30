package com.atos.eduhub.service.impl;

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
	private MentorDaoImpl mentordaoimpl;

	@Override
	public String addMentor(@RequestBody Mentor mentorreq) {

		return mentordaoimpl.addMentor(mentorreq) > 0
				? "Mentor " + mentorreq.getUserid() + " has been added to EduHub successfully"
				: "Issue with adding mentor " + mentorreq.getUserid();

	}

	@Override
	public String editMentor(@RequestBody Mentor mentorreq) {

		return mentordaoimpl.editMentor(mentorreq) > 0
				? "Mentor " + mentorreq.getUserid() + " has been updated to EduHub successfully"
				: "Update unsuccessfull " + mentorreq.getUserid() + " does not exists ";

	}

	@Override
	public List<Mentor> viewMentor(int userid) {
		List<Mentor> getMentors = mentordaoimpl.viewMentorById(userid);
		return getMentors;

	}

	@Override
	public List<Mentor> viewAllMentors() {

		List<Mentor> getMentors = mentordaoimpl.viewAllMentors();
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
