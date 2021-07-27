package com.atos.eduhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Assignment;
import com.atos.eduhub.service.AssignmentService;

@RestController
@RequestMapping("/eduhubapi/v1")

public class AssignmentController {
	@Autowired(required = true)
	AssignmentService assignmentService;

//Get all Assignments	
	@GetMapping("/viewassignment")
	public List<Assignment> getAllAssignment() {
		return assignmentService.getAllAssignment();
	}

//Get 1 Assignment 	
	@GetMapping("/view/{id}")
	public Assignment viewAssignment(@PathVariable(name = "id") int id) {
		return assignmentService.viewAssignment(id);
	}

//Update Assignment 	
	@PostMapping("/update/{id}")
	public String updateAssignment(@PathVariable(name = "id") int id) {
		return assignmentService.updateAssignment(id);
	}
}
