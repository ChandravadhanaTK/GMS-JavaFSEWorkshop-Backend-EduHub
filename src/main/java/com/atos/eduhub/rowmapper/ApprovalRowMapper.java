package com.atos.eduhub.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.atos.eduhub.model.Approval;
import com.atos.eduhub.model.Course;

public class ApprovalRowMapper implements RowMapper<Approval> {

	@Override
	public Approval mapRow(ResultSet rs, int rowNum) throws SQLException {
		Approval approval = new Approval();
		approval.setApprovalId(rs.getInt("approvalId"));
		System.out.print(" database return= "+ approval.getApprovalId() );
		//approval.setRequestId(rs.getInt("requesterId"));
		approval.setRequestId(rs.getInt("requestId"));
		approval.setRmId(rs.getInt("rmId"));
		approval.setApprovalStatus(rs.getString("approvalStatus"));
		approval.setApprovalStatusMessage(rs.getString("approvalStatusMessage"));
		//approval.setCreatedOn(rs.getTimestamp("createdOn"));
		approval.setCreatedOn(rs.getTimestamp("createdOn").toLocalDateTime());
		//approval.setLastUpdatedOn(rs.getTimestamp("lastUpdatedOn"));
		approval.setLastUpdatedOn(rs.getTimestamp("lastUpdatedOn").toLocalDateTime());
	    return approval;
	}

}
