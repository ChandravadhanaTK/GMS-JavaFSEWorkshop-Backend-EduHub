package com.atos.eduhub.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Course {

	private int courseId;
	private String courseName;
	private String courseDesc;
	private String skillReqd;
	private Timestamp createdOn;
	private Timestamp lastUpdatedOn;

	public void setCourseId(int courseid) {

		this.courseId = courseid;

	}

	public int getCourseId() {

		return courseId;
	}

	public void setCourseName(String coursename) {

		this.courseName = coursename;

	}

	public String getCourseName() {

		return courseName;
	}

	public void setCourseDesc(String coursedesc) {

		this.courseDesc = coursedesc;

	}

	public String getCourseDesc() {

		return courseDesc;
	}

	public void setSkillReqd(String skillreqd) {

		this.skillReqd = skillreqd;

	}

	public String getSkillReqd() {

		return skillReqd;
	}

	public void setcreatedOn(Timestamp createdon) {

		this.createdOn = Timestamp.valueOf(LocalDateTime.now());

	}

	public Timestamp getcreatedOn() {

		return createdOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {

		this.lastUpdatedOn = Timestamp.valueOf(LocalDateTime.now());

	}

	public Timestamp getLastUpdatedOn() {
		return lastUpdatedOn;
	}

}
