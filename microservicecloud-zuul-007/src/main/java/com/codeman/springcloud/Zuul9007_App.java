package com.codeman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.codeman.springcloud"})
@EnableZuulProxy //Zuul代理
public class Zuul9007_App {
	public static void main(String[] args)
	{
		SpringApplication.run(Zuul9007_App.class, args);
	}
}
