package com.atos.eduhub.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Demo;
import com.atos.eduhub.service.DemoService;

@Component
public class DemoServiceImpl implements DemoService {

	@Override
	public Demo addDemo(Demo newDemo) {
		newDemo.setName("Chandravadhana - Add New Demo");
		return newDemo;
	}

	@Override
	public Demo updateDemo(int id, Demo updateDemo) {
		if (id == 1) {
			updateDemo.setName("Chandravadhana - Update Demo 1");
		} else {
			updateDemo.setName("Chandravadhana - Update Demo non-1");
		}

		return updateDemo;
	}

	@Override
	public String deleteDemo(int id) {
		return "Deleted id" + id;
	}

	@Override
	public List<Demo> getAllDemo() {
		List<Demo> getDemo = new ArrayList<Demo>();
		Demo demo1 = new Demo();
		demo1.setId(5);
		demo1.setName("Akshayaa");
		getDemo.add(demo1);
		Demo demo2 = new Demo();
		demo2.setId(7);
		demo2.setName("Yazhnilaa");
		getDemo.add(demo2);
		return getDemo;
	}

	@Override
	public Demo getDemoById(int id) {
		Demo demo = new Demo();
		return demo;
	}

}
