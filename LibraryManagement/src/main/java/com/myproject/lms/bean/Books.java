package com.myproject.lms.bean;

public class Books {
	
	/**
	 * @param bookId
	 * @param bookName
	 * @param bookCategory
	 * @param authorName
	 * @param yearOfPublication
	 */
	public Books(int bookId, String bookName, String bookCategory, String authorName, int yearOfPublication) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCategory = bookCategory;
		this.authorName = authorName;
		this.yearOfPublication = yearOfPublication;
	}
	private int bookId;
	private String bookName;
	private String bookCategory;
	private String authorName;
	private int yearOfPublication;

	
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	
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
	
	public Books() {}
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
				+ authorName + ", yearOfPublication=" + yearOfPublication + "]";
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((bookCategory == null) ? 0 : bookCategory.hashCode());
		result = prime * result + bookId;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + yearOfPublication;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (bookCategory == null) {
			if (other.bookCategory != null)
				return false;
		} else if (!bookCategory.equals(other.bookCategory))
			return false;
		if (bookId != other.bookId)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (yearOfPublication != other.yearOfPublication)
			return false;
		return true;
	}
	
	
	
	
	
}
