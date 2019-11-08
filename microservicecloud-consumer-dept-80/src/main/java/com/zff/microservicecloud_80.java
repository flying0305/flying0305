package com.zff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.myRule.MyRule;

@SpringBootApplication
@EnableEurekaClient
//让主启动类启动时，根据字定义的ribbon算法，写在MyRule类里，这个类绝对不能和主启动类在同一个包下
@RibbonClient(name="APPLICATION-NAME8001",configuration=MyRule.class)
public class microservicecloud_80 {

	public static void main(String[] args) {
		SpringApplication.run(microservicecloud_80.class,args);
	}

}
