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
		return learnerDao.saveLearner(learnermodel) > 0
		? "Learner " + learnermodel.getRequestId() + " has been added to eduhub"
		: "Issue with adding learner with requestid " + learnermodel.getRequestId();
	}
	
	@Override
	public String updateLearner(int requestid, Learner updateLearner) {
		return learnerDao.updateLearner( requestid, updateLearner) > 0
				? "Learner with request is " + requestid + " has been update in eduhub"
				: "Issue with updating learner with requestid " + requestid;
	}

	@Override
	public String delete1Learner(int requestid) {
		int deletedLearnerCount;
		deletedLearnerCount = learnerDao.delete1Learner(requestid);
		return deletedLearnerCount > 0
				? " Learner record for request id  " 
					+ requestid + " delete from eduhub"
				: "No record found to delete in learner table with request is " + requestid ;
	}

	@Override
	public String deleteAllLearner() {
		int deletedLearnerCount;
		deletedLearnerCount = learnerDao.deleteAllLearner();
		return deletedLearnerCount > 0
				? deletedLearnerCount + " Learner record delete from eduhub"
				: "No record found to delete in learner table" ;
	}
	
	@Override
	public String deleteAllUser(int userid) {
		int deletedLearnerCount;
		deletedLearnerCount = learnerDao.deleteAllUser(userid);
		return deletedLearnerCount > 0
				? deletedLearnerCount + " Learner record delete for user " 
					+ userid + " from eduhub"
				: "No record found to delete in learner table for user " + userid ;
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