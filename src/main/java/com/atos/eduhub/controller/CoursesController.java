package com.atos.eduhub.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Course;
import com.atos.eduhub.service.CoursesServices;

@RestController
@RequestMapping("/eduhubapi/v1")

public class CoursesController {

	@Autowired
	CoursesServices coursesservices;

	// Add Courses -REST API
	@PutMapping("/Course")
	public Course addCourse(@RequestBody Course course) {
		System.out.println("Course Added");
		return coursesservices.addCourse(course);

	}

	@GetMapping("/Course")
	public Course getCourse() {
		System.out.println("Inside Put");
		Course course = new Course();
		course.setCourseId(1);
		course.setCourseName("Spring");
		course.setCourseDesc("Sring Boot for Workshop");
		course.setSkillReqd("MVC");
		// course.setCreatedOn("2021-07-16T12:02:02.552+00:00");
		// course.setLastUpdatedon("2021-07-16T12:02:02.552+00:00");
		return course;

	}

	@DeleteMapping("/Course/{courseid}")
	public String deleteCourse(@PathVariable(value = "courseid") int courseid) {
		return "Deleted Course id  " + courseid;
	}

	// Edit/Update Courses
	@PutMapping("/Course/{courseid}")
	public Course updateCourse(@PathVariable(name = "courseid") int courseid, @RequestBody Course updcourse) {
		return coursesservices.updateCourse(courseid, updcourse);
	}

	// Get one course details REST API Demo
	@GetMapping("/Course/{courseid}")
	public Course getCourseById(@PathVariable(value = "courseid") int courseid) {
		return coursesservices.getCourseById(courseid);
	}

	// Get all REST API Demo
	@GetMapping("/Courses")
	public ArrayList<Course> getAllCourses() {
		return coursesservices.getAllCourses();
	}

}
