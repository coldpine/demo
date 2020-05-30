package com.nndx.demo.controller;

import com.nndx.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String getTest(){
        return "test1";
    }
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    User getUser(){
        User u = new User();
        u.setId("51");
        u.setName("name4");
        return u;
    }
}
