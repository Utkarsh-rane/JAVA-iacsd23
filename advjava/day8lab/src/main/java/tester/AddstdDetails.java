package tester;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Course;
import pojos.Student;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;
public class AddstdDetails {

	public static void main(String[] args) {
	try(SessionFactory sf=getFactory();
			Scanner sc=new Scanner(System.in))//invoking static method -->cls loading -->static init block
	{
		StudentDaoImpl dao=new StudentDaoImpl();
		// firstName,  lastName,  email,  password,  confirmpassword, joindate,  type,  salary
		System.out.println("enter details: firstName,  lastName,  email,  password, LocalDate dob,  course ");
		Student newStudent=new Student(sc.next(), sc.next(), sc.next(), sc.next(), LocalDate.parse(sc.next()), Course.valueOf(sc.next().toUpperCase()));
		System.out.println(dao.insertStudentDetails(newStudent));
		System.out.println("hib up n running !!!"+sf);
	}//sf.close()-->cleaning up DBCP(db connection pool)
	catch (Exception e) {
		e.printStackTrace();
	}
	
	}//end of main

}
