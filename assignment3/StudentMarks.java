/*1:Write a program to create student class with data members rollno, marks1,mark2,mark3.
Accept data (acceptInfo()) and display  using display member function.
Also display total,percentage and grade.*/
package Class;

public class StudentMarks {
	private int rollno;
	private int mark1,mark2,mark3;
	private int total;
	private double percentage;
	
	public void acceptInfo(int rollno, int mark1, int mark2, int mark3) 
	{
		
		this.rollno = rollno;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	public void Display()
	{
		System.out.println(rollno+" "+mark1+" "+mark2+" "+mark3);
		total= (mark1+mark2+mark3);
		percentage = (total/300.00)*100;
		
		System.out.println("Total::"+total+"  Percentage:: "+percentage);
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		if(percentage>=90) 
		{
			System.out.println("A grade");
		}
		else if(percentage>=70 && percentage<90 ) 
		{
			System.out.println("B grade");
		}
		else if(percentage>=50 && percentage<70 ) 
		{
			System.out.println("C grade");
		}
		else if(percentage>=40 && percentage<50 ) 
		{
			System.out.println("D grade");
		}
		else
		{
			System.out.println("Fail");
		}
		System.out.println("-*-*-*-*-*-*-*-*--END--*-*-*-*-*-*-*--*-*-*-*-*-*-*-");
	}

}
