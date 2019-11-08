package com.zff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * 项目启动后在浏览器 运行 地址+端口，出现页面说明配置成功，就行地址+8080的tomcat出现猫一样的原理
 *
 */
/**
 * 
 *eureka集群
 *A:新建几个Eureka，设置不同
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001APP {

	public static void main(String[] args) {
		SpringApplication.run(Eureka7001APP.class, args);

	}

}
