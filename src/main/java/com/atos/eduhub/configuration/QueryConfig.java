package com.atos.eduhub.configuration;

public final class QueryConfig {

	public static final String ADD_MENTOR = "Insert into mentor "
			+ "(userid, startdatetime, enddatetime, mentoringSkill, mentoredHours, "
			+ "mentorRating, aboutMentor, last_updated_on) " + "values (?, ?, ?, ?, ?, ?, ?, ?)";

	public static final String SHOW_ALL_MENTORS = "Select a.availabilityid, a.userid, b.username, "
			+ "a.startdatetime, a.enddatetime, a.mentoringskill, a.mentoredhours, a.mentorrating, a. aboutmentor,"
			+ " a.last_updated_on from mentor a, user_profile b where a.userid = b.id and a.enddatetime > CURRENT_TIMESTAMP "
			+ "order by a.startdatetime, a.enddatetime";

	public static final String SHOW_MENTOR_BY_ID = "Select a.availabilityid, a.userid, b.username, "
			+ "a.startdatetime, a.enddatetime, a.mentoringskill, a.mentoredhours, a.mentorrating, a. aboutmentor,"
			+ " a.last_updated_on from mentor a, user_profile b where a.userid = b.id and a.userid =? and a.enddatetime > CURRENT_TIMESTAMP "
			+ "order by a.startdatetime, a.enddatetime";

	public static final String SHOW_MENTOR_BY_ID_AND_AVAILABILITY_ID = "Select a.availabilityid, a.userid, b.username, "
			+ "a.startdatetime, a.enddatetime, a.mentoringskill, a.mentoredhours, a.mentorrating, a. aboutmentor,"
			+ " a.last_updated_on from mentor a, user_profile b where a.userid = b.id and a.userid =? and a.availabilityid =?";

	public static final String EDIT_MENTOR = "Update mentor set startdatetime=?, "
			+ "enddatetime=?, mentoringSkill=?, mentoredHours=?, mentorRating=?, "
			+ "aboutMentor=?, last_updated_on=? Where userid=? and availabilityid =?";

	public static final String DELETE_MENTOR = "DELETE FROM mentor WHERE userid=? and availabilityid =?";

	public static final String DELETE_ALL_MENTORS = "DELETE FROM mentor";

	
    public static final String userprofile_fetchAll="select id,userName,password,firstName,secondName,emailID,mobile,location,designation,experience,primarySkills,secondarySkills,role,createdOn,lastLogin from user_profile";
    public static final String userprofile_fetchById="select id,userName,password,firstName,secondName,emailID,mobile,location,designation,experience,primarySkills,secondarySkills,role,createdOn,lastLogin from user_profile where id=?";
    public static final String userprofile_deleteById="delete from  user_profile where  id=?";
    public static final String userprofile_updateById="update  user_profile set userName=?,password=?,firstName=?,secondName=?,emailID=?,mobile=?,location=?,designation=?,experience=?,primarySkills=?,secondarySkills=?,role=?,createdOn=?,lastLogin=? where  id=?";
    public static final String userprofile_save="insert into user_profile(id,userName,password,firstName,secondName,emailID,mobile,location,designation,experience,primarySkills,secondarySkills,role,createdOn,lastLogin) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public static final String userprofile_deleteAll = "delete from user_profile";

    public QueryConfig() {
        // TODO Auto-generated constructor stub
    }

}

