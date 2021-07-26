package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.User;


import org.springframework.stereotype.Service;

import com.atos.eduhub.model.UserModel;

@Service
public interface UserService {
	public User addUser(User newUser);

	public User updateUser(int id, User updateUser);

	public String deleteUser(int id);

	public List<User> getAllUser();

	public User getUserById(int id);


	public List<UserModel> findAll();
	public UserModel findById(String userId);
	public String  saveUserProfile(UserModel usermodel);
	public String  deleteUserProfile(UserModel usermodel);
	public String  updateUserProfile(UserModel usermodel);
	
}
