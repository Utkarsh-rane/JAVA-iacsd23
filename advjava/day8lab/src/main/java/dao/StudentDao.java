package dao;

import java.util.List;

import pojos.Course;
import pojos.Student;

public interface StudentDao {
    //add method to insert new emp details
	String insertStudentDetails(Student std);
	Student loginStudent(String email,String password);
	List<Student> coursedetails(Course course);
	String updatecourse(int id,Course course);
}
