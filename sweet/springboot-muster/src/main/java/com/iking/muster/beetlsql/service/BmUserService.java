package com.iking.muster.beetlsql.service;

import com.iking.muster.beetlsql.bean.BmUser;
import org.beetl.sql.core.SQLManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author yangk
 * @create 2018-04-20 11:12
 **/
@Service
public class BmUserService {
    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    SQLManager sqlManager;

    public  void addBmUser(){
//        BmUser bmUser = new BmUser();
//        bmUser.setAge(2);
//        bmUser.setName("金合2");
//        bmUser.setCreateDate(new Date());
//        bmUser.setRoleId(2);
//        bmUser.setUserName("iking2");
//        sqlManager.insert(bmUser);
//
//        bmUser = sqlManager.unique(BmUser.class,1);
//        System.out.println("========"+bmUser.getUserName());
//
        BmUser query = new BmUser();
        query.setName("陕西金合信息");
        List<BmUser> bmUsers = sqlManager.template(query);
        System.out.println("========bmUsers  查询到记录数："+bmUsers.size());
//
//        bmUser = new BmUser();
//        bmUser.setId(1);
//        bmUser.setName("陕西金合信息");
//        sqlManager.updateTemplateById(bmUser);
//        System.out.println("========modfiyBmUser完成");

        //使用user.md 文件里的select语句，参考下一节。
        BmUser query2 = new BmUser();
        query2.setName("陕西金合信息");

        List<BmUser> list2 = sqlManager.select("user.select",BmUser.class,query2);
        System.out.println("========list2  查询到记录数："+list2.size());
    }






}
