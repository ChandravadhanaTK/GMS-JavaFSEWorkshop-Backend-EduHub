package com.atos.eduhub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.eduhub.dao.UserDAO;
import com.atos.eduhub.model.UserModel;
import com.atos.eduhub.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	public List<UserModel> findAll() {
		List<UserModel> userList=new ArrayList<>();
		
		for(Map<String, Object> eachresponse:userDAO.findAll()) {
			UserModel usermodel= new UserModel();
			usermodel.setUserId(String.valueOf(eachresponse.get("userid")));
			usermodel.setFirstName(String.valueOf(eachresponse.get("firstname")));
			usermodel.setLastName(String.valueOf(eachresponse.get("lastname")));
			usermodel.setExperience(Float.valueOf(String.valueOf(eachresponse.get("experience"))));
			usermodel.setDesignation(eachresponse.get("designation").toString());
			userList.add(usermodel);
	}
		return userList;
	}

	@Override
	public UserModel findById(String userId) {
		return userDAO.findById(userId);
	}

	@Override
	public String saveUserProfile(UserModel usermodel) {
		return userDAO.saveUserProfile(usermodel)!=0? "Succesfully Saved "+usermodel.getUserId():"Unsuccesful"+usermodel.getUserId();
	}

	@Override
	public String deleteUserProfile(UserModel usermodel) {
		return userDAO.deleteUserProfile(usermodel)!=0? "Deleted Succesfully  "+usermodel.getUserId():" Deletion Unsuccesful "+usermodel.getUserId();
	}

	@Override
	public String updateUserProfile(UserModel usermodel) {
		return  userDAO.updateUserProfile(usermodel)!=0? "Updated Successfully "+usermodel.getUserId():"Failed to Update "+usermodel.getUserId();
	}

	
}
