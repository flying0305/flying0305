package com.myRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MyRule {
	@Bean
	public IRule myRule() {
		//return new RandomRule();//用随机算法替代轮询算法
		//return new RetryRule(); //各个服务正常时，就是轮询算法，如果有服务宕了，那么几次访问不通后，就不在去访问宕机的服务了
		return new RandomRule_ZY();//每个机器被访问五次的算法
	} 
}
