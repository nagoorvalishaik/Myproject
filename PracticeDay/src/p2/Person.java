package p2;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity 
@SequenceGenerator(name="id", initialValue=1100)
@Table(name="Person_Details")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorValue("P")
public class Person
{
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
