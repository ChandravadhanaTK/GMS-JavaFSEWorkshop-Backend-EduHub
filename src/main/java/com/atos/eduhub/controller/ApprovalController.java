package com.atos.eduhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.atos.eduhub.model.Approval;
import com.atos.eduhub.service.ApprovalService;

/*
Use following HTTP methods:
POST - Add approval
PUT - Edit Approval
DELETE - delete approval
GET - get approval details
*/

@RestController
@RequestMapping("/eduhubapi/v1")
public class ApprovalController {

	@Autowired(required = true)
	ApprovalService approvalService;

	// Add REST API Demo - POST Http Request

	@PostMapping("/approval")
	public @ResponseBody Approval addApproval(@RequestBody Approval approval) {

		System.out.println("Post request received for addApproval() for id " + approval.getApprovalId());
		return approvalService.addApproval(approval);
	}

	//Delete REST API Demo
	 @DeleteMapping("deleteapproval/{approvalId}")
	public String deleteCourse(@PathVariable(value=	"approvalId") int approvalId)

	{
		return "Deleted Approval id  " +  approvalId;

	}
	//Delete all REST API Demo

	@DeleteMapping("/deleteallapproval")
	public @ResponseBody String deleteAllApprovals() {
		return approvalService.deleteAllApprovals();
	}
}
