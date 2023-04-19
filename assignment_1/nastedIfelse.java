// 13:Write a program to find greatest of three numbers using nested if-else
import java.util.Scanner;
public class nastedIfelse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 1st number :");
        int a=sc.nextInt();
		System.out.print("enter 2nd number :");
        int b=sc.nextInt();
		System.out.print("enter 3rd number :");
        int c=sc.nextInt();
        if(a>b && a>c)
    		System.out.println(a+" is greatest number ");
    	else if(b>c && b>a)
    		System.out.println(b+" is greatest number ");
    	else
    		System.out.println(c+" is greatest number ");
    	}
    }
      
	


