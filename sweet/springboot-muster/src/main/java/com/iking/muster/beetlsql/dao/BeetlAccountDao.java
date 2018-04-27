package com.iking.muster.beetlsql.dao;

import com.iking.muster.beetlsql.bean.BmAccount;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * @author yangk
 * @create 2018-04-19 18:29
 **/
@SqlResource("account")
public interface BeetlAccountDao extends BaseMapper<BmAccount> {

    BmAccount selectAccountById(int id);
    BmAccount selectAccountByName(String code);
}
