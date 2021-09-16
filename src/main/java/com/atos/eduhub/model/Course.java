package com.atos.eduhub.model;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class Course {

	private int courseId;
	private String courseName;
	private String courseDesc;
	private String skillReqd;
	private LocalDateTime createdOn;
	private LocalDateTime lastUpdatedOn;

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

	public void setcreatedOn() {

		this.createdOn = LocalDateTime.now();
	}

	public void setcreatedOn(LocalDateTime createdon) {

		this.createdOn = createdon;
	}

	public LocalDateTime getcreatedOn() {

		return createdOn;
	}

	public void setLastUpdatedOn() {

		this.lastUpdatedOn = LocalDateTime.now();

	}

	public void setLastUpdatedOn(LocalDateTime lastUpdatedOn) {

		this.lastUpdatedOn = lastUpdatedOn;

	}

	public LocalDateTime getLastUpdatedOn() {
		return lastUpdatedOn;
	}

}
