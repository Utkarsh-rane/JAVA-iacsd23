/*2:Create Employee class with members id(int),name(string),dob(Date).Use above created Date class.
Write default and parameterised constructor in Employee Class.Write accept() function to accept information and 
display() to display emp information*/

package usr2;

public class Employee {
private int id;
private String name;
private Date dob=null;

public Employee() {
	System.out.println("-----default Constructor-----");
	id=00;
	name="xyz";
	this.dob=new Date(1,1,1111);
}

public Employee(int id, String name, Date dob) {
	System.out.println("----- parameterised constructor -----");
	this.id = id;
	this.name = name;
	this.dob = dob;
}
public void Display()
{
	System.out.println("employee id ::"+this.id);
	System.out.println("employee name ::"+this.name);
	dob.Display();
}
public void AcceptDetails(int id, String name, Date dob)
{
	this.id = id;
	this.name = name;
	this.dob = dob;
}

}
