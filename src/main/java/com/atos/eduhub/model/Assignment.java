package com.atos.eduhub.model;

public class Assignment {
 int assignmentId;
 int userid;
 String assignmentStatus;
 String assignmentStatusMessage;
 String created_on;
 String last_updated_on;
public int getAssignmentId() {
	return assignmentId;
}
public void setAssignmentId(int assignmentId) {
	this.assignmentId = assignmentId;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
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
public String getCreated_on() {
	return created_on;
}
public void setCreated_on(String created_on) {
	this.created_on = created_on;
}
public String getLast_updated_on() {
	return last_updated_on;
}
public void setLast_updated_on(String last_updated_on) {
	this.last_updated_on = last_updated_on;
}
 
}
