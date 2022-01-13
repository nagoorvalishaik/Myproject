package com.myproject.lms.bean;

public class Admin {
	
	final String adminName="admin";
	final String adminPassword="admin@123";

	
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
