package com.atos.eduhub.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.jdbc.core.RowMapper;

import com.atos.eduhub.model.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User usermodel= new User();
		usermodel.setId(rs.getInt("id"));
		usermodel.setUserName(rs.getString("userName"));
		usermodel.setPassword(rs.getString("password"));
		usermodel.setFirstName(rs.getString("firstName"));
		usermodel.setSecondName(rs.getString("secondName"));
		usermodel.setEmailId(rs.getString("emailID"));
		usermodel.setMobile(rs.getString("mobile"));
		usermodel.setLocation(rs.getString("location"));
		usermodel.setDesignation(rs.getString("designation"));
		usermodel.setExperience(rs.getInt("experience"));
		usermodel.setPrimarySkills(rs.getString("primarySkills"));
		usermodel.setSecondarySkills(rs.getString("secondarySkills"));
		usermodel.setRole(rs.getString("role"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss[.SSSSSS][.SSS]");
		String createdon = ((Timestamp) rs.getObject("CreatedOn")).toString();
		String lastlogin = ((Timestamp) rs.getObject("LastLogin")).toString();
		usermodel.setCreatedOn(LocalDateTime.parse(createdon, formatter));
		usermodel.setLastLogin(LocalDateTime.parse(lastlogin, formatter));

		return usermodel;
	}

}
