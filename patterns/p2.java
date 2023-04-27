/*
 1
 1 2
 1 2 3
 1 2 3 4
 */


package patterns;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number::");
			int n= sc.nextInt();
			
			for (int i=0;i<=n;i++)
			{
				System.out.print(" ");
				for(int j=1; j<=i;j++)
				{
					System.out.print(j+" ");
					
				}
				System.out.println();
			}

	}

}
