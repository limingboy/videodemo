package com.example.system.dao;

import com.example.system.entity.DatadicData;
import com.example.system.entity.DatadicDataKey;
import org.springframework.stereotype.Repository;

@Repository
public interface DatadicDataDAO {
    int deleteByPrimaryKey(DatadicDataKey key);

    int insert(DatadicData record);

    int insertSelective(DatadicData record);

    DatadicData selectByPrimaryKey(DatadicDataKey key);

    int updateByPrimaryKeySelective(DatadicData record);

    int updateByPrimaryKey(DatadicData record);
}