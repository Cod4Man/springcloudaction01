package com.codeman.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 张鸿杰
 * Date：2019-05-13
 * Time:9:08
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //为Rest加入Ribbon配置
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
