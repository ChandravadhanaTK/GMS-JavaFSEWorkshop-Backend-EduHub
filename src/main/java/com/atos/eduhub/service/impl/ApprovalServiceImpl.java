package com.atos.eduhub.service.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.atos.eduhub.dao.ApprovalDao;
import com.atos.eduhub.dao.impl.ApprovalDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Approval;
import com.atos.eduhub.service.ApprovalService;

@Component
public class ApprovalServiceImpl implements ApprovalService {
	@Autowired
	ApprovalDao approvalDao;
	
	
	@Override
	public Approval addApproval(Approval approval) {
    	LocalDateTime currentTime = LocalDateTime.now();
    	approval.setCreatedOn(currentTime);
    	approval.setLastUpdatedOn(currentTime);
    	System.out.println("Current time updated in approval object");
    	approvalDao.addApproval(approval);
		return approval;
	}

	@Override
	public String editApproval(Approval approval) {
		System.out.println("Approval object updated for PUT request:");
		System.out.println(approval);
		LocalDateTime currentTime = LocalDateTime.now();
		approval.setLastUpdatedOn(currentTime);
		int updateCount = approvalDao.editApproval(approval);
		String updateMessage = "";
		if (updateCount == 0) {
			updateMessage = "No approval found with id " + approval.getApprovalId() + "; Update not performed";
		}
		else {
			updateMessage = "Approval with id = "+ approval.getApprovalId() + " Updated";
		}
		return updateMessage;
	}

	@Override
	public String deleteOneApproval(int approvalId) {
		int deleteCount = approvalDao.deleteOneApproval(approvalId);
		String deleteMessage = "";
		System.out.println("Number of records deleted from approval table = "+ deleteCount);
		if(deleteCount > 0) {
			deleteMessage = "approval deleted from table " + approvalId;
		} else {
			deleteMessage = "Approval not found on table " + approvalId;
		}
		System.out.println(deleteMessage);
		return deleteMessage;
	}

	@Override
	public Approval viewOneApproval(int approvalId) {
		return approvalDao.viewOneApproval(approvalId);
	}

	@Override
	public List<Approval> viewAllApprovals() {
		return approvalDao.viewAllApprovals();
	}

	@Override
	public String deleteAllApprovals() {
		int deletedCount=approvalDao.deleteAllApproval();
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
