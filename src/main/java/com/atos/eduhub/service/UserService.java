package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.User;


import org.springframework.stereotype.Service;

import com.atos.eduhub.model.UserModel;

@Service
public interface UserService {
	public String addUser(User newUser);

	public String updateUser(int id, User updUser);

	public String deleteUser(int id, User delUser);

	public List<User> getAllUser();

	public User getUserById(int id);


}
