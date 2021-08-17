package com.atos.eduhub.dao;

import java.util.List;

import com.atos.eduhub.model.Course;

public interface CoursesDao {
	public int saveCourse(Course course);
	
	public int updateCoursebyid(Course course);
	
	public int deleteCoursebyid(int courseid);
	
	public Course selectCoursebyid(int courseid);
	
	public List<Course> selectAllCourse();
	
	public int deleteAll();
	
	




}
