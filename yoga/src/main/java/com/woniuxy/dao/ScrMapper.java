package com.woniuxy.dao;

import com.woniuxy.pojo.Scr;

public interface ScrMapper {
    int deleteByPrimaryKey(Integer scid);

    int insert(Scr record);

    int insertSelective(Scr record);

    Scr selectByPrimaryKey(Integer scid);

    int updateByPrimaryKeySelective(Scr record);

    int updateByPrimaryKey(Scr record);
}