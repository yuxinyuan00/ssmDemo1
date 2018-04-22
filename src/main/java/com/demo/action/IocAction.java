package com.demo.action;
import java.util.Map;

import com.demo.serviceImpl.UserServiceImpl;

public class IocAction extends UserServiceImpl {
	private static final long serialVersionUID = 1L;
	private Map<String,Object> jsonData;
	public Map<String, Object> getJsonData() {
		return jsonData;
	}
	public void setJsonData(Map<String, Object> jsonData) {
		this.jsonData = jsonData;
	}
	@Override
	public String execute() {
		// TODO Auto-generated constructor stub
		Integer id=1;
		Map<String,Object> jsonData=selectByPrimaryKey(id);
		setJsonData(jsonData);
		System.out.println(jsonData.toString());
		return "success";
	}

}
