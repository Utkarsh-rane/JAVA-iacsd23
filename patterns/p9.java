package patterns;

import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number::");
			int n= sc.nextInt();
			int a=0;
      for(int i=0; i<n;i++)
      {
    	  for(int j=0;j<=n;j++)
    	  {
    		 if( j==a || j==n-1 || j==0) {
    			 System.out.print("* ");
    			
    		 }
    		else
    			 System.out.print("  ");
    	  }
    	  a++;
    	  System.out.println();
      }
	}

}
