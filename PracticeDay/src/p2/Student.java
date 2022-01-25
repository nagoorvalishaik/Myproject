package p2;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;

@SuppressWarnings("deprecation")
@Entity
@Table(name="Student")
@DiscriminatorValue("S")
public class Student extends Person{
	
	private String course;
	private int fees;
	
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	/**
	 * @param course
	 * @param fees
	 */
	public Student(String course, int fees) {
		this.course = course;
		this.fees = fees;
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [course=" + course + ", fees=" + fees + "]";
	}
	
	
	
}
