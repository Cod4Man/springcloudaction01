package com.codeman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 张鸿杰
 * Date：2019-05-13
 * Time:9:26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.codeman.springcloud"})
//@ComponentScan("com.codeman.springcloud")
public class ConsumerApplicationStart_Feign
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerApplicationStart_Feign.class, args);
    }
}
