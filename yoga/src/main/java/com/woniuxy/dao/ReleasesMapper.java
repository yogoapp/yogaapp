package com.woniuxy.dao;

import com.woniuxy.pojo.Releases;

public interface ReleasesMapper {
    int deleteByPrimaryKey(Integer rdid);

    int insert(Releases record);

    int insertSelective(Releases record);

    Releases selectByPrimaryKey(Integer rdid);

    int updateByPrimaryKeySelective(Releases record);

    int updateByPrimaryKey(Releases record);
}