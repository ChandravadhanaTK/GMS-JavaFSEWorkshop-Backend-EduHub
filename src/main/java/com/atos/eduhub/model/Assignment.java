package com.atos.eduhub.model;

import org.springframework.stereotype.Component;

@Component
public class Assignment {

	private int assignmentID;

	private int userID;

	private String assignmentStatus;

	private String assigmentStatusMessage;

	private String createdOn;

	private String lastUpdatedOn;

	public int getAssignmentID() {
		return assignmentID;
	}

	public void setAssignmentID(int assignmentID) {
		this.assignmentID = assignmentID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getAssignmentStatus() {
		return assignmentStatus;
	}

	public void setAssignmentStatus(String assignmentStatus) {
		this.assignmentStatus = assignmentStatus;
	}

	public String getAssigmentStatusMessage() {
		return assigmentStatusMessage;
	}

	public void setAssigmentStatusMessage(String assigmentStatusMessage) {
		this.assigmentStatusMessage = assigmentStatusMessage;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(String lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

}
