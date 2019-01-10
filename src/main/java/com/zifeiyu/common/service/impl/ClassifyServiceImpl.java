package com.zifeiyu.common.service.impl;

import com.zifeiyu.common.dao.ClassifyPageMapper;
import com.zifeiyu.common.dao.ClassifyPriceMapper;
import com.zifeiyu.common.dao.TipsMapper;
import com.zifeiyu.common.model.entity.*;
import com.zifeiyu.common.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    private ClassifyPriceMapper classifyPriceMapper;

    @Autowired
    private ClassifyPageMapper classifyPageMapper;

    @Autowired
    private TipsMapper tipsMapper;

    @Override
    public List<ClassifyPrice> listPrice() {
        return classifyPriceMapper.selectByExample(new ClassifyPriceExample());
    }

    @Override
    public List<ClassifyPage> listPages() {
        return classifyPageMapper.selectByExample(new ClassifyPageExample());
    }

    @Override
    public List<Tips> listTips() {
        return tipsMapper.selectByExample(new TipsExample());
    }
}
