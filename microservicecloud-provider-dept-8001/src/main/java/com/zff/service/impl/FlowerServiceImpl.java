package com.zff.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zff.dao.FlowerDao;
import com.zff.entities.Flower;
import com.zff.service.FlowerService;

@Service
public class FlowerServiceImpl implements FlowerService{
	@Autowired
	FlowerDao flowerDao ;
	public List<Flower> listFlower() {
		return flowerDao.selectFlower();
	}

}
