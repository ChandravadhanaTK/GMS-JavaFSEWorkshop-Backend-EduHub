package com.atos.eduhub.configuration;

public final class QueryConfig {

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

