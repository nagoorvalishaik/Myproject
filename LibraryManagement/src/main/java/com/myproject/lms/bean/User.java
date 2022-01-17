package com.myproject.lms.bean;

public class User{
	
	private int userId;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String userName;
	private String gender;
	private String branch;
	private String designation;
	private int year;
	private String password;
			
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @param userId
	 * @param userName
	 * @param gender
	 * @param branch
	 * @param designation
	 * @param year
	 * @param password
	 */
	public User(int userId, String userName, String gender, String branch, String designation, int year,
			String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.branch = branch;
		this.designation = designation;
		this.year = year;
		this.password = password;
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", gender=" + gender + ", branch=" + branch
				+ ", designation=" + designation + ", year=" + year + "]";
	}
	
	
	
	
	
	
	
	
	
}
