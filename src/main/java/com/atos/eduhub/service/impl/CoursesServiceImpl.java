package com.atos.eduhub.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atos.eduhub.dao.CoursesDao;
import com.atos.eduhub.model.Course;
import com.atos.eduhub.service.CoursesServices;

@Component
public class CoursesServiceImpl implements CoursesServices {
	
	@Autowired(required = true)
	private CoursesDao coursedao;

	@Override
	public Course addCourse(Course course) {

		return course;

	}

	@Override
	public String deleteCourse(int courseid) {

		return "Deleted id" + courseid;

	}

	@Override

	public Course updateCourse(int courseid, Course updcourse) {

		if (courseid == 1) {

			updcourse.setCourseName("Python");

		} else {

			updcourse.setCourseName("Data Science");

		}

		return updcourse;

	}

	public Course getCourseById(int courseid) {
		Course course = new Course();
		course.setCourseId(1);
		course.setCourseName("View Spring");
		course.setCourseDesc("Sring Boot for Workshop");
		course.setSkillReqd("MVC");
		course.setcreatedOn(LocalDateTime.now());
		course.setLastUpdatedOn(LocalDateTime.now());
		return course;

	}

	public ArrayList<Course> getAllCourses() {
		ArrayList<Course> getCourse = new ArrayList<Course>();

		Course course1 = new Course();
		course1.setCourseId(1);
		course1.setCourseName("Big Data");
		course1.setCourseDesc("Big data - anlaytics");
		course1.setSkillReqd("BIG");
		course1.setcreatedOn(LocalDateTime.now());
		course1.setLastUpdatedOn(LocalDateTime.now());

		getCourse.add(course1);

		Course course2 = new Course();
		course2.setCourseId(2);
		course2.setCourseName("RestController");
		course2.setCourseDesc("Restcontroller Workshop");
		course2.setSkillReqd("Rest");
		course2.setcreatedOn(LocalDateTime.now());
		course2.setLastUpdatedOn(LocalDateTime.now());
		getCourse.add(course2);

		return getCourse;

	}
	
	@Override
	public String saveCourse(Course course) {
		return coursedao.saveCourse(course) != 0 ? "New Course added succesfully " + course.getCourseId()
				: "Unsuccesful" + course.getCourseId();
	}
	
	@Override
	public String updateCoursebyid(Course updcourse) {
		
			return coursedao.updateCoursebyid(updcourse) != 0 ? "Course updated successfully " + updcourse.getCourseId()
		: "Unsuccesful" + updcourse.getCourseId();
	}
	
	public String deleteCoursebyid(int courseid) {
		return coursedao.deleteCoursebyid(courseid) != 0 ? "Course deleted successfully" : "Unsuccessful" + courseid;
	}
	
	public Course selectCoursebyid(int courseid) {
		return coursedao.selectCoursebyid(courseid);
	}
	
	public List<Course> selectAllCourse(){
		return coursedao.selectAllCourse();
	}
	
	public String deleteAll() {
		return coursedao.deleteAll() != 0 ? "All courses deleted successfully" : "Unsuccessful deletion";
	}

}
