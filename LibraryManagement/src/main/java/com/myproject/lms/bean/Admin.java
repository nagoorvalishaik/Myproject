package com.myproject.lms.bean;

public class Admin {
	
	private String adminName="admin";
	private String adminPassword="admin@123";

	
	public String getAdminName() {
		return adminName;
	}
	
	public String getAdminPassword() {
		return adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
	}	
	
	
}
