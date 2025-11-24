package com.tech.spring.rest.restfulwebservice.user;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.util.Date;



public class User {

	@Size(min=3,message="Name should have minimum of 3 characters") //all the validations are present in java validation api inside javax.
	private String name;
	private Integer id;
	@Past(message="Birth date should be future date")
	private Date birthDate;
	
	public User(Integer id, String name, Date birthDate) {
		super();
		this.name = name;
		this.id = id;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", birthDate=" + birthDate + "]";
	}
	
	
	
}
