package com.atos.eduhub.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.atos.eduhub.model.Assignment;
import com.atos.eduhub.service.AssignmentService;
import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Component;

@Component
public class AssignmentServiceImpl implements AssignmentService {
	    
	@Override
	public List<Assignment> getAllAssignment() {
		// TODO Auto-generated method stub
		List<Assignment> getAssignment = new ArrayList<Assignment>();
		Assignment assignment1 = new Assignment();
	    assignment1.setAssignmentID(11111);
	    assignment1.setUserID(00001);
	    assignment1.setAssignmentStatus("Initiated");
	    assignment1.setAssigmentStatusMessage("waiting for approval");
	    Date date = new Date();
	    assignment1.setCreatedOn(date.toString());
	    assignment1.setLastUpdatedOn(date.toString());
	    getAssignment.add(assignment1);
	    Assignment assignment2 = new Assignment();
	    assignment2.setAssignmentID(22222);
	    assignment2.setUserID(00002);
	    assignment2.setAssignmentStatus("Approved");
	    assignment2.setAssigmentStatusMessage("ready for use");
	    assignment2.setCreatedOn(date.toString());
	    assignment2.setLastUpdatedOn(date.toString());
	    getAssignment.add(assignment2);
	    Assignment assignment3 = new Assignment();
	    assignment3.setAssignmentID(33333);
	    assignment3.setUserID(0003);
	    assignment3.setAssignmentStatus("Rejected");
	    assignment3.setAssigmentStatusMessage("duplicate Assignment");
	    assignment3.setCreatedOn(date.toString());
	    assignment3.setLastUpdatedOn(date.toString());
	    getAssignment.add(assignment3);
		return getAssignment;
	}
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
