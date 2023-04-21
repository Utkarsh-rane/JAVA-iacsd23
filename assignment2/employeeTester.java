package usr2;

import java.util.Scanner;

public class employeeTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee emp=new Employee();
		Date dob=new Date();
		emp.Display();
		
		System.out.println("enter date day/month/year ::");
		 dob=new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		System.out.println("enter employee id and employee name");
		emp=new Employee(sc.nextInt(),sc.next(),dob);
		emp.Display();
		
		System.out.println("enter employee id and employee name");
        emp.AcceptDetails(sc.nextInt(),sc.next(),dob);
        emp.Display();
        sc.close();
	}

}
