package com.atos.eduhub.service;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Approval;

public interface ApprovalService {
	public Approval addApproval(Approval approval);
	public Approval editApproval(Approval approval);
	public void deleteApproval();
	public void viewApproval();
	public void viewAllApprovals();
	public void deleteAllApprovals();

}
