package com.example.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.example.system.Dao")
public class SystemApplication {

    public static void main(String[] args) {
        // SpringApplication.run(SystemApplication.class, args);
        SpringApplication app = new SpringApplication(SystemApplication.class);
        ConfigurableEnvironment environment = app.run(args).getEnvironment();
        System.out.println("System 启动成功! 端口:" + environment.getProperty("server.port"));
    }

}
