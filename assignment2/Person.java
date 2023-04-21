package usr2;
/*3. Create a class Person with data members as name, age, city.
 *  Write getters and setters for all the data 
members. Also add the display function. Create Default and Parameterized constructors. 
Create the object of this class in main method and invoke all the methods in that class.
*/
public class Person {
   private int age;
   private String name, city; 
   
   public Person() {
	   this.age=00;
	   this.name=null;
	   this.city=null;
   }
   public Person(int age, String name, String city) {
	   this.age=age;
	   this.name=name;
	   this.city=city;
   }
   public void display()
   {
	   System.out.println("-----details of person----");
	   System.out.println("age of the person :"+age);
	   System.out.println("name of the person :"+name);
	   System.out.println("city of the person :"+city);
   }
   public void setAge(int age)
   {
	   this.age=age;
   }
   public int getAge()
   {
	   return age;
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
}
