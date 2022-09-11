package com.example.system.dao;

import com.example.system.entity.Menuinfo;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuinfoDAO {
    int deleteByPrimaryKey(String menucode);

    int insert(Menuinfo record);

    int insertSelective(Menuinfo record);

    Menuinfo selectByPrimaryKey(String menucode);

    int updateByPrimaryKeySelective(Menuinfo record);

    int updateByPrimaryKey(Menuinfo record);
}