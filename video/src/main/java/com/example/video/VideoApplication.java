package com.example.video;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.example")
@MapperScan("com.example.**.dao.**")
public class VideoApplication {

    public static void main(String[] args) {
        //SpringApplication.run(VideoApplication.class, args);
        SpringApplication app = new SpringApplication(VideoApplication.class);
        ConfigurableEnvironment environment = app.run(args).getEnvironment();
        System.out.println("Video 启动成功! 端口:" + environment.getProperty("server.port"));
    }

}
