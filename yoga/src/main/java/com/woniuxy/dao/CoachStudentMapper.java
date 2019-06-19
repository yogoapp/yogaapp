package com.woniuxy.dao;

import com.woniuxy.pojo.CoachStudent;

public interface CoachStudentMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(CoachStudent record);

    int insertSelective(CoachStudent record);

    CoachStudent selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(CoachStudent record);

    int updateByPrimaryKey(CoachStudent record);
}