package com.zff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApp {
    /*
     * 写这个监控的步骤：
     * 1：pom里加hystrix和hystrix-dashboard坐标
     * 2：yml里定义端口
     * 3：在启动类上加@EnableHystrixDashboard注解
     * 4：在需要被监控的微服务的pom里加actuator坐标
      *  访问路径为 http://localhost:端口9001/hystrix
      *  启动hystrix8001
      * 我们用这个监控去监控hystrix8001这个微服务
      * 
      *  看监控的日志代码地址   http://localhost:（监控服务的端口）8001/hystrix.stream 
      *  看监控的日志的图形   
      *  1：将看代码的地址填上 监控谁写谁的端口  http://localhost:（监控服务的端口）8001/hystrix.stream 
      *  2：Delay:多久监控一次
     * 
     * */
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApp.class, args);
	}

}
