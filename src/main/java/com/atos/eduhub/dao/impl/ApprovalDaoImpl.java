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
    public int deleteAllApproval() {
    	
        return jdbcTemplate.update(ApprovalQueryConfig.DELETE_ALL_APPROVALS);
    }

	@Override
	public List<Approval> viewAllApprovals() {
	
		
		return jdbcTemplate.query(ApprovalQueryConfig.SHOW_ALL_APPROVALS, new ApprovalRowMapper());

		
	}
}
