package com.zifeiyu.common.dao;

import com.zifeiyu.common.model.entity.ClassifyFunction;
import com.zifeiyu.common.model.entity.ClassifyFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassifyFunctionMapper {
    int countByExample(ClassifyFunctionExample example);

    int deleteByExample(ClassifyFunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassifyFunction record);

    int insertSelective(ClassifyFunction record);

    List<ClassifyFunction> selectByExample(ClassifyFunctionExample example);

    ClassifyFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassifyFunction record, @Param("example") ClassifyFunctionExample example);

    int updateByExample(@Param("record") ClassifyFunction record, @Param("example") ClassifyFunctionExample example);

    int updateByPrimaryKeySelective(ClassifyFunction record);

    int updateByPrimaryKey(ClassifyFunction record);
}