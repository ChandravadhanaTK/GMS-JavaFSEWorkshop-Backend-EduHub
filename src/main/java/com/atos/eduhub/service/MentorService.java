package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.atos.eduhub.model.MentorModel;

@Component
public interface MentorService {

	public String addMentor(@RequestBody MentorModel mentorreq);
	
	public List<MentorModel> getAllMentor();
}
