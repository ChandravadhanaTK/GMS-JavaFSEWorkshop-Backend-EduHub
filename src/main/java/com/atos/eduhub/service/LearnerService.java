package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Learner;
import com.atos.eduhub.model.LearnerModel;

@Component
public interface LearnerService {

	public String addLearner(LearnerModel model);

	public String updateLearner(int id, Learner updateLearner);

	public String delete1Learner(int userId);

	public String deleteAllLearner();

	public Learner viewLearner();

	public List<Learner> viewAllLearners();
}
