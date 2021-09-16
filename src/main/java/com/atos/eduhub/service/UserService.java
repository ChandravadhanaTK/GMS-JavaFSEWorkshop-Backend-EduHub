package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atos.eduhub.model.User;
import com.atos.eduhub.model.UserModel;

@Service
public interface UserService {
	public String addUser(User newUser);

	public String updateUser(int id, User updUser);

	public String deleteUser(int id);

	public List<User> getAllUser();

	public User getUserById(int id);

	public String deleteAllUsers();

}
