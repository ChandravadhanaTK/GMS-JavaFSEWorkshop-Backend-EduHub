package com.atos.eduhub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.atos.eduhub.dao.LearnerDao;
import com.atos.eduhub.model.Learner;
import com.atos.eduhub.model.LearnerModel;
import com.atos.eduhub.service.LearnerService;

@Service
public class LearnerServiceImpl implements LearnerService {
	
	@Autowired
	private LearnerDao learnerDao;
	
	@Override
	public String addLearner(LearnerModel learnermodel) {
		// TODO Auto-generated method stub
		String message="";
		int response=learnerDao.saveLearner(learnermodel);
		if (response!=0) {
			message="Insert Successful";
		} else {
			message="Insert Failed";
		}
		return message;
	}
	@Override
	public String updateLearner(int id, Learner updateLearner) {
		String message="";
		int response=learnerDao.updateLearner( id, updateLearner);
		if (response!=0) {
			message="update Successful";
		} else {
			message="update Failed";
		}
		return message;
	}

	@Override
	public String delete1Learner(int requestid) {
		String message="";
		int response=learnerDao.delete1Learner(requestid);
		if (response!=0) {
			message="delete Successful";
		} else {
			message="delete Failed";
		}
		return message;
	}

	@Override
	public String deleteAllLearner() {
		return "Deleted all Learner";
	}

	@Override
	public List<Learner> view1Learner(int id) {
		List<Learner> LearnerList=new ArrayList<>();
		
		for(Map<String, Object> eachresponse:learnerDao.view1Learner(id)) {
			Learner learnermodel= new Learner();
			
			learnermodel.setRequestId(Integer.valueOf(String.valueOf(eachresponse.get("requestId"))));
			learnermodel.setUserId(Integer.valueOf(String.valueOf(eachresponse.get("userId"))));
			learnermodel.setRole(String.valueOf(eachresponse.get("role")));
			learnermodel.setCourseId(Integer.valueOf(String.valueOf(eachresponse.get("courseId"))));
			learnermodel.setRmid(Integer.valueOf(String.valueOf(eachresponse.get("rmid"))));
			learnermodel.setApprovalId(Integer.valueOf(String.valueOf(eachresponse.get("approvalId"))));
			learnermodel.setApprovalStatus(String.valueOf(eachresponse.get("approvalStatus")));
			learnermodel.setStatusMessage(String.valueOf(eachresponse.get("statusMessage")));
			learnermodel.setAssignmentId(Integer.valueOf(String.valueOf(eachresponse.get("assignmentId"))));
			learnermodel.setAssignmentStatus(String.valueOf(eachresponse.get("assignmentStatus")));
			learnermodel.setAssignmentStatusMessage(String.valueOf(eachresponse.get("assignmentStatusMessage")));
			learnermodel.setLearnerDescription(String.valueOf(eachresponse.get("learnerDescription")));
			learnermodel.setLearnerScore(String.valueOf(eachresponse.get("learnerScore")));
	//  	learnermodel.setLastUpdateOn(String.valueOf(eachresponse.get("lastUpdateOn"));
			
		
		
			LearnerList.add(learnermodel);
		}
		
		return LearnerList;
	}

	/*
	 * @Override public String viewAllLearners() { return "No records to display"; }
	 */

	@Override
	/* public String viewAllLearners() { */
	public List<Learner> viewAllLearners() {
		List<Learner> LearnerList=new ArrayList<>();
		
		for(Map<String, Object> eachresponse:learnerDao.viewAllLearners()) {
			Learner learnermodel= new Learner();
			
			learnermodel.setRequestId(Integer.valueOf(String.valueOf(eachresponse.get("requestId"))));
			learnermodel.setUserId(Integer.valueOf(String.valueOf(eachresponse.get("userId"))));
			learnermodel.setRole(String.valueOf(eachresponse.get("role")));
			learnermodel.setCourseId(Integer.valueOf(String.valueOf(eachresponse.get("courseId"))));
			learnermodel.setRmid(Integer.valueOf(String.valueOf(eachresponse.get("rmid"))));
			learnermodel.setApprovalId(Integer.valueOf(String.valueOf(eachresponse.get("approvalId"))));
			learnermodel.setApprovalStatus(String.valueOf(eachresponse.get("approvalStatus")));
			learnermodel.setStatusMessage(String.valueOf(eachresponse.get("statusMessage")));
			learnermodel.setAssignmentId(Integer.valueOf(String.valueOf(eachresponse.get("assignmentId"))));
			learnermodel.setAssignmentStatus(String.valueOf(eachresponse.get("assignmentStatus")));
			learnermodel.setAssignmentStatusMessage(String.valueOf(eachresponse.get("assignmentStatusMessage")));
			learnermodel.setLearnerDescription(String.valueOf(eachresponse.get("learnerDescription")));
			learnermodel.setLearnerScore(String.valueOf(eachresponse.get("learnerScore")));
	//  	learnermodel.setLastUpdateOn(String.valueOf(eachresponse.get("lastUpdateOn"));
			
		
		
			LearnerList.add(learnermodel);
		}
		
		return LearnerList;
/*
		List<Learner> getLearner = new ArrayList<Learner>();
		Learner learner1 = new Learner();

		learner1.setRequestId(1001);
		learner1.setUserId(2001);
		learner1.setRole("Learner");
		learner1.setCourseId(3001);
		learner1.setRmid(4001);
		learner1.setApprovalId(5001);
		learner1.setApprovalStatus("Aproved");
		learner1.setStatusMessage("Request Approved");
		learner1.setAssignmentId(6001);
		learner1.setAssignmentStatus("Assigned");
		learner1.setAssignmentStatusMessage("Assignment Assigned");
		learner1.setLearnerDescription("Student");
		learner1.setLearnerScore("91");
		// learner1.setLast_update_on(2021-07-16-00.00.00.000001);

		getLearner.add(learner1);

		Learner learner2 = new Learner();

		learner2.setRequestId(1002);
		learner2.setUserId(2002);
		learner2.setRole("Learner");
		learner2.setCourseId(3002);
		learner2.setRmid(4002);
		learner2.setApprovalId(5002);
		learner2.setApprovalStatus("Pending");
		learner2.setStatusMessage("Request Pending");
		learner2.setAssignmentId(6002);
		learner2.setAssignmentStatus("Pending");
		learner2.setAssignmentStatusMessage("Assignment Pending");
		learner2.setLearnerDescription("Student");
		learner2.setLearnerScore("92");
		// learner2.setLast_update_on("2021-07-16-00.00.00.000002");

		getLearner.add(learner2);

		Learner learner3 = new Learner();

		learner3.setRequestId(1003);
		learner3.setUserId(2003);
		learner3.setRole("Learner");
		learner3.setCourseId(3003);
		learner3.setRmid(4003);
		learner3.setApprovalId(5003);
		learner3.setApprovalStatus("Rejected");
		learner3.setStatusMessage("Request Rejected");
		learner3.setAssignmentId(6003);
		learner3.setAssignmentStatus("Not Applicable");
		learner3.setAssignmentStatusMessage("Not Applicable");
		learner3.setLearnerDescription("Student");
		learner3.setLearnerScore("93");
		// learner3.setLast_update_on("2021-07-16-00.00.00.000003");

		getLearner.add(learner3);

		return getLearner;
	*/
	}

	

}