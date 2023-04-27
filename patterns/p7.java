/*
            1 
          2 3 2 
        3 4 5 4 3 
      4 5 6 7 6 5 4 
    5 6 7 8 9 8 7 6 5 
 */

package patterns;

import java.util.Scanner;

public class p7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number::");
		int n= sc.nextInt();
		int a=0;
		
		for(int i=0; i<n; i++)
		{
			int c=i+1;
			
			for(int k=n; k>=i; k--)
			{
				System.out.print("  ");
			}
			
			for(int j=0; j<=i; j++)
			{
				System.out.print(c+" ");
				a=c++;
			}
			
			for(int j=1; j<=i; j++)
			{
				a--;
				System.out.print(a+" ");
			}
			
			System.out.println();
		}
}
}
