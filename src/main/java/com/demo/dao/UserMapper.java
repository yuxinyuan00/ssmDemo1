package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    Map<String,Object> selectByPrimaryKey(Integer id);
    
    List<User> selectAllUsers(Integer start,Integer limit);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<User> selectAllUsers();
}