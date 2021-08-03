package com.atos.eduhub.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.time.LocalDateTime;

public class Learner implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int requestId;
	private int userId;
	private String role;
	private int courseId;
	private int rmid;
	private int approvalId;
	private String approvalStatus;
	private String statusMessage;
	private int assignmentId;
	private String assignmentStatus;
	private String assignmentStatusMessage;
	private String learnerDescription;
	private String learnerScore;
	private LocalDateTime lastUpdatedOn;


	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getRmid() {
		return rmid;
	}

	public void setRmid(int rmid) {
		this.rmid = rmid;
	}

	public int getApprovalId() {
		return approvalId;
	}

	public void setApprovalId(int approvalId) {
		this.approvalId = approvalId;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public int getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getAssignmentStatus() {
		return assignmentStatus;
	}

	public void setAssignmentStatus(String assignmentStatus) {
		this.assignmentStatus = assignmentStatus;
	}

	public String getAssignmentStatusMessage() {
		return assignmentStatusMessage;
	}

	public void setAssignmentStatusMessage(String assignmentStatusMessage) {
		this.assignmentStatusMessage = assignmentStatusMessage;
	}

	public String getLearnerDescription() {
		return learnerDescription;
	}

	public void setLearnerDescription(String learnerDescription) {
		this.learnerDescription = learnerDescription;
	}

	public String getLearnerScore() {
		return learnerScore;
	}

	public void setLearnerScore(String learnerScore) {
		this.learnerScore = learnerScore;
	}

	public LocalDateTime getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	
	public void setLastupdatedOn() {
		this.lastUpdatedOn = LocalDateTime.now();
	}

	public void setLastUpdatedOn(LocalDateTime lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	

	
}
