package com.atos.eduhub.dao.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atos.eduhub.configuration.QueryConfig;
import com.atos.eduhub.dao.MentorDao;
import com.atos.eduhub.model.Mentor;

@Repository
public class MentorDaoImpl implements MentorDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

//	@Value("${add_mentor}")
//	private String addmentorquery;
//
//	@Value("${edit_mentor}")
//	private String editmentorquery;
//
//	@Value("${show_all_mentors}")
//	private String showAllMentors;
//
//	@Value("${show_mentor_by_id}")
//	private String showMentorById;
//
//	@Value("${delete_mentor}")
//	private String deleteMentor;
//
//	@Value("${delete_all_mentors}")
//	private String deleteAllMentors;

	public MentorDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addMentor(Mentor mentor) {

		return jdbctemplate.update(QueryConfig.ADD_MENTOR, mentor.getUserid(), mentor.getStartdatetime(),
				mentor.getEnddatetime(), mentor.getMentoringskill(), mentor.getMentoredhours(),
				mentor.getMentorrating(), mentor.getAboutmentor(), LocalDateTime.now());
	}

	@Override
	public int editMentor(Mentor mentor) {

		return jdbctemplate.update(QueryConfig.EDIT_MENTOR, mentor.getStartdatetime(), mentor.getEnddatetime(),
				mentor.getMentoringskill(), mentor.getMentoredhours(), mentor.getMentorrating(),
				mentor.getAboutmentor(), LocalDateTime.now(), mentor.getUserid(), mentor.getAvailabilityid());
	}

	@Override
	public int deleteAllMentors() {

		return jdbctemplate.update(QueryConfig.DELETE_ALL_MENTORS);
	}

	@Override
	public int deleteMentor(int mentorId, int availabilityid) {

		return jdbctemplate.update(QueryConfig.DELETE_MENTOR, mentorId, availabilityid);
	}

	@Override
	public List<Mentor> viewAllMentors() throws DataAccessException {

		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("yyyy-MM-dd HH:mm:ss[.SSSSSS][.SSSSS][.SSSS][.SSS][.SS][.S]");

		List<Map<String, Object>> rows = jdbctemplate.queryForList(QueryConfig.SHOW_ALL_MENTORS);

		List<Mentor> result = new ArrayList<Mentor>();

		for (Map<String, Object> row : rows) {
			Mentor mentor = new Mentor();
			mentor.setAvailabilityid((int) row.get("availabilityid"));
			mentor.setUserid((int) row.get("userid"));
			mentor.setUsername((String) row.get("username"));

			System.out.println("Value returned by Row Mapper : " + row.get("startdatetime"));
			System.out.println("Value returned by Row Mapper converted to java.sql.timestamp : "
					+ (Timestamp) row.get("startdatetime"));
			System.out.println("Value returned by Row Mapper converted to java.sql.timestamp to String : "
					+ ((Timestamp) row.get("startdatetime")).toString());

			String startdatetime = ((Timestamp) row.get("startdatetime")).toString();
			mentor.setStartdatetime(LocalDateTime.parse(startdatetime, formatter));

			String enddatetime = ((Timestamp) row.get("enddatetime")).toString();
			mentor.setEnddatetime(LocalDateTime.parse(enddatetime, formatter));

			mentor.setMentoringskill((String) row.get("mentoringskill"));
			mentor.setMentoredhours((String) row.get("mentoredhours"));
			mentor.setMentorrating((String) row.get("mentorrating"));
			mentor.setAboutmentor((String) row.get("aboutmentor"));

			String lastupdateon = ((Timestamp) row.get("last_updated_on")).toString();
			mentor.setLastupdatedon(LocalDateTime.parse(lastupdateon, formatter));

			result.add(mentor);
			System.out.println(mentor);
		}

		return result;
	}

	@Override
	public List<Mentor> viewMentorById(int userid) {
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("yyyy-MM-dd HH:mm:ss[.SSSSSS][.SSSSS][.SSSS][.SSS][.SS][.S]");

		List<Map<String, Object>> rows = jdbctemplate.queryForList(QueryConfig.SHOW_MENTOR_BY_ID, userid);

		List<Mentor> result = new ArrayList<Mentor>();
		System.out.println(result);

		for (Map<String, Object> row : rows) {
			Mentor mentor = new Mentor();
			mentor.setAvailabilityid((int) row.get("availabilityid"));
			mentor.setUserid((int) row.get("userid"));
			mentor.setUsername((String) row.get("username"));

			String startdatetime = ((Timestamp) row.get("startdatetime")).toString();
			mentor.setStartdatetime(LocalDateTime.parse(startdatetime, formatter));

			String enddatetime = ((Timestamp) row.get("enddatetime")).toString();
			mentor.setEnddatetime(LocalDateTime.parse(enddatetime, formatter));

			mentor.setMentoringskill((String) row.get("mentoringskill"));
			mentor.setMentoredhours((String) row.get("mentoredhours"));
			mentor.setMentorrating((String) row.get("mentorrating"));
			mentor.setAboutmentor((String) row.get("aboutmentor"));

			String lastupdateon = ((Timestamp) row.get("last_updated_on")).toString();
			mentor.setLastupdatedon(LocalDateTime.parse(lastupdateon, formatter));

			result.add(mentor);
			System.out.println(mentor);
		}

		return result;
	}

	@Override
	public List<Mentor> viewMentorByIdAndAvailabilityid(int userid, int availabilityid) {
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("yyyy-MM-dd HH:mm:ss[.SSSSSS][.SSSSS][.SSSS][.SSS][.SS][.S]");

		List<Map<String, Object>> rows = jdbctemplate.queryForList(QueryConfig.SHOW_MENTOR_BY_ID_AND_AVAILABILITY_ID, userid, availabilityid);

		List<Mentor> result = new ArrayList<Mentor>();
		System.out.println(result);

		for (Map<String, Object> row : rows) {
			Mentor mentor = new Mentor();
			mentor.setAvailabilityid((int) row.get("availabilityid"));
			mentor.setUserid((int) row.get("userid"));
			mentor.setUsername((String) row.get("username"));

			String startdatetime = ((Timestamp) row.get("startdatetime")).toString();
			mentor.setStartdatetime(LocalDateTime.parse(startdatetime, formatter));

			String enddatetime = ((Timestamp) row.get("enddatetime")).toString();
			mentor.setEnddatetime(LocalDateTime.parse(enddatetime, formatter));

			mentor.setMentoringskill((String) row.get("mentoringskill"));
			mentor.setMentoredhours((String) row.get("mentoredhours"));
			mentor.setMentorrating((String) row.get("mentorrating"));
			mentor.setAboutmentor((String) row.get("aboutmentor"));

			String lastupdateon = ((Timestamp) row.get("last_updated_on")).toString();
			mentor.setLastupdatedon(LocalDateTime.parse(lastupdateon, formatter));

			result.add(mentor);
			System.out.println(mentor);
		}

		return result;
	}
}