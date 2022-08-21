package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

    public static void main(String[] args) {
        //SpringApplication.run(GatewayApplication.class, args);
        SpringApplication app = new SpringApplication(GatewayApplication.class);
        ConfigurableEnvironment environment = app.run(args).getEnvironment();
        System.out.println("Gateway 启动成功! 端口:" + environment.getProperty("server.port"));
    }

}
