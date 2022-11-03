package com.live.file.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(tags = "测试模块")
public class TestController {


    @GetMapping("/tGet")
    @ApiOperation(value = "测试方法")
    public String tGet(){
        return "tGet";
    }
}
