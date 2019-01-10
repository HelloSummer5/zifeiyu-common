package com.zifeiyu.common.service;

import com.zifeiyu.common.model.entity.ClassifyPage;
import com.zifeiyu.common.model.entity.ClassifyPrice;
import com.zifeiyu.common.model.entity.Tips;

import java.util.List;

/**
 * 分类列表
 */
public interface ClassifyService {
    List<ClassifyPrice> listPrice();
    List<ClassifyPage> listPages();
    List<Tips> listTips();
}
