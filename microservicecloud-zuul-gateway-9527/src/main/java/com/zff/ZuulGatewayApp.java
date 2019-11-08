package com.zff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
/*
 * http://myzuul:9527/app/find
 * 用上路由网关的访问连接
 * 是 hosts的名字（路由那，也就是application的instance-id节点名字）
 *     ： 路由网关程序端口   /   微服务在eureka的application那显示的名字    /   为服务的访问mapping
 */
public class ZuulGatewayApp {
	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApp.class, args);
	}

}
