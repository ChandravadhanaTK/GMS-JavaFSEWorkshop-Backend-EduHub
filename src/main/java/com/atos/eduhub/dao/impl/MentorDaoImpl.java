package com.atos.eduhub.dao.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.atos.eduhub.dao.MentorDao;
import com.atos.eduhub.model.Mentor;

@Repository
public class MentorDaoImpl extends JdbcDaoSupport implements MentorDao{
	
	@Autowired
	private DataSource datasource;
	
	//@Autowired
	//private JdbcTemplate jdbctemplate;

	public MentorDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
    @PostConstruct
    private void initialize(){
        setDataSource(datasource);
    }

//	public MentorDaoImpl(JdbcTemplate jdbctemplate) {
//		super();
//		this.jdbctemplate = jdbctemplate;
//	}

//	public void setDataSource() {
//		//this.datasource = datasource;
//		this.jdbctemplate = new JdbcTemplate(datasource);
//	}
	
//    @Bean
//    public JdbcTemplate getTemplate(){
//        return new JdbcTemplate();
//    }
	
	@Override
	public int addMentor(Mentor mentor){
		
//		try {
//			System.out.println(datasource.getConnection());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		String sql = 	"Insert into mentor (availabilityid, userid, startdatetime, enddatetime, mentoringSkill, "  +
						"mentoredHours, mentorRating, aboutMentor, last_updated_on " 				+
						"values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
						
		return getJdbcTemplate().update(sql,mentor.getAvailabilityid(),
										mentor.getUserid(),
										mentor.getStartdatetime(),
										mentor.getEnddatetime(),
										mentor.getMentoringskill(),
										mentor.getMentoredhours(),
										mentor.getMentorrating(),
										mentor.getAboutmentor(),
										Timestamp.valueOf(LocalDateTime.now()));
	}

}
