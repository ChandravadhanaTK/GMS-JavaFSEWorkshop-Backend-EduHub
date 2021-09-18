package com.atos.eduhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.atos.eduhub.model.User;
import com.atos.eduhub.service.UserService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/eduhubapi/v1")
public class UserController {

	@Autowired(required = true)
	UserService userService;

	// Add REST API User - PUT Http Request
	/*
	 * http://localhost:8080/eduhubapi/v1/user { "id": 9, "userName": "Testname9",
	 * "password": "passwrd9", "firstName": "Tuserfn9", "secondName": "Tusersn9",
	 * "emailId": "Tusermail9@gmail.com", "mobile": "+6197778855", "location":
	 * "India", "designation": "Consultant", "experience": 9, "primarySkills":
	 * "Python", "secondarySkills": "dotnet", "role": "Approver" }
	 */
	@PutMapping("/user")
	public String addUser(@RequestBody User newUser) {
		return userService.addUser(newUser);
	}

	// Edit/Update REST API User
	@PutMapping("/user/{id}")
	public String updateUser(@PathVariable(name="id") int id,@RequestBody User updUser) {
		return userService.updateUser(id, updUser);
	}

	// Delete REST API User
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable(value = "id") int id) {
		return userService.deleteUser(id);
	}

	//Delete Rest API for All Users
	@DeleteMapping("/users")
	@ResponseBody
	public String deleteAllUsers() {
		return userService.deleteAllUsers();
	}

	// Get all REST API User
	@GetMapping("/user")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	// Get REST API User based on User ID
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable(value = "id") int id) {
		return userService.getUserById(id);
	}

}
