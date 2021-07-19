package com.atos.eduhub.service;

import org.springframework.stereotype.Component;
import com.atos.eduhub.model.Learner;
import java.util.List;

@Component
public interface LearnerService {
	
	public Learner addLearner(Learner newLearner);
	
	public String delete1Learner(int id);

	public Learner viewLearner();

	public List<Learner> viewAllLearners();
}
