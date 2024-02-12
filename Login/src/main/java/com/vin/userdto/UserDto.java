package com.vin.userdto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ass1")
public class UserDto {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Column(name="id")
	private int id;
	@Column(name="user_name")
	private String username;
	@Column(name="user_pass")
	private String password;
	
	
	public UserDto() {
		
	}
	
	public UserDto(String username,String password) {
		super();
		this.username=username;
		this.password=password;
	}
	
	public UserDto(int id,String username,String password) {
		super();
		this.id=id;
		this.username=username;
		this.password=password;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


}
