package com.zifeiyu.common.dao;

import com.zifeiyu.common.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User validate();
}
