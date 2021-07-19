package com.atos.eduhub.service;

import org.springframework.stereotype.Component;
import com.atos.eduhub.model.Learner;
import java.util.List;

@Component
public interface LearnerService {
	
	public Learner addLearner(Learner newLearner);
	
	public Learner updateLearner(int id, Learner updateLearner);
	
	public String delete1Learner(int id);
	
	public String deleteAllLearner();

	public Learner viewLearner();

	public List<Learner> viewAllLearners();
}
