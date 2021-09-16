package com.atos.eduhub.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Approval {
	private int approvalId;
	private int requestId;
	private int rmId;
	private String approvalStatus; //possible values are - Initiated, Approved, Rejected
	private String approvalStatusMessage;
	
	//private Timestamp createdOn; // "createdOn": "2021-07-01T09:27:00Z" <--- use this date format on PostMan.
	// changing from Timestamp to LocalDateTime
	private LocalDateTime createdOn; // "createdOn": "2021-07-01T09:27:00Z" <--- use this date format on PostMan.
	
	// private Timestamp lastUpdatedOn;
	// changing from Timestamp to LocalDateTime
	private LocalDateTime lastUpdatedOn;

	public int getApprovalId() {
		return approvalId;
	}

	public void setApprovalId(int approvalId) {
		this.approvalId = approvalId;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getRmId() {
		return rmId;
	}

	public void setRmId(int rmId) {
		this.rmId = rmId;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getApprovalStatusMessage() {
		return approvalStatusMessage;
	}

	public void setApprovalStatusMessage(String approvalStatusMessage) {
		this.approvalStatusMessage = approvalStatusMessage;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(LocalDateTime lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Override
	public String toString() {
		return "Approval [approvalId=" + approvalId + ", requestId=" + requestId + ", rmId=" + rmId
				+ ", approvalStatus=" + approvalStatus + ", approvalStatusMessage=" + approvalStatusMessage
				+ ", createdOn=" + createdOn + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}
}
