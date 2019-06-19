package com.woniuxy.dao;

import com.woniuxy.pojo.Trading;

public interface TradingMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Trading record);

    int insertSelective(Trading record);

    Trading selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Trading record);

    int updateByPrimaryKey(Trading record);
}