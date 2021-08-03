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
		List<Approval> approvalList = new ArrayList<>();
		Approval approval1 = new Approval();
		approval1.setApprovalId(1);
		approval1.setRequestId(777777);
		approval1.setRmId(99999);
		approval1.setApprovalStatus("Approved");
		approval1.setApprovalStatusMessage("This is testing of viewAllApprovals");
		approval1.setCreatedOn(Timestamp.valueOf("2021-07-22 09:27:00"));
		approval1.setLastUpdatedOn(Timestamp.valueOf("2021-07-22 09:27:00"));
		approvalList.add(approval1);

		Approval approval2 = new Approval();
		approval2.setApprovalId(2);
		approval2.setRequestId(777777);
		approval2.setRmId(99999);
		approval2.setApprovalStatus("Rejected");
		approval2.setApprovalStatusMessage("This is testing of viewAllApprovals");
		approval2.setCreatedOn(Timestamp.valueOf("2021-07-22 09:27:00"));
		approval2.setLastUpdatedOn(Timestamp.valueOf("2021-07-22 09:27:00"));
		approvalList.add(approval2);

		return approvalList;
	}

	@Override
	public String deleteAllApprovals() {
		int deletedCount=approvalDaoImpl.deleteAllApproval();

		if (deletedCount == 0)
		{
			return "Total approval deleted = "+deletedCount;
		}
		else
		{
			return "No Approval to delete";
		}

	}
}
