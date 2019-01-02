package com.zifeiyu.common.mapper;

import com.zifeiyu.common.model.entity.ShopsImg;
import com.zifeiyu.common.model.entity.ShopsImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopsImgMapper {
    int countByExample(ShopsImgExample example);

    int deleteByExample(ShopsImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopsImg record);

    int insertSelective(ShopsImg record);

    List<ShopsImg> selectByExample(ShopsImgExample example);

    ShopsImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopsImg record, @Param("example") ShopsImgExample example);

    int updateByExample(@Param("record") ShopsImg record, @Param("example") ShopsImgExample example);

    int updateByPrimaryKeySelective(ShopsImg record);

    int updateByPrimaryKey(ShopsImg record);
}