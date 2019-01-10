package com.zifeiyu.common.dao.mapper;

import com.zifeiyu.common.model.entity.Tips;
import com.zifeiyu.common.model.entity.TipsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipsMapper {
    int countByExample(TipsExample example);

    int deleteByExample(TipsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tips record);

    int insertSelective(Tips record);

    List<Tips> selectByExample(TipsExample example);

    Tips selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tips record, @Param("example") TipsExample example);

    int updateByExample(@Param("record") Tips record, @Param("example") TipsExample example);

    int updateByPrimaryKeySelective(Tips record);

    int updateByPrimaryKey(Tips record);
}