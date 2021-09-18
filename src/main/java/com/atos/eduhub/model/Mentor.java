package com.atos.eduhub.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Mentor {

	private int availabilityid;
	private int userid;
	private String username;
	private LocalDateTime startdatetime;
	private LocalDateTime enddatetime;
	private String mentoringskill;
	private String mentoredhours;
	private String mentorrating;
	private String aboutmentor;
	// private Timestamp lastupdatedon;
	private LocalDateTime lastupdatedon;

	public Mentor() {
	}

	public int getAvailabilityid() {
		return availabilityid;
	}

	public void setAvailabilityid(int availabilityid) {
		this.availabilityid = availabilityid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if (username != null)
			this.username = username;
		else
			this.username = "";
	}

	public LocalDateTime getStartdatetime() {
		return startdatetime;
	}

	public void setStartdatetime(LocalDateTime startdatetime) {
		this.startdatetime = startdatetime;
	}

	public LocalDateTime getEnddatetime() {
		return enddatetime;
	}

	public void setEnddatetime(LocalDateTime enddatetime) {
		this.enddatetime = enddatetime;
	}

	public String getMentoringskill() {
		return mentoringskill;
	}

	public void setMentoringskill(String mentoringskill) {
		this.mentoringskill = mentoringskill;
	}

	public String getMentoredhours() {
		return mentoredhours;
	}

	public void setMentoredhours(String mentoredhours) {
		this.mentoredhours = mentoredhours;
	}

	public String getMentorrating() {
		return mentorrating;
	}

	public void setMentorrating(String mentorrating) {
		this.mentorrating = mentorrating;
	}

	public String getAboutmentor() {
		return aboutmentor;
	}

	public void setAboutmentor(String aboutmentor) {
		this.aboutmentor = aboutmentor;
	}

	public LocalDateTime getLastupdatedon() {
		return lastupdatedon;
	}

	public void setLastupdatedon() {
		this.lastupdatedon = LocalDateTime.now();
	}

	public void setLastupdatedon(LocalDateTime lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}

	@Override
	public String toString() {
		return "MentorModel [availabilityid=" + availabilityid + ", userid=" + userid + ", username =" + username
				+ ",startdatetime=" + startdatetime + ", enddatetime=" + enddatetime + ", mentoringskill="
				+ mentoringskill + ", mentoredhours=" + mentoredhours + ", mentorrating=" + mentorrating
				+ ", aboutmentor=" + aboutmentor + ", lastupdatedon=" + lastupdatedon + "]";
	}

}