package com.atos.eduhub.controller;

import java.util.List;
//import java.awt.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Learner;
import com.atos.eduhub.service.LearnerService;
//import com.atos.eduhub.service.impl.LearnerServiceImpl;

@RestController
@RequestMapping("/eduhubapi/v1")
public class LearnerController {

	@Autowired(required = true)
	LearnerService learnerService;


	
	// Add Learner
	@PutMapping("/learner")
	public Learner addLearner(@RequestBody Learner newLearner) {
		return learnerService.addLearner(newLearner);
	}

	// Delete 1 Learner 
	@DeleteMapping("/learner/{id}")
	public String  delete1Learner(@PathVariable(value="id") int id) {
		String deleteString = learnerService.delete1Learner(id);
		//return ResponseEntity.ok().build();
	    return "Deleted Learner id " + id; 	
	}
		
	// View 1 Learner 
	@GetMapping("/learner/{id}")
	public Learner viewLearner() {
		return learnerService.viewLearner();
	}

	// View all Learners 
	@GetMapping("/learner")
	public List<Learner> viewAllLearners() {
	   // public String viewAllLearners() {
	   //String viewAllString = learnerService.viewAllLearners();
	   //return ResponseEntity.ok().build();
	   // return viewAllString;
	   return learnerService.viewAllLearners();
	}

}