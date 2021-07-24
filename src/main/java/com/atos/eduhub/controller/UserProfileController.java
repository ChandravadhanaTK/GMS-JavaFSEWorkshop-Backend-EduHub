package com.atos.eduhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.UserModel;
import com.atos.eduhub.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/eduhubapi/v1") 
@Api(value="User Registration")
public class UserProfileController {
	
	@Autowired
	private UserService service;
	
	@ApiOperation(value = "List of Registered Users", response = List.class)
	@GetMapping("/allusers")
	public List<UserModel> findAll(){
		return service.findAll();
	}
	@GetMapping("/user/{userId}")
	public UserModel findById(@PathVariable(value="userId") String userId) {
		return service.findById(userId);
	}
	
	@PostMapping("/save")
	public String  saveUserProfile(@RequestBody UserModel usermodel) {
		return service.saveUserProfile(usermodel);
	}
	
	@PostMapping("/delete")
	public String  deleteUserProfile(@RequestBody  UserModel usermodel) {
		return service.deleteUserProfile(usermodel);
	}
	@PostMapping("/update")
	public String  updateUserProfile(@RequestBody UserModel usermodel) {
		return service.updateUserProfile(usermodel);
		
	}
	@GetMapping("/json")
	public UserModel returnJson() {
		return new UserModel();
	}

}
