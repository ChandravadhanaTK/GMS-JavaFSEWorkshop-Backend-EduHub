package com.atos.eduhub.service;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Assignment;

@Component
public interface AssignmentService {

	public Assignment viewAssignment(int id);
	
	
}
