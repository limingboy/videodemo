package com.example.system.controller;

import com.example.system.service.DatadicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DatadicController {

    @Autowired
    private DatadicService service;

    @RequestMapping("/getDataDic")
    public Map getDataDic(String bzh){
        return service.getDataDic(bzh);
    }

}
