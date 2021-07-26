package com.atos.eduhub.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.atos.eduhub.model.UserModel;

public class UserRowMapper implements RowMapper<UserModel>{

	@Override
	public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		UserModel usermodel= new UserModel();
		usermodel.setUserId(String.valueOf(rs.getString("userid")));
		usermodel.setFirstName(String.valueOf(rs.getString("firstname")));
		usermodel.setLastName(String.valueOf(rs.getString("lastname")));
		usermodel.setExperience(rs.getFloat("experience"));
		usermodel.setDesignation(rs.getString("designation").toString());
		
		return usermodel;
	}

}
