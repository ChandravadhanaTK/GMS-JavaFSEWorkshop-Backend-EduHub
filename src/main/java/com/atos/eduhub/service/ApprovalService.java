package com.atos.eduhub.service;

import com.atos.eduhub.model.Approval;

public interface ApprovalService {
	public Approval addApproval(Approval approval);
	public void editApproval();
	public void deleteApproval();
	public void viewApproval();
	public void viewAllApprovals();
	public String deleteAllApprovals();

}
