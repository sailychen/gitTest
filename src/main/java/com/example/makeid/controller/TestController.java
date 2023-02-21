package com.example.makeid.controller;

import com.example.makeid.model.entity.Test;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiChen
 * @program gitDemon
 * @description 测试
 * @create 2023-02-21
 */
@RestController
@RequestMapping("/test/")
public class TestController {


    @RequestMapping(value = "/str",method = RequestMethod.POST)
    public String test(@RequestBody Test test){
        return "这是一个测试";
    }
}
