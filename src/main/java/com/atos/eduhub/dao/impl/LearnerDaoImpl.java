package com.atos.eduhub.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atos.eduhub.dao.LearnerDao;
import com.atos.eduhub.model.Learner;
import com.atos.eduhub.rowmapper.LearnerRowMapper;

@Repository
public class LearnerDaoImpl implements LearnerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Value("${learnerprofile_viewAllLearners}")
	private String learnerprofile_viewAllLearners;
	@Value("${learnerprofile_deleteById}")
	private String learnerprofile_deleteById;

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
}