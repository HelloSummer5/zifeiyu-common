package com.zifeiyu.common.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="/test1", tags="测试接口模块")
@RestController
@RequestMapping("/test")

public class TestSwaggerController {
    @ApiOperation(value="展示首页信息value", notes = "展示首页信息notes")
    @GetMapping("/show")
    public Object showInfo(){
        return "hello world";
    }
}
