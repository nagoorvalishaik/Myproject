package com.capg.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {

	private int accountNumber;
	private String accountName;
	private int balance;
	private String branchName;
	private String state;
	private String country;
	
	
	private Policy p;
	private TaxFile file;
	private List<Stocks> stocks;
	
	
	public Account(Policy p)
	{
		this.p=p;
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, String accountName, int balance, String branchName, String state, String country) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		this.branchName = branchName;
		this.state = state;
		this.country = country;
	}
	
	
	
	public TaxFile getFile() {
		return file;
	}
	
	public void setFile(TaxFile file) {
		this.file = file;
	}
	public Policy getP() {
		return p;
	}
	public void setP(Policy p) {
		this.p = p;
	}
	public int getaccountNumber() {
		return accountNumber;
	}
	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result + balance;
		result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (balance != other.balance)
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance
				+ ", branchName=" + branchName + ", state=" + state + ", country=" + country + "]";
	}

	
	public void doInitCode() {
		System.out.println("init");
	}
	public void doWindupCode() {
		System.out.println("destroy method");
	}
	
	public List<Stocks> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stocks> stocks) {
		this.stocks = stocks;
	}
	
}