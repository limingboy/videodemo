package com.example.server.dao.video;

import com.example.server.entity.video.Videoinfo;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoinfoDAO {
    int deleteByPrimaryKey(String videodm);

    int insert(Videoinfo record);

    int insertSelective(Videoinfo record);

    Videoinfo selectByPrimaryKey(String videodm);

    int updateByPrimaryKeySelective(Videoinfo record);

    int updateByPrimaryKey(Videoinfo record);
}