package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atos.eduhub.model.UserModel;

@Service
public interface UserService {

	public List<UserModel> findAll();
	public UserModel findById(String userId);
	public String  saveUserProfile(UserModel usermodel);
	public String  deleteUserProfile(UserModel usermodel);
	public String  updateUserProfile(UserModel usermodel);
	
}
