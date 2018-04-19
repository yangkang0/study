package com.iking.muster.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangk
 * @create 2018-04-19 17:57
 **/
@RestController
public class JpaAccountController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    JpaAccountDao jpaAccountDao;

    @GetMapping("/account")
    private  String getUserName(){

        JpaAccountBean accountBean = new JpaAccountBean();
        accountBean.setName("张三");
        accountBean.setCode("ZHANG SAN");
        jpaAccountDao.save(accountBean);

        return  accountBean.getName();
    }

}
