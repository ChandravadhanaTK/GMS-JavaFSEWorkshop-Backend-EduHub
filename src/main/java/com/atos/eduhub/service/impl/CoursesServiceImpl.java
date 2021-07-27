package com.atos.eduhub.service.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Course;
import com.atos.eduhub.service.CoursesServices;

@Component
public class CoursesServiceImpl implements CoursesServices {

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
		course.setcreatedOn(Timestamp.valueOf(LocalDateTime.now()));
		course.setLastUpdatedOn(Timestamp.valueOf(LocalDateTime.now()));
		return course;

	}

	public ArrayList<Course> getAllCourses() {
		ArrayList<Course> getCourse = new ArrayList<Course>();

		Course course1 = new Course();
		course1.setCourseId(1);
		course1.setCourseName("Big Data");
		course1.setCourseDesc("Big data - anlaytics");
		course1.setSkillReqd("BIG");
		course1.setcreatedOn(Timestamp.valueOf(LocalDateTime.now()));
		course1.setLastUpdatedOn(Timestamp.valueOf(LocalDateTime.now()));

		getCourse.add(course1);

		Course course2 = new Course();
		course2.setCourseId(2);
		course2.setCourseName("RestController");
		course2.setCourseDesc("Restcontroller Workshop");
		course2.setSkillReqd("Rest");
		course2.setcreatedOn(Timestamp.valueOf(LocalDateTime.now()));
		course2.setLastUpdatedOn(Timestamp.valueOf(LocalDateTime.now()));

		getCourse.add(course2);

		return getCourse;

	}

}
