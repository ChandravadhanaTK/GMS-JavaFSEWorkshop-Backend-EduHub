package com.atos.eduhub.service;

import java.util.List;

import com.atos.eduhub.model.Approval;

public interface ApprovalService {
	public Approval addApproval(Approval approval);

	public String editApproval(Approval approval);

	public String deleteOneApproval(int approvalId);

	public Approval viewOneApproval(int approvalId);

	public List<Approval> viewAllApprovals();

	public String deleteAllApprovals();

}
