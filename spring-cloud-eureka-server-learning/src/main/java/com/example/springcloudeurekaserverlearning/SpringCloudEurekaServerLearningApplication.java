package com.example.springcloudeurekaserverlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServerLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerLearningApplication.class, args);
    }

}
