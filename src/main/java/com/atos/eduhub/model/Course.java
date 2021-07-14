package com.atos.eduhub.model;

import java.security.Timestamp;

public class Course {
	
private int courseid;
private String coursename;
private String coursedesc;
private String skillreqd;
private String createdon;
private String lastupdatedon;

	
public void setCourseid(int courseid){
	
	this.courseid=courseid;		
	
}

public int getCourseid(){
	
	return courseid;
}

public void setCoursename(String coursename){
	
	this.coursename=coursename;		
	
}

public String getCoursename(){
	
	return coursename;
}

public void setCoursedesc(String coursedesc){
	
	this.coursedesc=coursedesc;		
	
}

public String getCoursedesc(){
	
	return coursedesc;
}

public void setSkillreqd(String skillreqd){
	
	this.skillreqd=skillreqd;		
	
}

public String getSkillreqd(){
	
	return skillreqd;
}

//public void setCreatedon(Timestamp createdon){
	public void setCreatedon(String createdon){
	
	this.createdon=createdon;		
	
}

//public Timestamp getCreatedon(){
public String getCreatedon(){
	return createdon;
}

//public void setLastUpdatedon(Timestamp lastupdatedon){
	public void setLastUpdatedon(String lastupdatedon){
	
	this.lastupdatedon=lastupdatedon;		
	
}

//public Timestamp getLastUpdatedon(){
	public String getLastUpdatedon(){
	
	return lastupdatedon;
}
	

}







	
	
	

