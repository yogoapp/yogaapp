package com.woniuxy.dao;

import com.woniuxy.pojo.Signing;

public interface SigningMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Signing record);

    int insertSelective(Signing record);

    Signing selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Signing record);

    int updateByPrimaryKey(Signing record);
}