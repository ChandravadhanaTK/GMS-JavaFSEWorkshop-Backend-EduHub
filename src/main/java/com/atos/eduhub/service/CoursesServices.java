package com.atos.eduhub.service;

import java.util.ArrayList;
import java.util.List;

import com.atos.eduhub.model.Course;

public interface CoursesServices {

	public Course addCourse(Course course);

	public Course updateCourse(int courseid, Course updcourse);

	public String deleteCourse(int courseid);

	public Course getCourseById(int courseid);

	public ArrayList<Course> getAllCourses();
	
	public String saveCourse(Course course);

	public String updateCoursebyid(Course course);
	
	public String deleteCoursebyid(int courseid);
	
	public Course selectCoursebyid(int courseid);
	
	public List<Course> selectAllCourse();
	
	public String deleteAll();
	
	


}
