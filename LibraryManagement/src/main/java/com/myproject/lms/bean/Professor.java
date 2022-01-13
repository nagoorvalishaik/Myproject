package com.myproject.lms.bean;

public class Professor{
	
	
	private int professorId;
	private String professorName;
	private int professorGender;
	private String course;
	
	public int getProfessorId() {
		return professorId;
	}
	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public int getProfessorGender() {
		return professorGender;
	}
	public void setProfessorGender(int professorGender) {
		this.professorGender = professorGender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	@Override
	public String toString() {
		return "Professor [professorId=" + professorId + ", professorName=" + professorName + ", professorGender="
				+ professorGender + ", course=" + course + "]";
	}
	
	
	
}
