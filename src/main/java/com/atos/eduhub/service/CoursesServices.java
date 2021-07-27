package com.atos.eduhub.service;

import java.util.ArrayList;

import com.atos.eduhub.model.Course;

public interface CoursesServices {

	public Course addCourse(Course course);

	public Course updateCourse(int courseid, Course updcourse);

	public String deleteCourse(int courseid);

	public Course getCourseById(int courseid);

	public ArrayList<Course> getAllCourses();

}
