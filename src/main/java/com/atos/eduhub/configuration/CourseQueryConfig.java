package com.atos.eduhub.configuration;

public class CourseQueryConfig {
	public static final String COURSE_SAVE = "insert into courses "
	//		+ "(courseid, coursename, coursedesc, skillrequired, createdon, lastupdatedon) "
			+ "(coursename, coursedesc, skillrequired, createdon, lastupdatedon) "
			+ "values (?, ?, ?, ?, ?)";

	public static final String COURSE_UPDATEBYID = "update courses set coursename=?, "
			+ "coursedesc=?,skillrequired=?,lastupdatedon=?  where  courseid=? ";

	public static final String COURSE_DELETEBYID = "delete from courses where courseid=?";

	public static final String COURSE_SELECTBYID = "select courseid, coursename, coursedesc, skillrequired, createdon,"
			+ "lastupdatedon from courses where courseid=?";

	public static final String COURSE_SELECTALL = "Select * from courses order by courseid ";

	public static final String COURSE_DELETEALL = "delete from courses";

}
