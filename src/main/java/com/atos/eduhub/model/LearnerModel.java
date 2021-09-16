package com.atos.eduhub.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.time.LocalDateTime;

public class LearnerModel implements Serializable{
	
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

	
	

	public LearnerModel() {
		super();
	}
	
	public LearnerModel(int requestId, int userId, String role, int courseId, int rmid, int approvalId,
			String approvalStatus, String statusMessage, int assignmentId, String assignmentStatus,
			String assignmentStatusMessage, String learnerDescription, String learnerScore, LocalDateTime lastUpdatedOn) 
	{
		super();
		this.requestId = requestId;
		this.userId = userId;
		this.role = role;
		this.courseId = courseId;
		this.rmid = rmid;
		this.approvalId = approvalId;
		this.approvalStatus = approvalStatus;
		this.statusMessage = statusMessage;
		this.assignmentId = assignmentId;
		this.assignmentStatus = assignmentStatus;
		this.assignmentStatusMessage = assignmentStatusMessage;
		this.learnerDescription = learnerDescription;
		this.learnerScore = learnerScore;
		this.lastUpdatedOn = lastUpdatedOn;
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
	
	public void setLastupdatedon() {
		this.lastUpdatedOn = LocalDateTime.now();
	}

	public void setLastUpdatedOn(LocalDateTime lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LearnerModel [requestId=");
		builder.append(requestId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", role=");
		builder.append(role);
		builder.append(", courseId=");
		builder.append(courseId);
		builder.append(", rmid=");
		builder.append(rmid);
		builder.append(", approvalId=");
		builder.append(approvalId);
		builder.append(", approvalStatus=");
		builder.append(approvalStatus);
		builder.append(", statusMessage=");
		builder.append(statusMessage);
		builder.append(", assignmentId=");
		builder.append(assignmentId);
		builder.append(", assignmentStatus=");
		builder.append(assignmentStatus);
		builder.append(", assignmentStatusMessage=");
		builder.append(assignmentStatusMessage);
		builder.append(", learnerDescription=");
		builder.append(learnerDescription);
		builder.append(", learnerScore=");
		builder.append(learnerScore);
		builder.append(", lastUpdateOn=");
		builder.append(lastUpdatedOn);
		builder.append("]");
		return builder.toString();
	}
	

}
