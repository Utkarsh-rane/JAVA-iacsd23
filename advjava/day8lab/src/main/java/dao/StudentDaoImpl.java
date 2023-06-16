package dao;

import pojos.Course;
import pojos.Student;
import static utils.HibernateUtils.getFactory;

import java.io.Serializable;
import java.util.List;

import org.hibernate.*;
public class StudentDaoImpl implements StudentDao {

	@Override
	public String insertStudentDetails(Student std) {
		String mesg="added student details failed";
		Session session =getFactory().openSession();//takes out  conn DBCP wraps it in 
		                                          
		//begin a tx
		Transaction tx=session.beginTransaction();
		try {
		Serializable id=session.save(std);
			tx.commit();
			mesg="added student details with id::"+id;
		}
		catch (RuntimeException e) {
			
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		finally {
			if(session!=null)
				session.close(); //pooled out db cn simply rets to pool!
		}
		return mesg;
	}

	@Override
	public Student loginStudent(String email, String password) {
	String msg="login failed";
	Student std=null;
	String jpql="select s from Student s where s.email=:em and s.password=:pass";
	Session session =getFactory().getCurrentSession();	
	Transaction tx=session.beginTransaction();
	try {
		std=session.createQuery(jpql,Student.class)
				.setParameter("em", email)
				.setParameter("pass",password)
				.getSingleResult();
		if(std.getEmail().equals(email) && (std.getPassword().equals(password)))
			System.out.println("login success");
		else
			System.out.println("login failed");
			
		tx.commit();
		
		msg="sussessfuly login";
	}catch (Exception e) {
	if(tx!=null)
		tx.rollback();
	System.out.println("login failed");
	throw e;
	}
	return std;
	}

	@Override
	public List<Student> coursedetails(Course course) {
		// TODO Auto-generated method stub
		List<Student> std=null;
		String jpql="select s from Student s where s.course=:co";
		Session session =getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			std=session.createQuery(jpql,Student.class)
					.setParameter("co", course)
					.getResultList(); 
			tx.commit();
		}catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return std;
	}

	@Override
	public String updatecourse(int id, Course course) {
		String mesg = " course updation failed!!!!!!!!";
		Student std=null;
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			std=session.get(Student.class,id);
			System.out.println(std.getCourse());
			std.setCourse(course);
			tx.commit();
			mesg="course updation success";
		}catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			
			throw e;
		}
		
		return mesg;
	}
	

	
}
