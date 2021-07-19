package com.atos.eduhub.model;

import java.sql.Timestamp;

public class User {
	
	private int id;
	private String username;
	private String password;	
	private String firstname;
	private String secondname;
	private String emailid;
	private String mobile;
	private String location;
	private String designation;
	private int experience;
	private String primaryskills;
	private String secondaryskills;
	private String role;
	private Timestamp created_on;
	private Timestamp last_login;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getPrimaryskills() {
		return primaryskills;
	}
	public void setPrimaryskills(String primaryskills) {
		this.primaryskills = primaryskills;
	}
	public String getSecondaryskills() {
		return secondaryskills;
	}
	public void setSecondaryskills(String secondaryskills) {
		this.secondaryskills = secondaryskills;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Timestamp  getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Timestamp  created_on) {
		this.created_on = created_on;
	}
	public Timestamp  getLast_login() {
		return last_login;
	}
	public void setLast_login(Timestamp  last_login) {
		this.last_login = last_login;
	}
	

}
