package com.iking.muster.beetlsql;

import com.iking.muster.beetlsql.dao.BeetlAccountDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangk
 * @create 2018-04-19 18:32
 **/
@RestController
public class BeetlController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BeetlAccountDao beetlAccountDao;

    @GetMapping("/beetlsql/list")
    public List<BmAccount> getAccountList(){
        return  beetlAccountDao.all();
    }

    @GetMapping("/beetlsql/{id}")
    public BmAccount getAccountById(@PathVariable("id")int id ){
        return  beetlAccountDao.selectAccountById(id);
    }
    @GetMapping("/beetlsql/name")
    public BmAccount getAccountByName( ){
        return  beetlAccountDao.selectAccountByName("李四");
    }
}
