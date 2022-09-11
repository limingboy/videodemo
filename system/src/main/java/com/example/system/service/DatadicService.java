package com.example.system.service;

import com.example.system.dao.DatadicDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DatadicService {

    @Autowired
    private DatadicDAO dao;

    public Map getDataDic(String bzh){
        List ls=dao.selectVDataDicByBzh(bzh);
        Map map=new HashMap();
        map.put("dataList",ls);
        map.put("flag",true);
        map.put("mess","操作成功");
        return map;
    }

}
