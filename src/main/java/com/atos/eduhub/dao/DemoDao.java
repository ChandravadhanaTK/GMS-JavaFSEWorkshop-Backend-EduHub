package com.atos.eduhub.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.UserModel;

@Component
public interface DemoDao {
	public List<Map<String, Object>> findAll();

	//public UserModel findById(String userId);

	//public List<UserModel> findAllWithRowMapper();

	public int saveUserProfile(UserModel usermodel);

	public int deleteUserProfile(UserModel usermodel);

	public int updateUserProfile(UserModel usermodel);

}
