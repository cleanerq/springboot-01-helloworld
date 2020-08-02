package com.qby.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qby
 * @date 2020/7/31 1:05
 */
@Controller
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return name + " Hello world";
    }
}
