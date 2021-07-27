package com.atos.eduhub.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Mentor;

@Component
public interface MentorDao {
	
	int addMentor(Mentor mentor);
	
	int deleteMentor(int mentorId);
	
	int deleteAllMentors();
	
	List<Mentor> loadAllMentors();
	
}
