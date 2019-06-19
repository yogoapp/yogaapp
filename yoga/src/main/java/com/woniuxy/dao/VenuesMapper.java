package com.woniuxy.dao;

import com.woniuxy.pojo.Venues;

public interface VenuesMapper {
    int deleteByPrimaryKey(Integer vid);

    int insert(Venues record);

    int insertSelective(Venues record);

    Venues selectByPrimaryKey(Integer vid);

    int updateByPrimaryKeySelective(Venues record);

    int updateByPrimaryKey(Venues record);
}