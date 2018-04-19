package com.iking.muster.controller;

import com.iking.muster.properties.PropertiesBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangk
 * @create 2018-04-19 14:20
 **/
@RestController
@EnableConfigurationProperties({PropertiesBean.class})
public class HelloController {

    private  static  final  String hello="hello/";
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${project.name}")
    private  String projectName;

    @Autowired
    PropertiesBean propertiesBean;


    @RequestMapping(hello+"/test")
    public   String HelloTest(){
        logger.info("项目名称为"+projectName);
        logger.info("将配置文件加载到对象中==》"+propertiesBean.getName());
        return  "TEST；项目名称为"+projectName;
    }
}
