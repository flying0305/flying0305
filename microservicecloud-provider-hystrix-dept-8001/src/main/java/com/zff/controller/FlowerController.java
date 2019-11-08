package com.zff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zff.entities.Flower;
import com.zff.service.FlowerService;

/*
 * @pathvariable("") 占位符映射
 * */
@RestController
public class FlowerController {
	@Autowired
	FlowerService flowerService ;
	//这个提供给feign的server来访问，写的要和这个“/find”一样
	@RequestMapping(value="/hystrix/find")
	/*fallbackMethod的值就是报错时要调用的方法
	这种熔断处理的方式是每个业务逻辑的方法都要加一个对应的方法，这样会产生太多的方法，我们需要解耦合，
	去接口里处理，也就是去api里进行处理，建一个类，实现fallbackFactory<api里的这个方法调的service>
	*/
	//@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public List<Flower> getFlower() {
		System.out.println("=============");
		List<Flower> flowerList = flowerService.listFlower();
		if(null==flowerList) {
			throw new RuntimeException("没有对应的花卉信息");
		} 
		return flowerList;
	}
	public List<Flower> processHystrix_Get() {
		System.out.println("Hystrix_Get=============");
		//这个方法返回的类型必须和添加这个熔断方法的返回值是一样的，
		//下边返回可以自己写-----------
		return null;
	}
}
