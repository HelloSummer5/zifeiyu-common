package com.zifeiyu.common.mapper;

import com.zifeiyu.common.model.entity.ShopsDetail;
import com.zifeiyu.common.model.entity.ShopsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopsDetailMapper {
    int countByExample(ShopsDetailExample example);

    int deleteByExample(ShopsDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopsDetail record);

    int insertSelective(ShopsDetail record);

    List<ShopsDetail> selectByExample(ShopsDetailExample example);

    ShopsDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopsDetail record, @Param("example") ShopsDetailExample example);

    int updateByExample(@Param("record") ShopsDetail record, @Param("example") ShopsDetailExample example);

    int updateByPrimaryKeySelective(ShopsDetail record);

    int updateByPrimaryKey(ShopsDetail record);
}