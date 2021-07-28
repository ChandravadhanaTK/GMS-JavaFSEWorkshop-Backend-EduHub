package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.atos.eduhub.model.Mentor;

@Component
public interface MentorService {

	public String addMentor(@RequestBody Mentor mentorreq);

	public String editMentor(@RequestBody Mentor mentorreq);

	public List<Mentor> viewMentor(int userid);

	public List<Mentor> viewAllMentors();

	public String deleteMentor(int id);

	public String deleteAllMentors();
}
