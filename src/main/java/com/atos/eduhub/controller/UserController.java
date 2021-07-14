package com.atos.eduhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	 * http://localhost:8080/user { "id": 1, "name": "Team4" }
	 */
	@PutMapping("/user")
	public User addUser(@RequestBody User newUser) {
		System.out.println("Put received for addUser() for id "+ newUser.getId());
		return userService.addUser(newUser);
	}

	// Edit/Update REST API User
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable(name="id") int id,@RequestBody User updateUser) {
		System.out.println("Put received for updateUser() for id "+ updateUser.getId());
		return userService.updateUser(id, updateUser);
	}

	// Delete REST API User
	@DeleteMapping("/user/{id}")
	//public  ResponseEntity<User> deleteUser(@PathVariable(value="id") int id) {
	   public  String  deleteUser(@PathVariable(value="id") int id) {
	   String deleteString = userService.deleteUser(id);
	   System.out.println("Delete successful for deleteUser() for id "+ id);
	//    return ResponseEntity.ok().build();
		return "Deleted successfully: " + id;
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
