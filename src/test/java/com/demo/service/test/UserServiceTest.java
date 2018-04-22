package com.demo.service.test;

import static org.junit.Assert.*;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.UserMapper;
import com.demo.test.base.BaseJunit4Test;

public class UserServiceTest extends BaseJunit4Test{
	@Resource
	private UserMapper userMapper;
    private Logger log=Logger.getLogger(UserServiceTest.class);
	@Test
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void testFindUserById() {
		Integer id=1;
		Map<String,Object> jsonData=userMapper.selectByPrimaryKey(id);
		log.info("*********************"+jsonData.toString());
		fail("Not yet implemented");
	}

}
