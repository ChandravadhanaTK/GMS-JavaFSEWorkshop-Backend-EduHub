package com.atos.eduhub.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.RowMapper;

import com.atos.eduhub.model.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User usermodel= new User();
		usermodel.setId(rs.getInt("id"));
		usermodel.setUserName(String.valueOf(rs.getString("userName")));
		usermodel.setPassword(String.valueOf(rs.getString("password")));
		usermodel.setFirstName(String.valueOf(rs.getString("firstName")));
		usermodel.setSecondName(String.valueOf(rs.getString("secondName")));
		usermodel.setEmailId(String.valueOf(rs.getString("emailID")));
		usermodel.setMobile(String.valueOf(rs.getString("mobile")));
		usermodel.setLocation(String.valueOf(rs.getString("location")));
		usermodel.setDesignation(rs.getString("designation"));
		usermodel.setExperience(rs.getInt("experience"));
		usermodel.setPrimarySkills(String.valueOf(rs.getString("primarySkills")));
		usermodel.setSecondarySkills(String.valueOf(rs.getString("secondarySkills")));
		usermodel.setRole(String.valueOf(rs.getString("role")));
		usermodel.setCreatedOn(LocalDateTime.now());
		usermodel.setLastLogin(LocalDateTime.now());
		return usermodel;
	}

}
