package com.atos.eduhub.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.atos.eduhub.model.Assignment;
import com.atos.eduhub.service.AssignmentService;

import org.springframework.stereotype.Component;

@Component
public class AssignmentServiceImpl implements AssignmentService {
	    
	@Override
	public List<Assignment> getAllAssignment() {
		// TODO Auto-generated method stub
		List<Assignment> getAssignment = new ArrayList<Assignment>();
		Assignment assignment1 = new Assignment();
	    assignment1.setAssignmentId(11111);
	    assignment1.setUserid(00001);
	    assignment1.setAssignmentStatus("Initiated");
	    assignment1.setAssignmentStatusMessage("waiting for approval");
	    Date date = new Date();
//	    Timestamp ts = new Timestamp(date.getTime());
	    assignment1.setCreated_on(date.toString());
	    assignment1.setLast_updated_on(date.toString());
	    getAssignment.add(assignment1);
	    Assignment assignment2 = new Assignment();
	    assignment2.setAssignmentId(22222);
	    assignment2.setUserid(00002);
	    assignment2.setAssignmentStatus("Approved");
	    assignment2.setAssignmentStatusMessage("ready for use");
	    assignment2.setCreated_on(date.toString());
	    assignment2.setLast_updated_on(date.toString());
	    getAssignment.add(assignment2);
		return getAssignment;
	}

}
