package com.woniuxy.dao;

import com.woniuxy.pojo.Ctime;

public interface CtimeMapper {
    int deleteByPrimaryKey(Integer ctid);

    int insert(Ctime record);

    int insertSelective(Ctime record);

    Ctime selectByPrimaryKey(Integer ctid);

    int updateByPrimaryKeySelective(Ctime record);

    int updateByPrimaryKey(Ctime record);
}