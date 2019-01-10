package com.zifeiyu.common.dao;

import com.zifeiyu.common.model.entity.ClassifyPage;
import com.zifeiyu.common.model.entity.ClassifyPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassifyPageMapper {
    int countByExample(ClassifyPageExample example);

    int deleteByExample(ClassifyPageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassifyPage record);

    int insertSelective(ClassifyPage record);

    List<ClassifyPage> selectByExample(ClassifyPageExample example);

    ClassifyPage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassifyPage record, @Param("example") ClassifyPageExample example);

    int updateByExample(@Param("record") ClassifyPage record, @Param("example") ClassifyPageExample example);

    int updateByPrimaryKeySelective(ClassifyPage record);

    int updateByPrimaryKey(ClassifyPage record);
}