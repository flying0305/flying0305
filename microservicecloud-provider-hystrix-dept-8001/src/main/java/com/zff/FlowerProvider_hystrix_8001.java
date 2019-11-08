package com.zff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //这个类启动后会将这个服务自动注册进eureka的服务端
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class FlowerProvider_hystrix_8001 {

	public static void main(String[] args) {
		SpringApplication.run(FlowerProvider_hystrix_8001.class, args);
	}

}
