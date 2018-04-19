package com.iking.muster.jpa;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * 账户表
 *
 * @author yangk
 * @create 2018-04-19 17:41
 **/
@Data
@Entity
@Table(name = "bm_account")
public class JpaAccountBean {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private  int id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
}
