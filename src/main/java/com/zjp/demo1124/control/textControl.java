package com.zjp.demo1124.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class textControl {

    @RequestMapping(value = "/log")
    public String log(){
        return "hello spring boot!--22233";
    }
}
