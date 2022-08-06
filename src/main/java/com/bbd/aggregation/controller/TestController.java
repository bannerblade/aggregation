package com.bbd.aggregation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author bannerblade
 * @ date 2022/8/6
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/hello")
    public String test(){
        return "hello";
    }
}
