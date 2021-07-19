package com.atos.eduhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Learner;
import com.atos.eduhub.service.LearnerService;

@Component
public class LearnerServiceImpl implements LearnerService {
	
	@Override
	public String delete1Learner(int id) {
		return "Deleted Learner id" + id;
	}
	

	
	@Override
	public Learner viewLearner()  {
		
		Learner newLearner = new Learner();
				
		newLearner.setRequestId(999);
		newLearner.setUserId(3425);
		newLearner.setRole("FSD Learning");
		newLearner.setCourseId(20);
		newLearner.setRmid(50);
		newLearner.setApprovalId(6677);
		newLearner.setApprovalStatus("Approved");
		newLearner.setStatusMessage("GetMapping is working");
		newLearner.setAssignmentId(70);
		newLearner.setAssignmentStatus("Assignment Completed");
		newLearner.setAssignmentStatusMessage("Assignment Approved Msg");
		newLearner.setLearnerDescription("FSD Learning in Progress");
		newLearner.setLearnerScore("SCORE is 9");
		newLearner.setLast_update_on(null);
			
		return newLearner;
	}

	
	
}