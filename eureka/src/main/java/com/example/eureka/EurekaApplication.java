package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {

        //SpringApplication.run(EurekaApplication.class, args);
        SpringApplication app=new SpringApplication(EurekaApplication.class);
        ConfigurableEnvironment environment = app.run(args).getEnvironment();
        System.out.println("Eureka 启动成功! 端口:"+environment.getProperty("server.port"));
    }

}
