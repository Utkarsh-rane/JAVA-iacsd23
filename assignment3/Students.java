/*7:Create Student class with rollno,name address.
Write business logic for auto incrment of rollno(don't accept roll no from user)
Write parameterised constr for accepting name and address only
Write getter and setter and display function
7.1 Test Student class by creating  5 diff object.and display aal details(chk rollno created automatically)
7.2 Create an array of 5 students and show only names 
*/
package Class;

public class Students {
    private String name;
    private String city;
    private int rollno;
    private static int rollcount;
	
    static
	{
		
		rollcount=100;
		
	}
    public Students(String name, String city) {
    
    	rollcount++;
    	this.rollno =rollcount;
		this.name = name;
		this.city = city;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRollno() {
		return rollno;
	}
	public void displaystd()
	{
		System.out.println(rollno+" "+name+" "+city);
	}
	
    
}
