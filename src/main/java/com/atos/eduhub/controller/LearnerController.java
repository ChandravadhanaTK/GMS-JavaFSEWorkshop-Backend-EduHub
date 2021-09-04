package com.atos.eduhub.controller;

import java.util.List;

//import java.awt.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Learner;
import com.atos.eduhub.model.LearnerModel;
import com.atos.eduhub.service.LearnerService;
//import com.atos.eduhub.service.impl.LearnerServiceImpl;

//@CrossOrigin(origins ="Http:/localhost:3000")

@CrossOrigin("*")

@RestController
@RequestMapping("/eduhubapi/v1")
public class LearnerController {

	@Autowired(required = true)
	LearnerService learnerService;

	// Add Learner
	@PutMapping("/learner")
	public String addLearner(@RequestBody LearnerModel learnermodel) {
		return learnerService.addLearner(learnermodel);
	}

	// update Learner
	@PutMapping("/learner/{requestid}")
	public String updateLearner(@PathVariable(name = "requestid") int requestid, @RequestBody Learner updateLearner) {
		return learnerService.updateLearner(requestid, updateLearner);
	}

	// Delete 1 Learner
	@DeleteMapping("/learner/{requestid}")
	public String delete1Learner(@PathVariable(value = "requestid") int requestid) {
		return learnerService.delete1Learner(requestid);
		
	}
	
	// Delete all for user
	@DeleteMapping("/learner/user/{userid}")
	public String deleteAllUser(@PathVariable(value = "userid") int userid) {
			return learnerService.deleteAllUser(userid);
	}

	// Delete all Learner
	@DeleteMapping("/learner")
	public String deleteAllLearner() {
		return learnerService.deleteAllLearner();
	}
	// View all for 1 user
	@GetMapping("/learner/user/{userid}")
	public List<Learner> view1Learner(@PathVariable(value = "userid") int userid) {
		return learnerService.view1Learner(userid);
	}

	// View all Learners
	@GetMapping("/learner")
	public List<Learner> viewAllLearners() {
		return learnerService.viewAllLearners();
	}
	
	
	// View 1 request 
	@GetMapping("/learner/{requestId}")
	public List<Learner>  viewRequest(@PathVariable(value = "requestId") int requestId) {
			return learnerService.viewRequest(requestId);
		
	}

}