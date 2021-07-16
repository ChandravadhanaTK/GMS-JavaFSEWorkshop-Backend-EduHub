package com.atos.eduhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Learner;
import com.atos.eduhub.service.LearnerService;
import com.atos.eduhub.service.impl.LearnerServiceImpl;

@RestController
@RequestMapping("/eduhubapi/v1")
public class LearnerController {

	@Autowired(required = true)
	LearnerService learnerService;
	
	// Add Learner
	@PutMapping("/addlearner")
	public Learner addLearner(@RequestBody Learner newLearner) {
		return learnerService.addLearner(newLearner);
	}

	// Delete 1 Learner 
	@DeleteMapping("/learner/{id}")
	public ResponseEntity<Learner> delete1Learner(@PathVariable(value="id") int id) {
		String deleteString = learnerService.delete1Learner(id);
		return ResponseEntity.ok().build();
		
	}
}