/*
          1 
        1 2 1 
      1 2 3 2 1 
    1 2 3 4 3 2 1 
  1 2 3 4 5 4 3 2 1 
 */

package patterns;
//Palindrome traingle
/*
     1
    121
   12321
  1234321
 123454321
 */

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number::");
			int n= sc.nextInt();
			int a=1;
			for (int i=1; i<=n; i++)
			{
				for(int k=n; k>=i; k--)
				{
					System.out.print("  ");
				}
				for(int j=1; j<=i; j++)
				{
					System.out.print(j+" ");
				}
				for(int j=i-1; j>=1; j--)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
	}

}
