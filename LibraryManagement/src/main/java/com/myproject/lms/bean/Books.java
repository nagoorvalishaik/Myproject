package com.myproject.lms.bean;

public class Books {
	
	private int bookId;
	private String bookName;
	private String bookCategory;
	private String authorName;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	/**
	 * @param bookId
	 * @param bookName
	 * @param bookCategory
	 * @param authorName
	 */
	public Books(int bookId, String bookName, String bookCategory, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCategory = bookCategory;
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookCategory=" + bookCategory + ", authorName="
				+ authorName + "]";
	}
	
	
	
}
