package com.atos.eduhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Mentor;
import com.atos.eduhub.service.MentorService;

@RestController
@RequestMapping("/eduhubapi/v1")
public class MentorController {

	@Autowired
	private MentorService mentorservice;

	// Following controller code registers new Mentors to EduHub.
	@PutMapping("/mentor")
	public String addMentor(@RequestBody Mentor mentorreq) {
		return mentorservice.addMentor(mentorreq);
	}

	// Following controller code updates the profile of registered mentors to EduHub
	@PostMapping("/mentor")
	public String editMentor(@RequestBody Mentor mentorreq) {
		return mentorservice.editMentor(mentorreq);
	}

	// Following controller code lists the first mentor registered in EduHub
	@GetMapping("/mentor/{id}")
	public List<Mentor> viewMentor(@PathVariable(value = "id") int id) {
		return mentorservice.viewMentor(id);
	}

	// Following controller code lists all mentors registered in EduHub
	@GetMapping("/mentor")
	public List<Mentor> viewAllMentors() {
		return mentorservice.viewAllMentors();
	}

	// Following controller code deletes the requested mentor registered in EduHub
	@DeleteMapping("/mentor/{id}")
	public String deleteMentor(@PathVariable(value = "id") int id) {
		return mentorservice.deleteMentor(id);
	}
	
	/*
	 * Following controller code deletes all mentors registered in EduHub
	*/
	@DeleteMapping("/mentor")
	public String deleteAllMentors() {
		return mentorservice.deleteAllMentors();
	}

}
