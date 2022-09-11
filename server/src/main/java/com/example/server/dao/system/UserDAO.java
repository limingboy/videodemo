package com.example.server.dao.system;

import com.example.server.entity.system.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
    int deleteByPrimaryKey(String usercode);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String usercode);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}