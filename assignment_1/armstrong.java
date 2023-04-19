//12:Write a program to check entered number is Armstrong number or not.
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to check its armstrong or not :");
		int n=sc.nextInt();
		int a, b=n,c=0;
		while(b>0)
		{
			a=b%10;
			b=b/10;
			c=c+a*a*a;
		}
		if(n==c)
		{
			System.out.println("number is amstrong");
		}
		else
		{
			System.out.println("number is not amstrong");
		}
		
		
	}

}
