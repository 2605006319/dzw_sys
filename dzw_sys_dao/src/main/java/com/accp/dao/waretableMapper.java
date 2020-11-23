package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.waretable;

public interface waretableMapper {
	
	@Select("select * from waretable")
	List<waretable> queryWareTableAll();
	
    int deleteByPrimaryKey(Integer wareid);

    int insert(waretable record);

    int insertSelective(waretable record);

    waretable selectByPrimaryKey(Integer wareid);

    int updateByPrimaryKeySelective(waretable record);

    int updateByPrimaryKey(waretable record);
}