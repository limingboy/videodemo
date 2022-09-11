package com.example.system.dao;

import com.example.system.entity.Datadic;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DatadicDAO {
    int deleteByPrimaryKey(String typedm);

    int insert(Datadic record);

    int insertSelective(Datadic record);

    Datadic selectByPrimaryKey(String typedm);

    int updateByPrimaryKeySelective(Datadic record);

    int updateByPrimaryKey(Datadic record);

    List<Map<Object,Object>> selectVDataDicByBzh(String bzh);
}