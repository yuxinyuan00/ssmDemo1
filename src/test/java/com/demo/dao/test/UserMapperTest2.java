package com.demo.dao.test;

import static org.junit.Assert.*;
import com.demo.bean.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.demo.bean.User;
import com.demo.dao.UserMapper;
import com.demo.service.test.UserServiceTest;
import com.demo.test.base.BaseJunit4Test;

public class UserMapperTest2 extends BaseJunit4Test{
	@Resource
	private UserMapper userMapper;
    private Logger log=Logger.getLogger(UserServiceTest.class);
	@Test
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void testDeleteByPrimaryKey() {
/*		Integer id=1;*/
		
		fail("Not yet implemented");
	}

	@Test
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void testInsert() {
		Map<String,Object> userMap=new HashMap<String,Object>();
		Integer id=3;
		String name="王浩";
		String password="1q2w!Q@W";
		userMap.put("id", id);
		userMap.put("name", name);
		userMap.put("password", password);
		int result=userMapper.insert(userMap);
		log.info(result);
		fail("Not yet implemented");
	}

	@Test
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void testInsertSelective() {
		Map<String,Object> userMap=new HashMap<String,Object>();
		Integer id=5;
		String name="王浩";
		String password="1q2w!Q@W";
		userMap.put("id", id);
		userMap.put("name", name);
		userMap.put("password", password);
		int result=userMapper.insert(userMap);
		log.info("//*********************///"+result);
		fail("Not yet implemented");
	}

	@Test
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void testSelectByPrimaryKey() {
		Integer id=1;
		Map<String,Object> jsonData=userMapper.selectByPrimaryKey(id);
		log.info("*********************"+jsonData.toString());
	}

	@Test
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void testSelectAllUsersIntegerInteger() {
		fail("Not yet implemented");
	}

	@Test
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void testSelectAllUsers() {
		List<Map<String,Object>> userList= userMapper.selectAllUsers();
/*		List<Object> userMaps = null;*/
		for(int i=0;i<userList.size();i++) {
			/*userMaps.add(userList[i]);*/
			Map<String,Object> userMap=userList.get(i);
			/*userMaps.add(user.getUserMap());*/
			log.info("************"+userMap.toString()+"****************");
			log.info("*****************");
			log.info("*****************");
			log.info("*****************");
			log.info("******************");
		}
		log.info("******************"+userList.toString()+"*******************");
		fail("Not yet implemented");		
	}

}
