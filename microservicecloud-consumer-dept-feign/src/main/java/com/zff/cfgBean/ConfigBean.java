package com.zff.cfgBean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration //ConfigBean类名+@Configuration注解=spring的application.xml文件
public class ConfigBean {
	/*
	 * RestTemplate = application.xml文件bean节点里的id值
	 *  方法里的new RestTemplate() = application.xml文件bean节点里的class的值
	 *  这里的RestTemplate是spring里提供的模板
	 * 相当于 spring的jdbcTemplate模板
	 * */
	 
	/*干活的是这个rest,让他进行负载均衡，
	 * 默认算法是轮询，每个实例一次
	 * 可以自己配置riboon的算法，一共七个*/
	@Bean
	@LoadBalanced 
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	/*
	 * @Bean public IRule myRule() { //return new RandomRule();//用随机算法替代轮询算法 return
	 * new RetryRule(); //各个服务正常时，就是轮询算法，如果有服务宕了，那么几次访问不通后，就不在去访问宕机的服务了 }
	 */
}
