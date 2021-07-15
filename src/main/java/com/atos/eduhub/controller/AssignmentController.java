package com.atos.eduhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.service.AssignmentService;
import com.atos.eduhub.model.Assignment;
import java.util.List;

@RestController
@RequestMapping("/eduhubapi/v1")

public class AssignmentController {
	@Autowired(required = true)
	AssignmentService assignmentService;
	
	@GetMapping("/assignment")
	public List<Assignment> getAllAssignment(){
		return assignmentService.getAllAssignment();
	}
	
	
		

}
