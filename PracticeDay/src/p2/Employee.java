package p2;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;


@Entity
@Table(name="Employee")
@DiscriminatorValue("E")

public class Employee extends Person{

	private String desg;
	/**
	 * @param desg
	 * @param sal
	 */
	public Employee(String desg, long sal) {
		this.desg = desg;
		this.sal = sal;
	}
	private long sal;
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(desg, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(desg, other.desg) && sal == other.sal;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	
	
	
}
