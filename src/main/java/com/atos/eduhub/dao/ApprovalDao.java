package com.atos.eduhub.dao;

import java.util.List;

import com.atos.eduhub.model.Approval;
import com.atos.eduhub.model.Mentor;

public interface ApprovalDao {
	public List<Approval> viewAllApprovals();
    public int deleteAllApproval();
}
