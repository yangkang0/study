package com.iking.muster.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @author yangk
 * @create 2018-04-19 17:53
 **/
@NoRepositoryBean
public interface BaseJPA<T,ID> extends JpaRepository<T,ID>,JpaSpecificationExecutor<T>,Serializable {

}
