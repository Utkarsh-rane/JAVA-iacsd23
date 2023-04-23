package Tester;

import java.util.Scanner;

import Class.StudentMarks;

public class StudentsMarksTeaster {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m1, m2, m3, Rollno;
		System.out.println("ENter the RollNo::");
		Rollno = sc.nextInt();
		System.out.println("ENter the Mark1::");
		m1 = sc.nextInt();
		System.out.println("ENter the Mark2::");
		m2 = sc.nextInt();
		System.out.println("ENter the Mark3::");
		m3 = sc.nextInt();
		
		StudentMarks stu = new StudentMarks();
		  stu.acceptInfo(Rollno,m1, m2, m3);
		System.out.println("Student Rollno, Marks Total And Percentage is ");
		  stu.Display();
		  
	}

}
