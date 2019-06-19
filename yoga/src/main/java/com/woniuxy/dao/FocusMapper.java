package com.woniuxy.dao;

import com.woniuxy.pojo.Focus;

public interface FocusMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Focus record);

    int insertSelective(Focus record);

    Focus selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Focus record);

    int updateByPrimaryKey(Focus record);
}