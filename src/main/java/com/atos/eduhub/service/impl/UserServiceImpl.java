package com.atos.eduhub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.atos.eduhub.model.User;
import com.atos.eduhub.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Override
	public User addUser(User newUser) {
		newUser.setUsername("Team4 - Add User");
		return newUser;						
		}

	@Override
	public User updateUser(int id, User updateUser) {
		if(id==1) {
			updateUser.setUsername("Team4 - Update User 1");	
			updateUser.setPassword(updateUser.getPassword());
			updateUser.setFirstname(updateUser.getFirstname());
			updateUser.setLast_login(Timestamp.valueOf("2018-11-12 01:02:03.123456789"));
						
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
		user1.setCreated_on(Timestamp.valueOf(LocalDateTime.now()));
		user1.setLast_login(Timestamp.valueOf(LocalDateTime.now()));
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
		user2.setCreated_on(Timestamp.valueOf(LocalDateTime.now()));
		user2.setLast_login(Timestamp.valueOf(LocalDateTime.now()));
		getUser.add(user2);		
		return getUser;
	}

	@Override
	public User getUserById(int id) {
		User user = new User();
		user.setId(3);
		user.setUsername("Team4 - View User by ID");	
		user.setPassword("Npasswrd3");
		user.setFirstname("Nuserfn3");
		user.setSecondname("Nusersn3");
		user.setEmailid("Nusermail3@gmail.com");
		user.setMobile("+6177775595");
		user.setLocation("Sydney");
		user.setDesignation("Developer");
		user.setExperience(4);
		user.setPrimaryskills("mainframe");
		user.setSecondaryskills("Java");
		user.setRole("Learner");
		user.setCreated_on(Timestamp.valueOf("2018-11-12 01:02:03.123456789"));
		user.setLast_login(Timestamp.valueOf(LocalDateTime.now()));
		return user;
		
	}

}
