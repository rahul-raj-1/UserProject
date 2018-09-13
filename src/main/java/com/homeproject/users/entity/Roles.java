package com.homeproject.users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Roles {

@Id
@Column(name = "ROLE_ID")
@GeneratedValue(strategy = GenerationType.AUTO)
private Long roleId;

@Column(name = "NAME")
private String roleName;

public Long getRoleId() {
	return roleId;
}

public void setRoleId(Long roleId) {
	this.roleId = roleId;
}

public String getRoleName() {
	return roleName;
}

public void setRoleName(String roleName) {
	this.roleName = roleName;
}



}
