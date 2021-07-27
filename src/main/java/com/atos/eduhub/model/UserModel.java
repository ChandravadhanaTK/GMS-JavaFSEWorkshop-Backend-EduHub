package com.atos.eduhub.model;

import org.springframework.stereotype.Component;

@Component
public class UserModel {
	private String userId;
	private String firstName;
	private String lastName;
	private String designation;
	private float experience;
	private String password;

	public UserModel() {
		super();
	}

	public UserModel(String userId, String firstName, String lastName, String designation, float experience,
			String password) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.experience = experience;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserModel [userId=").append(userId).append(", firstName=").append(firstName)
				.append(", lastName=").append(lastName).append(", designation=").append(designation)
				.append(", experience=").append(experience).append(", password=").append(password).append("]");
		return builder.toString();
	}

}
