package com.codeman.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 张鸿杰
 * Date：2019-05-13
 * Time:21:31
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myIRurl() {
//        return new RandomRule(); //Ribbon负载均衡改为随机轮询
        return new RandomRule_ZY(); //Ribbon负载均衡改为随机轮询
    }
}
