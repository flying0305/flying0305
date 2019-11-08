package com.zff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zff.entities.Flower;
import com.zff.service.FlowerService;

@RestController
public class DeptController_Consumer {
	 
	@Autowired
	FlowerService flowerService ;
	//这个链接是用户在浏览器上访问的链接
	@RequestMapping(value="/feign/consumer/flower")
	public List<Flower> getFlower() {
		System.out.println("feign==Controller");
		//flowerService接口那写的是8001微服务的controller那mapping的值
		return this.flowerService.getFlower();
	}
}
