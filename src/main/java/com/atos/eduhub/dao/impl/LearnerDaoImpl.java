package com.atos.eduhub.dao.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atos.eduhub.QueryConfig;
import com.atos.eduhub.dao.LearnerDao;
import com.atos.eduhub.model.Learner;
import com.atos.eduhub.model.LearnerModel;
//import com.atos.eduhub.model.UserModel;
import com.atos.eduhub.rowmapper.LearnerRowMapper;

@Repository
public class LearnerDaoImpl implements LearnerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	@Value("${learnerprofile_viewAllLearners}")
//	private String learnerprofile_viewAllLearners;
//	@Value("${learnerprofile_deleteById}")
//	private String learnerprofile_deleteById;
//	@Value("${learnerprofile_save}")
//	private String learnerprofile_save;
//	@Value("${learnerprofile_updateByID}")
//	private String learnerprofile_updateByID;
//	@Value("${learnerprofile_view1Learner}")
//	private String learnerprofile_view1Learner;
//	@Value("${learnerprofile_viewRequest}")
//	private String learnerprofile_viewRequest;
//	@Value("${learnerprofile_deleteAllLearner}")
//	private String learnerprofile_deleteAllLearner;
//	@Value("${learnerprofile_deleteAllByUserId}")
//	private String learnerprofile_deleteAllByUserId;

	@Override
	public List<Map<String, Object>>  viewAllLearners() {
		return jdbcTemplate.queryForList(QueryConfig.learnerprofile_viewAllLearners );
	}
	
	public List<Learner> findAllWithRowMapper() {
		return jdbcTemplate.query(QueryConfig.learnerprofile_viewAllLearners,new LearnerRowMapper());
	}
	
	@Override
	public List<Map<String, Object>>  view1Learner(int userid) {
		return jdbcTemplate.queryForList(QueryConfig.learnerprofile_view1Learner, userid );
	}
	
	public List<Learner> findAllWithRowMapper2() {
		return jdbcTemplate.query(QueryConfig.learnerprofile_view1Learner,new LearnerRowMapper());
	}

	@Override
	public List<Map<String, Object>>  viewRequest(int requestId) {
		return jdbcTemplate.queryForList(QueryConfig.learnerprofile_viewRequest, requestId );
	}
	
	public List<Learner> findAllWithRowMapper3() {
		return jdbcTemplate.query(QueryConfig.learnerprofile_viewRequest,new LearnerRowMapper());
	}

	@Override
	public int delete1Learner(int requestid) {
		return jdbcTemplate.update(QueryConfig.learnerprofile_deleteById, requestid );
		
	}
	
	@Override	
	public int deleteAllLearner() {
		return jdbcTemplate.update(QueryConfig.learnerprofile_deleteAllLearner );
		
	}
	
	@Override	
	public int deleteAllUser(int userid) {
		return jdbcTemplate.update(QueryConfig.learnerprofile_deleteAllByUserId, userid );
		
	}
	
	@Override
	public int saveLearner(LearnerModel learnermodel) {
		
		LocalDateTime localDateTime= LocalDateTime.now();
		learnermodel.setLocalDateTime(localDateTime);
		
		return jdbcTemplate.update(QueryConfig.learnerprofile_save, 
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
	}
	
			public int updateLearner(int id, Learner updateLearner) {
                
                LocalDateTime localDateTime= LocalDateTime.now();
                updateLearner.setLocalDateTime(localDateTime);
                
                return jdbcTemplate.update(QueryConfig.learnerprofile_updateByID
                                   , updateLearner.getApprovalId()
                                   , updateLearner.getApprovalStatus()
                                   , updateLearner.getStatusMessage()
                                   , updateLearner.getAssignmentStatus()
                                   , updateLearner.getAssignmentStatusMessage()
                                   , updateLearner.getLearnerDescription()
                                   , updateLearner.getLearnerScore()
                                   , updateLearner.getLocalDateTime()
                                   , id
                                   );

	}
		
}