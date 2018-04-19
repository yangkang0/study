package com.iking.muster.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 项目启动后立即执行
 *
 * @author yangk
 * @create 2018-04-19 16:20
 **/
@Component
public class DicRunner implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) throws Exception {
        logger.info(">>>>>>>>>>>>>项目启动后我立即执行");
    }
}
