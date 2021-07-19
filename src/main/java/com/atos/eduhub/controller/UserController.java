package com.atos.eduhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.User;
import com.atos.eduhub.service.UserService;

@RestController
@RequestMapping("/eduhubapi/v1")
public class UserController {

	@Autowired(required = true)
	UserService userService;

	// Add REST API User - PUT Http Request
	/*
	 * http://localhost:8080/eduhubapi/v1/user {
        "id": 9,
        "username": "Testname9",
        "password": "passwrd9",
        "firstname": "Tuserfn9",
        "secondname": "Tusersn9",
        "emailid": "Tusermail9@gmail.com",
        "mobile": "+6197778855",
        "location": "India",
        "designation": "Consultant",
        "experience": 9,
        "primaryskills": "Python",
        "secondaryskills": "dotnet",
        "role": "Approver",
        "created_on": "2021-07-19T10:05:17.100+00:00",
        "last_login": "2021-07-19T10:05:17.100+00:00"
    }
	 */
	@PutMapping("/user")
	public User addUser(@RequestBody User newUser) {
		return userService.addUser(newUser);
	}

	// Edit/Update REST API User
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable(name="id") int id,@RequestBody User updateUser) {
		return userService.updateUser(id, updateUser);
	}

	// Delete REST API User
	@DeleteMapping("/user/{id}")
	public  String  deleteUser(@PathVariable(value="id") int id) {
	   	return "Delete for User with ID: " + id + " successful";
	}

	// Get all REST API User
	@GetMapping("/user")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	// Get  REST API User based on User ID
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable(value="id") int id) {
		return userService.getUserById(id);
	}

}
