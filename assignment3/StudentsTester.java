package Tester;
import java.util.Scanner;

import Class.Students;
public class StudentsTester {

	public static void main(String[] args) {
		Students[] stu = new Students[5];
		Scanner sc = new Scanner(System.in);
	
	
		for(int i=0; i<stu.length;i++)
		{	
			System.out.println("Enter name And City::");
			stu[i]=new Students(sc.next(), sc.next());
		}
		System.out.println("-------**------");
		for(int i=0; i<stu.length;i++)
		{	
			stu[i].displaystd();
			
	  }
		System.out.println("--------**---------");
		for(int i=0; i<stu.length;i++)
		{
			System.out.println("names of students:"+stu[i].getName());
		}
	}

}
