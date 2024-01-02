package com;

import java.io.Serializable;

public class user implements Serializable{//clas ==>參考資料庫的table
	//field
	private String name;
	private String password;
	public user(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static String getText() {
		// TODO Auto-generated method stub
		return null;
	}
	
}