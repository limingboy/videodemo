package com.example.server.dao.video;

import com.example.server.entity.video.Usertovideo;
import com.example.server.entity.video.UsertovideoKey;
import org.springframework.stereotype.Repository;

@Repository
public interface UsertovideoDAO {
    int deleteByPrimaryKey(UsertovideoKey key);

    int insert(Usertovideo record);

    int insertSelective(Usertovideo record);

    Usertovideo selectByPrimaryKey(UsertovideoKey key);

    int updateByPrimaryKeySelective(Usertovideo record);

    int updateByPrimaryKey(Usertovideo record);
}