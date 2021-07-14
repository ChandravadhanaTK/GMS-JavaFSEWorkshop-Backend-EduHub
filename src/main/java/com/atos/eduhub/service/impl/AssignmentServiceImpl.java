package com.atos.eduhub.service.impl;

import java.sql.Timestamp;

import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Assignment;
import com.atos.eduhub.service.AssignmentService;

@Component
public class AssignmentServiceImpl implements AssignmentService{

	@Override
	public Assignment viewAssignment(int id) {
		// TODO Auto-generated method stub
		Assignment assignment = new Assignment();
		assignment.setAssignmentID(1234);
		assignment.setUserID(5555);
		assignment.setAssigmentStatusMessage("Submitted");
		assignment.setAssignmentStatus("Initiated");
		assignment.setCreatedOn("2021-07-13");
		assignment.setLastUpdatedOn("2021-07-13");
		return assignment;
	}

}
