package com.codeman.springcloud;

import com.codeman.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 张鸿杰
 * Date：2019-05-13
 * Time:9:26
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
//在服务启动时，加载我们自定义的配置类，使其生效
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MyselfRule.class)
public class ConsumerApplicationStart {
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerApplicationStart.class, args);
    }
}
