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
	public String updateLearner(int requestid, Learner updateLearner) {
		String message="";
		int response=learnerDao.updateLearner( requestid, updateLearner);
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
		String message="";
		int response=learnerDao.deleteAllLearner();
		if (response!=0) {
			message="delete all learner Successful";
		} else {
			message="delete all Failed";
		}
		return message;
	}
	
	@Override
	public String deleteAllUser(int userid) {
		String message="";
		int response=learnerDao.deleteAllUser(userid);
		if (response!=0) {
			message="delete all for user  Successful";
		} else {
			message="delete all for user Failed";
		}
		return message;
	}

	@Override
	public List<Learner> view1Learner(int userid) {
		List<Learner> LearnerList=new ArrayList<>();
		
		for(Map<String, Object> eachresponse:learnerDao.view1Learner(userid)) {
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

	@Override
	public List<Learner> viewRequest(int requestId) {
		List<Learner> LearnerList=new ArrayList<>();
		
		for(Map<String, Object> eachresponse:learnerDao.viewRequest(requestId)) {
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

	
	@Override
	
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

	}
	
}