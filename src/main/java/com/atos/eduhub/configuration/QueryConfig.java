package com.atos.eduhub.configuration;

public class QueryConfig {

	public static final String ADD_MENTOR = "Insert into mentor "
			+ "(userid, startdatetime, enddatetime, mentoringSkill, mentoredHours, "
			+ "mentorRating, aboutMentor, last_updated_on) " + "values (?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String SHOW_ALL_MENTORS = "Select * from mentor";
	public static final String SHOW_MENTOR_BY_ID = "Select * from mentor where userid=?";
	public static final String EDIT_MENTOR = "Update mentor set startdatetime=?, "
			+ "enddatetime=?, mentoringSkill=?, mentoredHours=?, mentorRating=?, "
			+ "aboutMentor=?, last_updated_on=? Where userid=?";
	public static final String DELETE_MENTOR = "DELETE FROM mentor WHERE userid=?";
	public static final String DELETE_ALL_MENTORS = "DELETE FROM mentor";

	public QueryConfig() {
		// TODO Auto-generated constructor stub
	}

}
