package com.atos.eduhub.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.LearnerModel;

@Component
public interface LearnerDao {

	public List<Map<String, Object>> viewAllLearners() ;
//	public UserModel findById(String userId);
	public int  saveLearner(LearnerModel learnermodel);
//	public int  deleteUserProfile(UserModel usermodel);
//	public int  updateUserProfile(UserModel usermodel);
	public int delete1Learner(int userId);


}
