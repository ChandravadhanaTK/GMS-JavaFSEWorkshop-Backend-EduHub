package com.atos.eduhub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.atos.eduhub.model.User;
import com.atos.eduhub.service.UserService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;

@Component
public class UserServiceImpl implements UserService {

	@Override
	public User addUser(User newUser) {
		newUser.setId(1);
		newUser.setUsername("Team4 - Add User 1");
		newUser.setPassword("passwrd1");
		newUser.setFirstname("Tuserfn1");
		newUser.setSecondname("Tusersn1");
		newUser.setEmailid("Tusermail1@gmail.com");
		newUser.setMobile("+6167775555");
		newUser.setLocation("Melbourne");
		newUser.setDesignation("Manager");
		newUser.setExperience(8);
		newUser.setPrimaryskills("mainframe");
		newUser.setSecondaryskills("Java");
		newUser.setRole("admin");
		newUser.setCreated_on("2021-07-01");
		newUser.setLast_login("2021-07-01");
				
		return newUser;
	}

	@Override
	public User updateUser(int id, User updateUser) {
		if(id==1) {
			updateUser.setUsername("Team4 - Update User 1");	
			updateUser.setPassword("Npasswrd1");
			updateUser.setFirstname("Nuserfn1");
			updateUser.setSecondname("Nusersn1");
			updateUser.setEmailid("Nusermail1@gmail.com");
			updateUser.setMobile("+6177775555");
			updateUser.setLocation("Sydney");
			updateUser.setDesignation("Developer");
			updateUser.setExperience(1);
			updateUser.setPrimaryskills("mainframe");
			updateUser.setSecondaryskills("Java");
			updateUser.setRole("Learner");
			updateUser.setCreated_on("2021-07-05");
			updateUser.setLast_login("2021-07-05");
			
		} else {
			updateUser.setUsername("Team4 - Update User non-1");
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
		user1.setUsername("Testname5");
		user1.setPassword("passwrd5");
		user1.setFirstname("Tuserfn5");
		user1.setSecondname("Tusersn5");
		user1.setEmailid("Tusermail5@gmail.com");
		user1.setMobile("+6167778855");
		user1.setLocation("India");
		user1.setDesignation("Lead");
		user1.setExperience(5);
		user1.setPrimaryskills("Python");
		user1.setSecondaryskills("dotnet");
		user1.setRole("Tester");
		user1.setCreated_on("2021-07-11");
		user1.setLast_login("2021-07-11");
		getUser.add(user1);

		User user2 = new User();
		user2.setId(7);
		user2.setUsername("Testname7");
		user2.setPassword("passwrd7");
		user2.setFirstname("Tuserfn7");
		user2.setSecondname("Tusersn7");
		user2.setEmailid("Tusermail7@gmail.com");
		user2.setMobile("+6167778833");
		user2.setLocation("Phoenix");
		user2.setDesignation("Seniorconsultant");
		user2.setExperience(6);
		user2.setPrimaryskills("C,Python");
		user2.setSecondaryskills("C++");
		user2.setRole("developer");
		user2.setCreated_on("2021-07-10");
		user2.setLast_login("2021-07-10");
		getUser.add(user2);		
		return getUser;
	}

	@Override
	public User getUserById(int id) {
		User user = new User();
		return user;
	}

}
