package org.jspider.hibernateApp;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Dao 
{
	public static void main(String[] args) 
	{
    Course c1 = new Course();
    c1.setCourse_name("Java");
    
    Course c2 = new Course();
    c2.setCourse_name("J2EE");
    
    Course c3 = new Course();
    c3.setCourse_name("Hibernate");
    
    Course c4 = new Course();
    c4.setCourse_name("Spring");
    
    List<Course>courselist = new ArrayList<Course>();
    courselist.add(c1);
    courselist.add(c2);
    courselist.add(c3);
    courselist.add(c4);
    
    Student s1 = new Student();
    s1.setStudent_name("Deepak-Tiwari");
    s1.setListofcourses(courselist);
    
    Student s2 = new Student();
    s2.setStudent_name("Bala Ji");
    s2.setListofcourses(courselist);
    
    Student s3 = new Student();
    s3.setStudent_name("Manish");
    s3.setListofcourses(courselist);
    
    Student s4 = new Student();
    s4.setStudent_name("Rohit");
    s4.setListofcourses(courselist);
    
    Configuration conf = new Configuration();
    conf.configure();
    SessionFactory sef = conf.buildSessionFactory();
    Session ses = sef.openSession();
    Transaction tran = ses.beginTransaction();
    ses.save(s1);
    ses.save(s2);
    ses.save(s3);
    ses.save(s4);
    tran.commit();
    ses.close();
	}
}
