package com.atos.eduhub.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Learner;
import com.atos.eduhub.model.LearnerModel;
import com.atos.eduhub.model.UserModel;

@Component
public interface LearnerDao {

	public List<Map<String, Object>> viewAllLearners() ;
//	public UserModel findById(String userId);
	public int  saveLearner(LearnerModel learnermodel);
	public int  delete1Learner(int userid);
	public int  deleteAllLearner();
	public int  deleteAllUser(int userid);
	public int  updateLearner(int requestid, Learner updateLearner);
	public List<Map<String, Object>> view1Learner(int userid) ;


}
