package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Assignment;

@Component
public interface AssignmentService {
	public List<Assignment> getAllAssignment();

	public Assignment viewAssignment(int id);

	public String updateAssignment(int id);

}
