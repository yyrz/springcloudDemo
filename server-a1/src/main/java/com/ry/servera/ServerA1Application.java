package com.ry.servera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerA1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerA1Application.class, args);
    }
}
