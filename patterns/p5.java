/*
          *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
 * * * *   * * * * 
  * * *     * * * 
   * *       * * 
    *         * 
 */

package patterns;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number::");
			int n= sc.nextInt();
			int a;
			for (int i=0;i<=n;i++)
			{
				a=1;
				//System.out.print(" ");
				for(int k=n; k>i; k--)
				{
					System.out.print("  ");
				}
				for(int j=1; j<i*2; j++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
			for(int i=n-1; i>0; i--)
			{
				for(int k=n-1; k>=i; k--)
				{
					System.out.print(" ");
				}
				
				for(int j=1; j<=i; j++)
				{
					System.out.print("* ");
				}
				for(int z=n-1; z>=i; z--)
				{
					System.out.print("  ");
				}
				for(int j=1; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}

	}

}
