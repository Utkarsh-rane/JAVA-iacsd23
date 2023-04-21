package usr2;

import java.util.Scanner;

public class pointTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Point p=new Point();
		System.out.println("enter values for X and Y :");
		p.acceptPoints(sc.nextDouble(),sc.nextDouble());
		p.display();
		System.out.println("enter values to modfie X :");
		p.setX(sc.nextDouble());
		System.out.println("modified X value is"+p.getx());
		System.out.println("enter values to modfie Y :");
		p.sety(sc.nextDouble());
		System.out.println("modified Y value is"+p.gety());
		p.display();
		sc.close();

	}

}
