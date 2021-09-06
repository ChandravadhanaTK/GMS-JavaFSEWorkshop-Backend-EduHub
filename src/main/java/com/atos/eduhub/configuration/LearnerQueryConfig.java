package com.atos.eduhub.configuration;

public final class LearnerQueryConfig {
	
	
	//Learner query 
	public static final String learnerprofile_save= "insert into learner"
					+ " (requestid,userid,role,courseid,rmid,approvalid,approvalstatus, "
					+ " statusmessage,assignmentid,assignmentstatus,assignmentstatusmessage, "
					+ " learnerdescription,learnerscore,lastupdatedon) " 
					+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,current_timestamp) " ;
	public static final String learnerprofile_viewAllLearners= "select * from learner ";
	public static final String learnerprofile_view1Learner= " select * from learner "
					+ "where userid = ?";
	public static final String learnerprofile_viewRequest= "select * from learner "
					+ "where requestid = ? ";
	public static final String learnerprofile_deleteById= "delete from learner " 
					+ "where requestid = ? ";
	public static final String learnerprofile_deleteAllByUserId= "delete from learner " 
					+ "where userid = ? ";
	public static final String learnerprofile_deleteAllLearner= "delete from learner ";
	public static final String learnerprofile_updateByID= " update learner " 
					+ " set approvalid=?,approvalstatus=?,statusmessage=?,"
					+ " assignmentid=?, assignmentstatus=?,"
					+ " assignmentstatusmessage=?,learnerdescription=?,learnerscore=?,"
					+ "lastupdatedon=current_timestamp where  requestid=?";
	public LearnerQueryConfig() {
				// TODO Auto-generated constructor stub
	}
					
					
}
