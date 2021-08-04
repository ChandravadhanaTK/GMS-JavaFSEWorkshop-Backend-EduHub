package com.atos.eduhub.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.atos.eduhub.dao.impl.ApprovalDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Approval;
import com.atos.eduhub.service.ApprovalService;

@Component
public class ApprovalServiceImpl implements ApprovalService {
	@Autowired
	ApprovalDaoImpl approvalDaoImpl;
	@Override
	public Approval addApproval(Approval approval) {
		System.out.println("Approval object created for POST request:");
		System.out.println(approval);
		return approval;
	}

	@Override
	public Approval editApproval(Approval approval) {
		System.out.println("Approval object updated for PUT request:");
		System.out.println(approval);
		return approval;
	}

	@Override
	public void deleteApproval() {
	}

	@Override
	public Approval viewOneApproval(int approvalId) {
		Approval approval = new Approval();
		approval.setApprovalId(approvalId);
		approval.setRequestId(777777);
		approval.setRmId(99999);
		approval.setApprovalStatus("Approved");
		approval.setApprovalStatusMessage("This is testing of viewOneApproval");
		approval.setCreatedOn(Timestamp.valueOf("2021-07-21 09:27:00"));
		approval.setLastUpdatedOn(Timestamp.valueOf("2021-07-21 09:27:00"));
		return approval;
	}

	@Override
	public List<Approval> viewAllApprovals() {
		return approvalDaoImpl.viewAllApprovals();
	}

	@Override
	public String deleteAllApprovals() {
		int deletedCount=approvalDaoImpl.deleteAllApproval();
		if (deletedCount == 0)
		{
			return "No Approval to delete";
		}
		else
		{
			
			return "Total approval deleted = "+deletedCount;
		}

	}
}
