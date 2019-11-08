package com.zff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //这个类启动后会将这个服务自动注册进eureka的服务端
public class FlowerProvider_8003 {

	public static void main(String[] args) {
		SpringApplication.run(FlowerProvider_8003.class, args);
	}

}
