package com.atos.eduhub.service;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Demo;
import com.atos.eduhub.model.Learner;

@Component 
public interface LearnerService {
	
	public String delete1Learner(int id);

	public Learner viewLearner();

	}
