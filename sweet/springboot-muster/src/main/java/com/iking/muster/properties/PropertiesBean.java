package com.iking.muster.properties;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 将配置信息加载到实体对象中
 *
 * @author yangk
 * @create 2018-04-19 16:56
 **/
@Configuration
@PropertySource(value = "classpath:mybean-dev.properties")
@ConfigurationProperties(prefix = "bean")
@Data
public class PropertiesBean {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    private String name;
    private int year;
    private int month;
    private int day;
}
