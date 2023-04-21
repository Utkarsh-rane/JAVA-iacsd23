package usr2;

import java.util.Scanner;

public class personTester {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.display();
		System.out.println("Enter the information of person::");
		Scanner sc = new Scanner(System.in);
	    p1 = new Person(sc.nextInt(),sc.next(),sc.next());
	    
	    p1.display();
	    System.out.println("Upgrate the age of the person :");
	    p1.setAge(sc.nextInt());
	    System.out.println("updated age of the person :"+p1.getAge());
	
	System.out.println("Upgrate the name of the person :");
    p1.setName(sc.next());
    System.out.println("updated name of the person :"+p1.getName());
    
    System.out.println("Upgrate the city of the person :");
    p1.setCity(sc.next());
    System.out.println("updated city name of the person :"+p1.getCity());
    p1.display();
    sc.close();
    
	}
}
