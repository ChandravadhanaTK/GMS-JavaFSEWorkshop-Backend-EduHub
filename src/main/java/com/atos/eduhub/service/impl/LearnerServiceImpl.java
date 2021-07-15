package com.atos.eduhub.service.impl;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Learner;
import com.atos.eduhub.service.LearnerService;

@Component
public class LearnerServiceImpl implements LearnerService{
	
	@Override
	public Learner addLearner(Learner newLearner) {
	//	newLearner.setName("Add new learner");
		return newLearner;
	}

	
	@Override
	public String delete1Learner(int id) {
		return "Deleted Learner id" + id;
	}

}