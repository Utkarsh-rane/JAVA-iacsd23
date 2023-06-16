package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Course;

public class FindByCourse {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) // static method ---> cls loading ---> static init block --> singleton
												// instance of SF
		{
			StudentDaoImpl dao = new StudentDaoImpl();
			System.out.println("Enter course ");
			dao.coursedetails(Course.valueOf(sc.next().toUpperCase())).forEach(System.out::println);
			
		}  //sf.close() --> clean up DB connection pool!
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
