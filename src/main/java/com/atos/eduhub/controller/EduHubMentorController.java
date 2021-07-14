package com.atos.eduhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.MentorModel;
import com.atos.eduhub.service.AddMentor;

@RestController
public class EduHubMentorController {
	
	@Autowired
	private AddMentor addmentor;
	
	@PutMapping("/addmentor")
	public String addMentor(@RequestBody MentorModel mentorreq) {				
		return addmentor.addMentor(mentorreq);		
	}
	
//	@GetMapping("/showmentor")
//	public List<MentorModel> showMentor() {
//		return eduhubmentordao.getMentorlist();
//	}
	
}
