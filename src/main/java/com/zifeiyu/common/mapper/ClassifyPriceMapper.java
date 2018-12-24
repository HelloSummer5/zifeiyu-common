package com.zifeiyu.common.mapper;

import com.zifeiyu.common.model.entity.ClassifyPrice;
import com.zifeiyu.common.model.entity.ClassifyPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassifyPriceMapper {
    int countByExample(ClassifyPriceExample example);

    int deleteByExample(ClassifyPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassifyPrice record);

    int insertSelective(ClassifyPrice record);

    List<ClassifyPrice> selectByExample(ClassifyPriceExample example);

    ClassifyPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassifyPrice record, @Param("example") ClassifyPriceExample example);

    int updateByExample(@Param("record") ClassifyPrice record, @Param("example") ClassifyPriceExample example);

    int updateByPrimaryKeySelective(ClassifyPrice record);

    int updateByPrimaryKey(ClassifyPrice record);
}