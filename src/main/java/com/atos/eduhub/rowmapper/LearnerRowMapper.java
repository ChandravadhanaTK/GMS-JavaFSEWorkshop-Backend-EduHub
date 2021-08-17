package com.atos.eduhub.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.atos.eduhub.model.Learner;

public class LearnerRowMapper implements RowMapper<Learner>{
	@Override
	public Learner mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Learner learnermodel= new Learner();
		
		learnermodel.setRequestId(rs.getInt("requestId"));
		learnermodel.setUserId(rs.getInt("userId"));
		learnermodel.setRole(String.valueOf(rs.getString("role")));
		learnermodel.setCourseId(rs.getInt("courseId"));
		learnermodel.setRmid(rs.getInt("rmid"));
		learnermodel.setApprovalId(rs.getInt("approvalId"));
		learnermodel.setApprovalStatus(String.valueOf(rs.getString("approvalStatus")));
		learnermodel.setStatusMessage(String.valueOf(rs.getString("statusMessage")));
		learnermodel.setAssignmentId(rs.getInt("assignmentId"));
		learnermodel.setAssignmentStatus(String.valueOf(rs.getString("assignmentStatus")));
		learnermodel.setAssignmentStatusMessage(String.valueOf(rs.getString("assignmentStatusMessage")));
		learnermodel.setLearnerDescription(String.valueOf(rs.getString("learnerDescription")));
		learnermodel.setLearnerScore(String.valueOf(rs.getString("learnerScore")));
//		learnermodel.setLast_update_on(rs.getTimestamp("lastUpdateOn"));

		return learnermodel;
		
	}

}