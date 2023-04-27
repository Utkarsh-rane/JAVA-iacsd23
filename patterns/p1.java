package patterns;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number::");
			int n= sc.nextInt();
			int a=1;
			for (int i=0;i<=n;i++)
			{
				System.out.print(" ");
				for(int j=1; j<=i;j++)
				{
					System.out.print(a+" ");
					a=a+1;
				}
				System.out.println();
			}

	}

}
