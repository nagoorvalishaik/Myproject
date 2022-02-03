package com.myproject.lms.dbo;

import java.util.List;

import com.myproject.lms.bean.User;

public interface UserFilter {

	public List<User>byCategory(String category);
	public List<User>byBranch(String branch);
	public User byId(int id);
	public List<User>byYear(int year);	
}
