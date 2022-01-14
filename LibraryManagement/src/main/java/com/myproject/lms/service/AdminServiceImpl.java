package com.myproject.lms.service;

import com.myproject.lms.Exceptions.UserDoesnotExistsException;
import com.myproject.lms.bean.Admin;
import com.myproject.lms.bean.Books;
import com.myproject.lms.bean.User;
import com.myproject.lms.dbo.AdminOperationImpl;
import com.myproject.lms.dbo.AdminOperations;

public class AdminServiceImpl implements AdminService{

		AdminOperations ad=new AdminOperationImpl();

		public boolean addUser(User user) {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean deleteUser(int userid) throws UserDoesnotExistsException {
			// TODO Auto-generated method stub
			return false;
		}

		public User getUser() throws UserDoesnotExistsException {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean addBook(Books book) {
			// TODO Auto-generated method stub
			return false;
		}
	
}
