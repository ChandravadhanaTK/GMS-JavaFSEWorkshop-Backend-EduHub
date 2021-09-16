package com.atos.eduhub.model;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class User {

	private int id;
	private String userName;
	private String password;
	private String firstName;
	private String secondName;
	private String emailId;
	private String mobile;
	private String location;
	private String designation;
	private int experience;
	private String primarySkills;
	private String secondarySkills;
	private String role;
	private LocalDateTime createdOn;
	private LocalDateTime lastLogin;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public String getPrimarySkills() {
		return primarySkills;
	}

	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}

	public String getSecondarySkills() {
		return secondarySkills;
	}

	public void setSecondarySkills(String secondarySkills) {
		this.secondarySkills = secondarySkills;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public LocalDateTime getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=").append(id).append(", userName=").append(userName).append(", password=").append(password).append(", firstName=").append(firstName)
				.append(", secondName=").append(secondName).append(", emailId=").append(emailId).append(", mobile=").append(mobile).append(", location=").append(location)
				.append(", designation=").append(designation).append(", experience=").append(experience).append(", primarySkills=").append(primarySkills)
				.append(", secondarySkills=").append(secondarySkills).append(", role=").append(role).append(", createdOn=").append(createdOn)
				.append(", lastLogin=").append(lastLogin).append("]");
		return builder.toString();
	}

}
