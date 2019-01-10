package com.zifeiyu.common.controller;

import com.zifeiyu.common.dao.UserMapper;
import com.zifeiyu.common.service.ClassifyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value="/test1", tags="测试接口模块")
@RestController
@RequestMapping("/test")
public class TestSwaggerController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ClassifyService classifyService;

    @ApiOperation(value="展示首页信息value", notes = "展示首页信息notes")
    @GetMapping("/show")
    public Object showInfo(){
        return userMapper.validate();
    }

    @GetMapping("list")
    public String testMapper(){
        return classifyService.listPages().toString();
    }
}
