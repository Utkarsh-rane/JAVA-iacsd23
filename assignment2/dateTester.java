package usr2;

import java.util.Scanner;

public class dateTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in formate day/month/year");
		Date d = new Date();
		d.Display();
		System.out.println("Enter date in formate day/month/year=");
		d = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
		d.Display();
		System.out.println("modifie date in formate day/month/year=");
		d.setDay(sc.nextInt());
		d.setMonth(sc.nextInt());
		d.setYear(sc.nextInt());
		System.out.println("modified day =" + d.getDay());
		System.out.println("modified month =" + d.getMonth());
		System.out.println("modified year =" + d.getYear());
		d.Display();
		sc.close();
	}

}
