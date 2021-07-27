package com.atos.eduhub.service.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.eduhub.dao.UserDao;
import com.atos.eduhub.model.User;
import com.atos.eduhub.model.UserModel;
import com.atos.eduhub.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required = true)
	private UserDao userDAO;

	@Override
	public User addUser(User newUser) {
		newUser.setUserName("Team4 - Add User");
		newUser.setCreatedOn(Timestamp.valueOf(LocalDateTime.now()));
		newUser.setLastLogin(Timestamp.valueOf(LocalDateTime.now()));
		return newUser;
	}

	@Override
	public User updateUser(int id, User updateUser) {
		if (id == 1) {
			updateUser.setUserName("Team4 - Update User 1");
			updateUser.setPassword(updateUser.getPassword());
			updateUser.setLastLogin(Timestamp.valueOf("2018-11-12 01:02:03.123456"));

		} else {
			updateUser.setUserName("Team4 - Update User non-1");
		}

		return updateUser;
	}

	@Override
	public String deleteUser(int id) {
		return "Deleted id" + id;
	}

	@Override
	public List<User> getAllUser() {
		List<User> getUser = new ArrayList<User>();
		User user1 = new User();
		user1.setId(5);
		user1.setUserName("Testname5");
		user1.setPassword("passwrd5");
		user1.setFirstName("Tuserfn5");
		user1.setSecondName("Tusersn5");
		user1.setEmailId("Tusermail5@gmail.com");
		user1.setMobile("+6167778855");
		user1.setLocation("India");
		user1.setDesignation("Lead");
		user1.setExperience(5);
		user1.setPrimarySkills("Python");
		user1.setSecondarySkills("dotnet");
		user1.setRole("Tester");
		user1.setCreatedOn(Timestamp.valueOf(LocalDateTime.now()));
		user1.setLastLogin(Timestamp.valueOf(LocalDateTime.now()));
		getUser.add(user1);

		User user2 = new User();
		user2.setId(7);
		user2.setUserName("Testname7");

		user2.setPassword("passwrd7");
		user2.setFirstName("Tuserfn7");
		user2.setSecondName("Tusersn7");
		user2.setEmailId("Tusermail7@gmail.com");
		user2.setMobile("+6167778833");
		user2.setLocation("Phoenix");
		user2.setDesignation("Seniorconsultant");
		user2.setExperience(6);
		user2.setPrimarySkills("C,Python");
		user2.setSecondarySkills("C++");
		user2.setRole("developer");
		user2.setCreatedOn(Timestamp.valueOf(LocalDateTime.now()));
		user2.setLastLogin(Timestamp.valueOf(LocalDateTime.now()));
		getUser.add(user2);
		return getUser;
	}

	@Override
	public User getUserById(int id) {
		User user = new User();
		user.setId(3);
		user.setUserName("Team4 - View User by ID");
		user.setPassword("Npasswrd3");
		user.setFirstName("Nuserfn3");
		user.setSecondName("Nusersn3");
		user.setEmailId("Nusermail3@gmail.com");
		user.setMobile("+6177775595");
		user.setLocation("Sydney");
		user.setDesignation("Developer");
		user.setExperience(4);
		user.setPrimarySkills("mainframe");
		user.setSecondarySkills("Java");
		user.setRole("Learner");
		user.setCreatedOn(Timestamp.valueOf("2018-11-12 01:02:03.123456789"));
		user.setLastLogin(Timestamp.valueOf(LocalDateTime.now()));
		return user;

	}

	@Override
	public List<UserModel> findAll() {
		List<UserModel> userList = new ArrayList<>();

		for (Map<String, Object> eachresponse : userDAO.findAll()) {
			UserModel usermodel = new UserModel();
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
		return userDAO.saveUserProfile(usermodel) != 0 ? "Succesfully Saved " + usermodel.getUserId()
				: "Unsuccesful" + usermodel.getUserId();
	}

	@Override
	public String deleteUserProfile(UserModel usermodel) {
		return userDAO.deleteUserProfile(usermodel) != 0 ? "Deleted Succesfully  " + usermodel.getUserId()
				: " Deletion Unsuccesful " + usermodel.getUserId();
	}

	@Override
	public String updateUserProfile(UserModel usermodel) {
		return userDAO.updateUserProfile(usermodel) != 0 ? "Updated Successfully " + usermodel.getUserId()
				: "Failed to Update " + usermodel.getUserId();
	}

}
