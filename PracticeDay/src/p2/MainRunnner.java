package p2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainRunnner {
	
	public static void main(String[] args)
	{
		
		
		Configuration cfg = new Configuration();
		@SuppressWarnings("deprecation")
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
		
		
			Person p=new  Person();
			p.setName("Kiran");
			
			Student s=new Student();
			s.setName("Nagoor");
			s.setCourse("JavaAngular");
			s.setFees(1200);
		
	
			Employee e=new Employee();
			e.setName("Vali");
			e.setDesg("Professor");
			e.setSal(11231);
		
	
		session.save(p);
		session.save(s);
		session.save(e);
		
		t.commit();
	
		session.close();
		System.out.println("Data save complete...!!");
	}
}
