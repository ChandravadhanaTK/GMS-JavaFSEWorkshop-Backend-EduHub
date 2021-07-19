package com.atos.eduhub.service;

import java.util.List;


import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Learner;

@Component
public interface LearnerService {
	
	public Learner addLearner(Learner newLearner);
	
	public String delete1Learner(int id);

	public List<Learner> viewAllLearners();
}
