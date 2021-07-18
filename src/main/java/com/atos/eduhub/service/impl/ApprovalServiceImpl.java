package com.atos.eduhub.service.impl;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Approval;
import com.atos.eduhub.service.ApprovalService;

@Component
public class ApprovalServiceImpl implements ApprovalService{

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
		// TODO Auto-generated method stub
	}

	@Override
	public void viewApproval() {
		// TODO Auto-generated method stub
	}

	@Override
	public void viewAllApprovals() {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAllApprovals() {
		// TODO Auto-generated method stub
	}
}
