package usr2;

import java.util.Scanner;

public class booktester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		book book1=new book();
		//book1.acceptData(100, "naruto", "tazaki",500.50);
	    System.out.println("enter details of book 1) id 2)book name 3) author name 4)book price");
	    book1.acceptData(sc.nextInt(), sc.next(),sc.next(),sc.nextDouble());
		book1.display();
		System.out.println("update the name of book :");
		book1.setname(sc.next());
		System.out.println("enter new price of book :");
		book1.setprice(sc.nextDouble());
		
		book1.display();
		System.out.println("updated name is :"+book1.getname());
		System.out.println("updated price of "+book1.getname()+" is :"+book1.getprice());
		sc.close();
		
	}

}
