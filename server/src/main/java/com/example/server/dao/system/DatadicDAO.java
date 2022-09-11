package com.example.server.dao.system;

import com.example.server.entity.system.Datadic;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatadicDAO {
    int deleteByPrimaryKey(String typedm);

    int insert(Datadic record);

    int insertSelective(Datadic record);

    Datadic selectByPrimaryKey(String typedm);

    int updateByPrimaryKeySelective(Datadic record);

    int updateByPrimaryKey(Datadic record);

    List selectVDataDicByBzh(String bzh);
}