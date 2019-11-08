package com.zff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zff.entities.Flower;

 

@RestController
public class DeptController_Consumer {
	//private final String rest_url_prefix = "http://localhost:8001" ;
	private final String rest_url_prefix = "http://application-name8001" ;
	@Autowired
	RestTemplate restTemplate ;
	
	@RequestMapping(value="/consumer/flower")
	// http://localhost:803/consumer/flower
	public List<Flower> getFlower() {
		return restTemplate.getForObject(rest_url_prefix+"/find", List.class);
	}
}
