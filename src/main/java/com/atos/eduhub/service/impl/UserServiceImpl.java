package com.atos.eduhub.service.impl;

import java.util.ArrayList;
import java.util.List;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.atos.eduhub.dao.UserDao;
import org.springframework.stereotype.Component;
import com.atos.eduhub.model.User;
import com.atos.eduhub.service.UserService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.eduhub.dao.UserDao;
import com.atos.eduhub.model.UserModel;
import com.atos.eduhub.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao userDao;

	@Override
	public String addUser(User newUser) {
		newUser.setCreatedOn(LocalDateTime.now());
		newUser.setLastLogin(LocalDateTime.now());
		return userDao.addUser(newUser)!=0? "User added succesfully "+newUser.getId():"Add User Unsuccesful"+newUser.getId();
	}

	@Override
	public String updateUser(int id, User updUser) {

		LocalDateTime lt= LocalDateTime.parse("2018-12-30T19:34:50.63");

		updUser.setCreatedOn(lt);
		updUser.setLastLogin(LocalDateTime.now());
		return  userDao.updateUser(id,updUser)!=0? "User updated successfully "+updUser.getId():"Failed to Update User"+updUser.getId();
	}


	@Override
	public String deleteUser(int id, User delUser) {
		return userDao.deleteUser(id,delUser)!=0? "User deleted Succesfully  "+delUser.getId():" Delete User Unsuccesful "+delUser.getId();
	}

		@Override
	public List<User> getAllUser() {
			List<User> getUser = new ArrayList<User>();
			for(Map<String, Object> eachresponse:userDao.getAllUser()) {
				User user1 = new User();
				user1.setId(Integer.valueOf(String.valueOf((eachresponse.get("id")))));
				user1.setUserName(String.valueOf(eachresponse.get("userName")));
				user1.setPassword(String.valueOf(eachresponse.get("password")));
				user1.setFirstName(String.valueOf(eachresponse.get("firstName")));
				user1.setSecondName(String.valueOf(eachresponse.get("secondName")));
				user1.setEmailId(String.valueOf(eachresponse.get("emailID")));
				user1.setMobile(String.valueOf(eachresponse.get("mobile")));
				user1.setLocation(String.valueOf(eachresponse.get("location")));
				user1.setDesignation(String.valueOf(eachresponse.get("designation")));
				user1.setExperience(Integer.valueOf(String.valueOf((eachresponse.get("experience")))));
				user1.setPrimarySkills(String.valueOf(eachresponse.get("primarySkills")));
				user1.setSecondarySkills(String.valueOf(eachresponse.get("secondarySkills")));
				user1.setRole(String.valueOf(eachresponse.get("role")));
				user1.setCreatedOn(LocalDateTime.now());
				user1.setLastLogin(LocalDateTime.now());
				getUser.add(user1);
		}
		return getUser;
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

}