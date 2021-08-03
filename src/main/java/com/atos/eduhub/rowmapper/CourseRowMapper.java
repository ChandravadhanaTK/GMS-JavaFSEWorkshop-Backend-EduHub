package com.atos.eduhub.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.jdbc.core.RowMapper;

import com.atos.eduhub.model.Course;

public class CourseRowMapper implements RowMapper<Course> {
	
	@Override
	public Course mapRow(ResultSet rs, int rownum) throws SQLException
	{
		Course course = new Course();
		course.setCourseId(rs.getInt("courseid"));
		
		course.setCourseName(String.valueOf(rs.getString("coursename")));
		course.setCourseDesc(String.valueOf(rs.getString("coursedesc")));
		course.setSkillReqd(String.valueOf(rs.getString("skillrequired")));
		course.setcreatedOn(rs.getTimestamp("createdon"));
		course.setLastUpdatedOn(rs.getTimestamp("lastupdatedon"));
		
		return course;
			
	}
	

}
