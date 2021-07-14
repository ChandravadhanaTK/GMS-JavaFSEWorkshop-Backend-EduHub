package com.atos.eduhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.MentorModel;
import com.atos.eduhub.service.MentorService;

@RestController
public class EduHubMentorController {
	
	@Autowired
	private MentorService mentorservice;
	
	@PutMapping("/addmentor")
	public String addMentor(@RequestBody MentorModel mentorreq) {				
		return mentorservice.addMentor(mentorreq);		
	}	
	
	@GetMapping("/showmentor")
	public List<MentorModel> showMentor() {
		return mentorservice.getAllMentor();
	}
	
	@DeleteMapping("/deletementor/{id}")
	public String deleteMentor(@PathVariable(value="id") int id) {
		return mentorservice.deleteMentor(id);
	}
		
	@DeleteMapping("/deleteallmentors")
	public String deleteAllMentors() {
		return mentorservice.deleteAllMentors();
	}
	
}
