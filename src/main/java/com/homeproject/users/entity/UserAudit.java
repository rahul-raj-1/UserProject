package com.homeproject.users.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@Table(name="USER_AUDIT")
public class UserAudit  {

	@Id
	@Column(name="AUDIT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user_audit")
	@SequenceGenerator(name="seq_user_audit", sequenceName = "seq_user_audit")
     private Long userAuditId;
	
	@Column(name="USER_ID")
	private Long userId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ACTIVE")
	private Long isActive;
	
	@Column(name="MOD_TIME")
	private LocalDate modTime;

	
	
	
	public Long getUserAuditId() {
		return userAuditId;
	}


	public void setUserAuditId(Long userAuditId) {
		this.userAuditId = userAuditId;
	}


	public Long getUserId() {
		return userId;
	}

	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Long getIsActive() {
		return isActive;
	}

	public void setIsActive(Long isActive) {
		this.isActive = isActive;
	}

	
	public LocalDate getModTime() {
		return modTime;
	}

	public void setModTime(LocalDate modTime) {
		this.modTime = modTime;
	}
	
	
}
