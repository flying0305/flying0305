package com.zff.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zff.entities.Flower;

@FeignClient(value="APP",fallbackFactory=FlowerClientServiceFallbackFactory.class)
public interface FlowerService {
	@RequestMapping(value="/find")
	public List<Flower> getFlower();  
}
