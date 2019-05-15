package com.codeman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 张鸿杰
 * Date：2019-05-15
 * Time:19:35
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_App {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_App.class, args);
    }
}
