package com.atos.eduhub.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Course;
import com.atos.eduhub.service.CoursesServices;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/eduhubapi/v1")

public class CoursesController {

	@Autowired
	CoursesServices coursesservices;

	// Add Courses -REST API
	@PutMapping("/Course")
	
	public String addCourse(@RequestBody Course course) {
		System.out.println("Course Added"+ course);
		System.out.println(course.getCourseId());
		System.out.println(course.getCourseName());
		System.out.println(course.getCourseDesc());
		System.out.println(course.getSkillReqd());
		System.out.println(course.getcreatedOn());
		System.out.println(course.getLastUpdatedOn());
		return coursesservices.saveCourse(course);

	}

	@GetMapping("/Courses")
	public Course getCourse() {
		System.out.println("Inside Get");
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
	public String deleteCoursebyid(@PathVariable(value = "courseid") int courseid) {
		return coursesservices.deleteCoursebyid(courseid);
	}

	@DeleteMapping("/Course")
	public String deleteAll() {

		return coursesservices.deleteAll();
	}

	// Edit/Update Courses
	@PutMapping("/Course/{courseid}")
	
	public String updateCourse(@PathVariable(name = "courseid") int courseid, @RequestBody Course updcourse) {
	
		System.out.println("updaating course....");
		return coursesservices.updateCoursebyid(updcourse);
	}

	// Get one course details REST API Demo
	@GetMapping("/Course/{courseid}")
	public Course getCourseById(@PathVariable(value = "courseid") int courseid) {
		

		return coursesservices.selectCoursebyid(courseid);

	}

	// Get all REST API Demo
	@GetMapping("/Course")
	
	public List<Course> getAllCourses() {
	
		return coursesservices.selectAllCourse();
	}

}
