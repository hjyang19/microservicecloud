package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced // 将 RestTemplate 标记为使用 RibbonLoadBalancerClient 作为负载均衡模版。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}