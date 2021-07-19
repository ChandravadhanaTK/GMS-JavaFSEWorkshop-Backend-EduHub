package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.User;

@Component
public interface UserService {

	public User addUser(User newUser);

	public User updateUser(int id, User updateUser);

	public String deleteUser(int id);

	public List<User> getAllUser();

	public User getUserById(int id);

}
