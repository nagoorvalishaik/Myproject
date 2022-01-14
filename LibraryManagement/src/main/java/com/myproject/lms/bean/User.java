package com.myproject.lms.bean;

public class User{

	private int userId;
	/**
	 * @param userId
	 * @param userName
	 * @param gender
	 * @param branch
	 * @param designation
	 * @param year
	 */
	private String password=null;
	public User(int userId, String userName, String gender, String branch, String designation, int year,String pasword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.branch = branch;
		this.designation = designation;
		this.year = year;
		this.password=password;
	}
	
	private String userName;
	private String gender;
	private String branch;
	private String designation;
	private int year;
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", userName=" + userName + ", gender=" + gender
				+ ", branch=" + branch + ", designation=" + designation + ", year=" + year + "]";
	}
	
	

	
	
}
