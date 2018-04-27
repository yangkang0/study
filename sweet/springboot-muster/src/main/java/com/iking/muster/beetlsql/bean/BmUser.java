package com.iking.muster.beetlsql.bean;


import lombok.Data;

import java.util.Date;

/**
 * @author yangk
 * @create 2018-04-20 11:09
 **/
@Data
public class BmUser {
    private Integer id ;
    private Integer age ;
    //用户角色
    private Integer roleId ;
    private String name ;
    //用户名称
    private String userName ;
    private Date createDate ;
}
