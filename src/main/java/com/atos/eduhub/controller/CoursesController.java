package com.atos.eduhub.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/eduhub")

public class CoursesController {
		
		@Autowired
		CoursesServices coursesservices;
			
			//Add Courses -REST API
			
		@PutMapping("/Courses")
					//public String addDemo()
			public Course addCourse(@RequestBody Course course)
			{
				System.out.println("Course Added");
				return coursesservices.addCourse(course);
			
				
			}	
			
			@GetMapping("/Coursesget")
			//public String addDemo()
			public Course getCourse()
			{
				System.out.println("Inside Put");
				Course course=new Course();
				course.setCourseid(1);
				course.setCoursename("Spring");
				course.setCoursedesc("Sring Boot for Workshop");
				course.setSkillreqd("MVC");
				course.setCreatedon("2021-07-14:05:00:01:12345");
				course.setLastUpdatedon("2021-07-14:05:01:01:12345");
				return course;
				
			}	
					
			@DeleteMapping("courses/{courseid}")
			
			public String deleteCourse(@PathVariable(value=	"courseid") int courseid)
			
			{
				return "Deleted Course id  " +  courseid;
				
			}
			
			// Edit/Update Courses

			@PutMapping("/courses/{courseid}")
			public Course updateCourse(@PathVariable(name="courseid") int courseid, @RequestBody Course updcourse){

				return coursesservices.updateCourse(courseid,updcourse);
				

			}
			
}		


/*
			// Edit/Update REST API Demo

			@PutMapping("/demo/{id}")

			public Demo updateDemo(@PathVariable(name="id") int id, @RequestBody Demo updateDemo) {

				return demoService.updateDemo(id, updateDemo);

			}


			// Delete REST API Demo

			@DeleteMapping("/demo/{id}")

			public ResponseEntity<Demo> deleteDemo(@PathVariable(value="id") int id) {

				String deleteString = demoService.deleteDemo(id);

				return ResponseEntity.ok().build();

			}



			// Get all REST API Demo

			@GetMapping("/demo")

			public List<Demo> getAllDemo() {

				return demoService.getAllDemo();

			}



			// Get all REST API Demo

			@GetMapping("/demo/{id}")

			public Demo getDemoById(@PathVariable(value="id") int id) {

				return demoService.getDemoById(id);

			}
*/




