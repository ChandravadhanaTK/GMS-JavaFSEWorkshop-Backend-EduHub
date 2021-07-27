package com.atos.eduhub.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Approval;
import com.atos.eduhub.service.ApprovalService;

/*
Use following HTTP methods:
POST - Add approval
PUT - Edit Approval
DELETE - delete one approval
DELETE - delete all approvals
GET - view one  approval detailsg
GET - view all approval details
*/

@RestController
@RequestMapping("/eduhubapi/v1")
public class ApprovalController {

	@Autowired(required = true)
	ApprovalService approvalService;

	// Add REST API Demo - POST Http Request
	@PostMapping("/approval")
	@ResponseBody
	public Approval addApproval(@RequestBody Approval approval) {
		System.out.println("Post request received for addApproval() for id " + approval.getApprovalId());
		return approvalService.addApproval(approval);
	}

	// Edit Approval
	@PutMapping("/approval")
	public Approval editApproval(@RequestBody Approval approval) {
		System.out.println("Put request received for editApproval() for id " + approval.getApprovalId());
		return approvalService.editApproval(approval);
	}

	// Delete single approval
	// Delete REST API Demo
	@DeleteMapping("deleteapproval/{approvalId}")
	public String deleteCourse(@PathVariable(value = "approvalId") int approvalId) {
		return "Deleted Approval id  " + approvalId;
	}

	// Delete all approvals
	// Delete all REST API Demo
	@DeleteMapping("/deleteallapproval")
	@ResponseBody
	public String deleteAllApprovals() {
		return approvalService.deleteAllApprovals();
	}

	@GetMapping("/approval/{id}")
	@ResponseBody
	public Approval viewOneApprovalDetails(@PathVariable(value = "id") int id) {
		System.out.println("Get request received for viewOneApprovalDetails() for id " + id);
		return approvalService.viewOneApproval(id);
	}

	@GetMapping("/approvals")
	@ResponseBody
	public List<Approval> viewAllApprovalDetails() {
		System.out.println("Get request received for viewAllApprovalDetails() ");
		return approvalService.viewAllApprovals();
	}

}
