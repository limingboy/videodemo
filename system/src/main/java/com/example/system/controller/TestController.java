package com.example.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "suscess";
    }


    /*
    ssm 整合
    1、依赖mybatis等相关依赖jar包
    2、配置数据源
    3、配置SqlSessionFactoryBean(数据源 映射文件、别名扫描)
    4、mybatis:scan  -扫描映射接口
    方式：
        1、每一个接口加一个@Mapper注解
        2、或者 在启动类上加上 @MapperScan("com.example.system.Dao")
    5、在service注入dao层
     */
}
