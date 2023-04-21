package usr2;

import java.util.Scanner;

public class complexTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value for real :");
		int realnum=sc.nextInt();
		System.out.print("enter value for imaginary :");
		int imaginarynum=sc.nextInt();
		complexNumber cn=new complexNumber();
		cn.AcceptComlexNum(realnum, imaginarynum);
        cn.Display();
        System.out.println("enter new value for real: ");
        cn.setReal(sc.nextInt());
        System.out.println("updated value for real is :"+cn.getReal());
        
        System.out.println("enter new value for imaginary: ");
        cn.setimaginary(sc.nextInt());
        System.out.println("updated value for real is :"+cn.getimaginary());
        cn.Display();
        
        sc.close();
        
        

	}

}
