package com.atos.eduhub.dao.impl;

import com.atos.eduhub.configuration.ApprovalQueryConfig;
import com.atos.eduhub.configuration.CourseQueryConfig;
import com.atos.eduhub.configuration.QueryConfig;
import com.atos.eduhub.dao.ApprovalDao;
import com.atos.eduhub.model.Approval;
import com.atos.eduhub.model.Mentor;
import com.atos.eduhub.rowmapper.ApprovalRowMapper;
import com.atos.eduhub.rowmapper.CourseRowMapper;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ApprovalDaoImpl implements ApprovalDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int addApproval(Approval approval) {
    	// "insert into approval(approvalId, requestId, rmId, approvalStatus, approvalStatusMessage, createdOn, lastUpdatedOn) values(?, ?, ?, ?, ?, ?, ?)";
    	int sqlStatus = jdbcTemplate.update(ApprovalQueryConfig.INSERT_APPROVAL, 
    			approval.getApprovalId(), 
    			approval.getRequestId(),
    			approval.getRmId(), 
    			approval.getApprovalStatus(), 
    			approval.getApprovalStatusMessage(),
    			approval.getCreatedOn(),
    			approval.getLastUpdatedOn());
    	System.out.println("Number of records inserted on approval table = " + sqlStatus);
    	return sqlStatus;
    }
    
    @Override
    public int deleteAllApproval() {
        return jdbcTemplate.update(ApprovalQueryConfig.DELETE_ALL_APPROVALS);
    }

    @Override
    public Approval viewOneApproval(int approvalId) {
    	//Approval approval = jdbcTemplate.queryForObject(ApprovalQueryConfig.FETCH_APPROVAL_BY_ID, Approval.class, new Object[] {approvalId});
    	Approval approval = jdbcTemplate.queryForObject(ApprovalQueryConfig.FETCH_APPROVAL_BY_ID, new ApprovalRowMapper(), new Object[] {approvalId});
    	if (approval != null) {
    		System.out.println(" Approval found on postgres table for id  " + approvalId);
    	} else {
    		System.out.println(" Approval NOT found on postgres table for id  " + approvalId);
    	}
    	return approval;
    }
    
    @Override
    public int deleteOneApproval(int approvalId) {
    	int deleteCount = jdbcTemplate.update(ApprovalQueryConfig.DELETE_APPROVAL_BY_ID, approvalId);
    	return deleteCount;
    }
    
	@Override
	public List<Approval> viewAllApprovals() {
		return jdbcTemplate.query(ApprovalQueryConfig.SHOW_ALL_APPROVALS, new ApprovalRowMapper());
	}

	
}
