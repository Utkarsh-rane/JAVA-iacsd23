package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Course;

public class UpdateCourse {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); 
				Scanner sc = new Scanner(System.in)) 
		{
			StudentDaoImpl dao = new StudentDaoImpl();
			System.out.println("Enter id  and new course");
			System.out.println(dao.updatecourse(sc.nextInt(), Course.valueOf(sc.next().toUpperCase())));
		}  //sf.close() --> clean up DB connection pool!
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
