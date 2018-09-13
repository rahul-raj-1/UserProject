package com.homeproject.users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;

@Entity
@Table(name="USERS")
public class Users {
	
@Id
@Column(name="USER_ID")
@GeneratedValue(strategy = GenerationType.AUTO)
private Long userId;


@Column(name="NAME")
private String userName;

@Column(name="ACTIVE")
private Long isActive;


public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public Long getIsActive() {
	return isActive;
}

public void setIsActive(Long isActive) {
	this.isActive = isActive;
}




}
