package com.example.video.controller;

import com.example.server.service.system.DatadicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class VideoController {

    @Autowired
    private DatadicService service;

    @RequestMapping("/getDatadicDataALL")
    public Map getDatadicDataALL(){
      return service.getDataDic("");
    }

    @RequestMapping("/videotest")
    public String videotest(){
        return "测试成功";
    }

}
