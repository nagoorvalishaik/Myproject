package com.myproject.lms.bean;

public class Student{

	private int studentId;
	private String studentName;
	private String gender;
	private String branch;
	private int year;
	private int semester;
	
	/**
	 * @param studentId
	 * @param studentName
	 * @param gender
	 * @param branch
	 * @param year
	 * @param semester
	 */
	public Student(int studentId, String studentName, String gender, String branch, int year, int semester) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.gender = gender;
		this.branch = branch;
		this.year = year;
		this.semester = semester;
	}
	
	public Student()
	{
		
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	
}
