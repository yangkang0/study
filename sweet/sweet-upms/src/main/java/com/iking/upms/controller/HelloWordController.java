package com.iking.upms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    private static final String cxtPath = "hello/";


    @Value("${iking.yk.name}")
    private String name ;

    @RequestMapping(cxtPath+"/test")
    public  String helloTest(){
        System.out.println("=====我的名字是"+name);
        return  "TEST";
    }


}
