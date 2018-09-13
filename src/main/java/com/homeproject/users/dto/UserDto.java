package com.homeproject.users.dto;

import java.util.List;

import com.homeproject.users.entity.Users;

public class UserDto {
	

 private 	List<Users> userList;
 
 
 private  String appName="Users Project";

public String getAppName() {
	return appName;
}

public void setAppName(String appName) {
	this.appName = appName;
}

/**
 * @return the userList
 */
public List<Users> getUserList() {
	return userList;
}

/**
 * @param userList the userList to set
 */
public void setUserList(List<Users> userList) {
	this.userList = userList;
}



 
 
 
 


}
