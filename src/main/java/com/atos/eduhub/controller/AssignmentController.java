package com.atos.eduhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Assignment;
import com.atos.eduhub.service.AssignmentService;

@RestController
@RequestMapping("/eduhub/v1/assignment")
public class AssignmentController {
 
	@Autowired
	AssignmentService assignmentService;
	
	
	@GetMapping("/view/{id}")
	public Assignment viewAssignment(@PathVariable(name="id") int id) {
		return assignmentService.viewAssignment(id);
		
	}
}
