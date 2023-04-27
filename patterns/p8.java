package patterns;

import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number::");
			int n= sc.nextInt();
			int a;
			for (int i=0;i<=n;i++)
			{
				
				for(int k=n; k>i; k--)
				{
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
	}

}
