package com.demo.bean;

import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

public class User {
	private Map<String,Object> userMap=new HashedMap();
    public Map<String, Object> getUserMap() {
		return userMap;
	}

	public void setUserMap(Map<String, Object> userMap) {
		this.userMap = userMap;
	}

	private Integer id;

    private String name;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {   	
        this.id = id;
        userMap.put("id", id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {   	
        this.name = name == null ? null : name.trim();
        userMap.put("name", name);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
        userMap.put("password", password);
        
    }
}