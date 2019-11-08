package com.zff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zff.entities.Flower;
import com.zff.service.FlowerService;

/*
 * @pathvariable("") 占位符映射
 * */
@RestController
public class FlowerController {
	@Autowired
	FlowerService flowerService ;
	@RequestMapping(value="/find")
	public List<Flower> getFlower() {
		System.out.println("=============");
		return flowerService.listFlower();
	}
}
