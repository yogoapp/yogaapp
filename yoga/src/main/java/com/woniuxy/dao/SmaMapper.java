package com.woniuxy.dao;

import com.woniuxy.pojo.Sma;

public interface SmaMapper {
    int deleteByPrimaryKey(Integer smid);

    int insert(Sma record);

    int insertSelective(Sma record);

    Sma selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Sma record);

    int updateByPrimaryKey(Sma record);
}