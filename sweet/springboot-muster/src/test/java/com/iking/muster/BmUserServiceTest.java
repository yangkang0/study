package com.iking.muster;

import com.iking.muster.beetlsql.service.BmUserService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** 
* BmUserService Tester. 
* 
* @author <Authors name> 
* @since <pre> 20, 2018</pre>
* @version 1.0 
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class BmUserServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addBmUser() 
* 
*/

@Autowired
BmUserService bmUserService;

@Test
public void testAddBmUser() throws Exception {
    bmUserService.addBmUser();
} 


} 
