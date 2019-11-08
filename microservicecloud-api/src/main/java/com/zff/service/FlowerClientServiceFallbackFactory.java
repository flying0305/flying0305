package com.zff.service;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zff.entities.Flower;
import feign.hystrix.FallbackFactory;

@Component /*这个注解一定不能忘*/
public class FlowerClientServiceFallbackFactory implements FallbackFactory<FlowerService> {

	public FlowerService create(Throwable cause) {
		return new FlowerService() {
			public List<Flower> getFlower() {
				return null;
			}
			 
		};
	}

}
