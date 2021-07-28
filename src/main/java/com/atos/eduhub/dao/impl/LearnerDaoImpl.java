package com.atos.eduhub.dao.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atos.eduhub.dao.LearnerDao;
import com.atos.eduhub.model.Learner;
import com.atos.eduhub.model.LearnerModel;
//import com.atos.eduhub.model.UserModel;
import com.atos.eduhub.rowmapper.LearnerRowMapper;

@Repository
public class LearnerDaoImpl implements LearnerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Value("${learnerprofile_viewAllLearners}")
	private String learnerprofile_viewAllLearners;
	@Value("${learnerprofile_deleteById}")
	private String learnerprofile_deleteById;
	@Value("${learnerprofile_save}")
	private String learnerprofile_save;

	@Override
	public List<Map<String, Object>>  viewAllLearners() {
		return jdbcTemplate.queryForList(learnerprofile_viewAllLearners );
	}
	
	public List<Learner> findAllWithRowMapper() {
		return jdbcTemplate.query(learnerprofile_viewAllLearners,new LearnerRowMapper());
	}


	@Override
	public int delete1Learner(int userId) {
		return jdbcTemplate.update(learnerprofile_deleteById,new LearnerRowMapper(),new Object[] {userId});
		
	}
	
	//requestId,userid,role,courseId,rmid,approvalId,approvalStatus,statusMessage,assignmentId,
	//assignmentStatus,assignmentStatusMessage,learnerDescription,learnerScore,lastUpdatedOn
	@Override
	public int saveLearner(LearnerModel learnermodel) {
		
		LocalDateTime localDateTime= LocalDateTime.now();
		learnermodel.setLocalDateTime(localDateTime);
		
		return jdbcTemplate.update(learnerprofile_save, 
				 learnermodel.getRequestId()
				, learnermodel.getUserId()
				, learnermodel.getRole()
				, learnermodel.getCourseId()
				, learnermodel.getRmid()
				, learnermodel.getApprovalId()
				, learnermodel.getApprovalStatus()
				, learnermodel.getStatusMessage()
				, learnermodel.getAssignmentId()
				, learnermodel.getAssignmentStatus()
				, learnermodel.getAssignmentStatusMessage()
				, learnermodel.getLearnerDescription()
				, learnermodel.getLearnerScore()
				, learnermodel.getLocalDateTime()

				);
	//	return 0;
	}
}