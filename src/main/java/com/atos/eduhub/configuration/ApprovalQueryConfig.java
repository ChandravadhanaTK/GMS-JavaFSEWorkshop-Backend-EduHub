package com.atos.eduhub.configuration;

public final class ApprovalQueryConfig {

//	Queries for Approval handling

	public static final String DELETE_ALL_APPROVALS = "delete from approval";
	public static final String SHOW_ALL_APPROVALS="select * from approval";
	public static final String INSERT_APPROVAL = "insert into approval(approvalid, requestid, rmid, approvalstatus, approvalstatusmessage, createdon, lastupdatedon) values(?, ?, ?, ?, ?, ?, ?)";
	public static final String FETCH_APPROVAL_BY_ID = "select approvalid, requestid, rmid, approvalstatus, approvalstatusmessage, createdon, lastupdatedon from approval where approvalid = ?"; 
	public static final String DELETE_APPROVAL_BY_ID = "delete from approval where approvalid = ?";
}
