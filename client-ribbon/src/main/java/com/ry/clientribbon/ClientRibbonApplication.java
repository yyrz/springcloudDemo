package com.ry.clientribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient

public class ClientRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientRibbonApplication.class, args);
    }

    @Bean(name = "ribbonRestTemplate")
    @LoadBalanced
    RestTemplate ribbonRestTemplate() {
        return new RestTemplate();
    }

    @Bean(name = "commonRestTemplate")
    RestTemplate commonRestTemplate() {
        return new RestTemplate();
    }
}
