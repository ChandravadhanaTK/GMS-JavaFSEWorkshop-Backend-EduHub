package com.atos.eduhub.dao;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Mentor;

@Component
public interface MentorDao {
	
	int addMentor(Mentor mentor);

}
