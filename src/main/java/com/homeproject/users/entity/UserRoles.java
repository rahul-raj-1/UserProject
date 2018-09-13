package com.homeproject.users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ROLES")
public class UserRoles {


@Id
@Column(name = "USER_ROLE_ID")
@GeneratedValue(strategy = GenerationType.AUTO)
private Long userRoleId;

@Column(name = "USER_ID")
private Long userId;

@Column(name = "ROLE_ID")
private Long roleId;

public Long getUserRoleId() {
	return userRoleId;
}

public void setUserRoleId(Long userRoleId) {
	this.userRoleId = userRoleId;
}

public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public Long getRoleId() {
	return roleId;
}

public void setRoleId(Long roleId) {
	this.roleId = roleId;
}


}
