package com.atos.eduhub.service;

import com.atos.eduhub.model.Learner;

public interface LearnerService {
	
	public Learner addLearner(Learner newLearner);
	
	public String delete1Learner(int id);

}
