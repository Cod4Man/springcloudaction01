package com.codeman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 张鸿杰
 * Date：2019-05-14
 * Time:16:59
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_Dashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Dashboard_App.class, args);
    }
}
