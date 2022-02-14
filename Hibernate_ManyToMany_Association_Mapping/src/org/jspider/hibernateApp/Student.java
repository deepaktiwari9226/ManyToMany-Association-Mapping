package org.jspider.hibernateApp;
import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="Student_Details")
public class Student  // CHILD CLASS //
{
	@Id
	@GeneratedValue
   private int student_id;
   private String student_name;
   @ManyToMany(cascade=CascadeType.ALL)
   private List<Course> listofcourses;
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public List<Course> getListofcourses() {
	return listofcourses;
}
public void setListofcourses(List<Course> listofcourses) {
	this.listofcourses = listofcourses;
}
}
