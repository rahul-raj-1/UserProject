package com.homeproject.users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	
@Id
@Column(name="ID")
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;


@Column(name="NAME")
private String name;


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}





}
