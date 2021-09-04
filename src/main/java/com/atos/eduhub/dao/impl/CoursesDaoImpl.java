package com.atos.eduhub.dao.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atos.eduhub.configuration.CourseQueryConfig;
import com.atos.eduhub.dao.CoursesDao;
import com.atos.eduhub.model.Course;
import com.atos.eduhub.rowmapper.CourseRowMapper;

@Repository
public class CoursesDaoImpl implements CoursesDao {

	@Autowired(required = true)
	private JdbcTemplate jdbcTemplate;

	/*
	 * @Value("${COURSE_SAVE}") private String course_save;
	 * 
	 * @Value("${COURSE_UPDATEBYID}") private String course_updateById;
	 * 
	 * @Value("${COURSE_DELETEBYID}") private String course_deleteById;
	 * 
	 * @Value("${COURSE_SELECTBYID}") private String course_selectById;
	 * 
	 * @Value("${COURSE_SELECTALL}") private String course_selectAllById;
	 */

	@Override
	public int saveCourse(Course course) {

		course.setcreatedOn(LocalDateTime.now());

		course.setLastUpdatedOn(LocalDateTime.now());
		System.out.println("Inside dao"+ course);

		// return jdbcTemplate.update(CourseQueryConfig.COURSE_SAVE, course.getCourseId(), course.getCourseName(),
	    return jdbcTemplate.update(CourseQueryConfig.COURSE_SAVE,course.getCourseName(),
				course.getCourseDesc(), course.getSkillReqd(), course.getcreatedOn(), course.getLastUpdatedOn());

	}

	@Override
	public int updateCoursebyid(Course course) {

		course.setLastUpdatedOn(LocalDateTime.now());

		System.out.println("in course dao impl to update...");

		return jdbcTemplate.update(CourseQueryConfig.COURSE_UPDATEBYID, course.getCourseName(), course.getCourseDesc(),
				course.getSkillReqd(), course.getLastUpdatedOn(), course.getCourseId());

	}

	@Override
	public int deleteCoursebyid(int courseid) {

		System.out.println("in course dao impl to delete...");

		return jdbcTemplate.update(CourseQueryConfig.COURSE_DELETEBYID, courseid);

	}

	@Override
	public Course selectCoursebyid(int courseid) {

		System.out.println("in course dao impl to select...");

		return jdbcTemplate.queryForObject(CourseQueryConfig.COURSE_SELECTBYID, new CourseRowMapper(),
				new Object[] { courseid });

	}

	@Override
	public List<Course> selectAllCourse() {

		return jdbcTemplate.query(CourseQueryConfig.COURSE_SELECTALL, new CourseRowMapper());

	}

	public int deleteAll() {
		return jdbcTemplate.update(CourseQueryConfig.COURSE_DELETEALL);
	}

}
