package com.atos.eduhub.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.atos.eduhub.model.MentorModel;

@Component
public interface AddMentor {

	public String addMentor(@RequestBody MentorModel mentorreq);
}
