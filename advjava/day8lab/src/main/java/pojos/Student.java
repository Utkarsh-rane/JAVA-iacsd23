package pojos;
/*
 * emp_id(PK) ,first_name,last_name,email(unique),password
 * ,join_date,emp_type(full_time/part_time/contract...),salary

 */

import java.time.LocalDate;
import javax.persistence.*;
@Entity //mandatory
@Table(name = "students")
public class Student {
//Mandatory requirement : unique ID prop : Serializable
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "std_id")
	private Integer studentId;
	@Column(name = "first_name",length = 20)
	private String firstName;
	@Column(name = "last_name",length = 20)
	private String lastName;
	@Column(length = 50,unique = true)
	private String email;
	@Column(length = 20,nullable = false) 
	private String password;
	private LocalDate Dob;
	@Enumerated(EnumType.STRING) 
	@Column(length = 20)
	private Course course;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String firstName, String lastName, String email, String password, LocalDate dob, Course course) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		Dob = dob;
		this.course = course;
	}
	


	public Student(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	//all setters n getters
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDob() {
		return Dob;
	}
	public void setDob(LocalDate dob) {
		Dob = dob;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", Dob=" + Dob + ", course=" + course + ", salary=" + "]";
	}
	
}
