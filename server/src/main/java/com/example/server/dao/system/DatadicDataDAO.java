package com.example.server.dao.system;

import com.example.server.entity.system.DatadicData;
import com.example.server.entity.system.DatadicDataKey;
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