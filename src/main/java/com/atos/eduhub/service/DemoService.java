package com.atos.eduhub.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Demo;

@Component
public interface DemoService {

	public Demo addDemo(Demo newDemo);

	public Demo updateDemo(int id, Demo newDemo);

	public String deleteDemo(int id);

	public List<Demo> getAllDemo();

	public Demo getDemoById(int id);

}
