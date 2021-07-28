package com.atos.eduhub.dao.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atos.eduhub.dao.MentorDao;
import com.atos.eduhub.model.Mentor;

@Repository
public class MentorDaoImpl implements MentorDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	@Value("${add_mentor}")
	private String addmentorquery;
	
	@Value("${edit_mentor}")
	private String editmentorquery;
	
	@Value("${show_all_mentors}")
	private String showAllMentors;
	
	@Value("${delete_mentor}")
	private String deleteMentor;
	
	@Value("${delete_all_mentors}")
	private String deleteAllMentors;

	public MentorDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addMentor(Mentor mentor) {

		return jdbctemplate.update(addmentorquery, mentor.getUserid(), mentor.getStartdatetime(),
				mentor.getEnddatetime(), mentor.getMentoringskill(), mentor.getMentoredhours(),
				mentor.getMentorrating(), mentor.getAboutmentor(), Timestamp.valueOf(LocalDateTime.now()));
	}

	@Override
	public int editMentor(Mentor mentor) {

		return jdbctemplate.update(editmentorquery, mentor.getStartdatetime(),
				mentor.getEnddatetime(), mentor.getMentoringskill(), mentor.getMentoredhours(),
				mentor.getMentorrating(), mentor.getAboutmentor(), Timestamp.valueOf(LocalDateTime.now()), mentor.getUserid());
	}

	@Override
	public int deleteAllMentors() {

		return jdbctemplate.update(deleteAllMentors);
	}

	@Override
	public int deleteMentor(int mentorId) {

		return jdbctemplate.update(deleteMentor, mentorId);
	}

	@Override
	public List<Mentor> viewAllMentors() throws DataAccessException {
		
		List<Map<String, Object>> rows = jdbctemplate.queryForList(showAllMentors);
		
		List<Mentor> result = new ArrayList<Mentor>();
		
		for(Map<String, Object> row:rows){
			Mentor mentor = new Mentor();
			mentor.setAvailabilityid((int) row.get("availabilityid"));
			mentor.setUserid((int)row.get("userid"));
			mentor.setStartdatetime((Timestamp)row.get("startdatetime"));
			mentor.setEnddatetime((Timestamp) row.get("enddatetime"));
			mentor.setMentoringskill((String) row.get("mentoringskill"));
			mentor.setMentoredhours((String) row.get("mentoredhours"));
			mentor.setMentorrating((String) row.get("mentorrating"));
			mentor.setAboutmentor((String) row.get("aboutmentor"));
			mentor.setLastupdatedon((Timestamp)row.get("last_updated_on"));
			result.add(mentor);
		}
		
		return result;
	}
	
}