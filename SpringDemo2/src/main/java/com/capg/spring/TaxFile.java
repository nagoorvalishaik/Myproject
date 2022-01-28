package com.capg.spring;

public class TaxFile {

	private int fileNumber;

	public TaxFile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaxFile(int fileNumber) {
		super();
		this.fileNumber = fileNumber;
	}

	public int getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(int fileNumber) {
		this.fileNumber = fileNumber;
	}

	@Override
	public String toString() {
		return "TaxFile [fileNumber=" + fileNumber + "]";
	}
	
	
}