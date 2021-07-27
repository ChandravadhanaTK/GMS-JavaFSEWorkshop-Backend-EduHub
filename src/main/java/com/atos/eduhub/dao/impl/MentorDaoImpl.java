package com.atos.eduhub.dao.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atos.eduhub.dao.MentorDao;
import com.atos.eduhub.model.Mentor;

@Repository
public class MentorDaoImpl implements MentorDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public MentorDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addMentor(Mentor mentor) {

		String sql = "Insert into public.mentor (userid, startdatetime, enddatetime, mentoringSkill, "
				+ " mentoredHours, mentorRating, aboutMentor, last_updated_on) values (?, ?, ?, ?, ?, ?, ?, ?)";

		return jdbctemplate.update(sql, mentor.getUserid(), mentor.getStartdatetime(), mentor.getEnddatetime(),
				mentor.getMentoringskill(), mentor.getMentoredhours(), mentor.getMentorrating(),
				mentor.getAboutmentor(), Timestamp.valueOf(LocalDateTime.now()));
	}

	@Override
	public int deleteAllMentors() {

		String sql = "DELETE FROM public.mentor";

		return jdbctemplate.update(sql);
	}

	@Override
	public int deleteMentor(int mentorId) {

		String sql = "DELETE FROM public.mentor WHERE userid=?";

		return jdbctemplate.update(sql, mentorId);
	}
}
