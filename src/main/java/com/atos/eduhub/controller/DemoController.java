package com.atos.eduhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Demo;
import com.atos.eduhub.service.DemoService;

@RestController
@RequestMapping("/eduhubapi/v1")
public class DemoController {

	@Autowired(required = true)
	DemoService demoService;

	// Add REST API Demo - PUT Http Request
	/*
	 * http://localhost:8080/demo { "id": 1, "name": "Chandra" }
	 */
	@PutMapping("/demo")
	public Demo addDemo(@RequestBody Demo newDemo) {
		return demoService.addDemo(newDemo);
	}

	// Edit/Update REST API Demo
	@PutMapping("/demo/{id}")
	public Demo updateDemo(@PathVariable(name = "id") int id, @RequestBody Demo updateDemo) {
		return demoService.updateDemo(id, updateDemo);
	}

	// Delete REST API Demo
	@DeleteMapping("/demo/{id}")
	public ResponseEntity<Demo> deleteDemo(@PathVariable(value = "id") int id) {
		String deleteString = demoService.deleteDemo(id);
		return ResponseEntity.ok().build();
	}

	// Get all REST API Demo
	@GetMapping("/demo")
	public List<Demo> getAllDemo() {
		return demoService.getAllDemo();
	}

	// Get all REST API Demo
	@GetMapping("/demo/{id}")
	public Demo getDemoById(@PathVariable(value = "id") int id) {
		return demoService.getDemoById(id);
	}

}
