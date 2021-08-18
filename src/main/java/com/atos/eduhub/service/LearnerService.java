package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Learner;
import com.atos.eduhub.model.LearnerModel;

@Component
public interface LearnerService {

	public String addLearner(LearnerModel model);

	public String updateLearner(int learnerid, Learner updateLearner);

	public String delete1Learner(int learnerid);

	public String deleteAllLearner();
	
	public String deleteAllUser(int userid);

	public List<Learner> view1Learner(int userid);

	public List<Learner> viewRequest(int requestId);

	public List<Learner> viewAllLearners();
}
