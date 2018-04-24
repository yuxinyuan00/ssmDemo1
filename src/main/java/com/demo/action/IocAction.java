package com.demo.action;
import java.util.List;
import java.util.Map;

import com.demo.serviceImpl.UserServiceImpl;

public class IocAction extends UserServiceImpl {
	private static final long serialVersionUID = 1L;
	private Map<String,Object> jsonData;
	private List<Map<String,Object>> userList;
	public Map<String, Object> getJsonData() {
		return jsonData;
	}
	public List<Map<String, Object>> getUserList() {
		return userList;
	}
	public void setUserList(List<Map<String, Object>> userList) {
		this.userList = userList;
	}
	public void setJsonData(Map<String, Object> jsonData) {
		this.jsonData = jsonData;
	}
	public String queryUser() {
		// TODO Auto-generated constructor stub
		Integer id=1;
		Map<String,Object> jsonData=selectByPrimaryKey(id);
		setJsonData(jsonData);
		List<Map<String,Object>> userList=selectAllUsers();
		setUserList(userList);
		System.out.println(jsonData.toString());
		System.out.println(userList.toString());
		return "success";
	}
	
	public String queryAllUsers() {
		List<Map<String,Object>> userList=selectAllUsers();
		setUserList(userList);
		System.out.println(userList.toString());
		return "succcess";
	}

}
